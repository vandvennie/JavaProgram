package game;

public class GridImpl implements Grid {
  private final int size;
  private final PieceColour[][] grid;

  
  public GridImpl(int size) {
    // Throws IllegalArgumentException if the size of the grid is negative
    if (size<=0){
      throw new IllegalArgumentException("Size must be positive");
    }
    this.size = size;
    grid = new PieceColour [size][size];

    // Initialization this grid
    for (int i=0; i<size; i++){
      for (int j=0; j<size; j++){
        grid[i][j] = PieceColour.NONE;
      }
    }
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  // Returns the piece at the given row and column
  // Should return PieceColour.NONE if the position is empty
  public PieceColour getPiece(int row, int col){
    // Throws IllegalArgumentException if the row or column is out of bounds
    if(row < 0 || row >= size || col < 0 || col >= size){
      throw new IllegalArgumentException (
        String.format("Grid access out of bounds: (%d, %d)", row, col)
      );
    }
    return grid[row][col];
  }

  @Override
  // Sets the piece at the given row and column
  public void setPiece(int row, int col, PieceColour piece){
    // Throws IllegalArgumentException if the piece is out of bounds
    if(row < 0 || row >= size || col < 0 || col >= size){
      throw new IllegalArgumentException (
        String.format("Row or col set out of bounds: (%d, %d)", row, col)
      );
    }

    // Throws IllegalArgumentException if the piece is not a valid colour
    int flag = 0;
    for(PieceColour colour: PieceColour.values()){
      if (piece==colour){
        flag++;
      }
    }
    if (flag==0){
      throw new IllegalArgumentException("This piece is not a valid colour.");
    } 

    grid[row][col] = piece;
  } 

  @Override
  // Returns a copy of the grid
  // Note that this is should be a deep copy
  // Which means that the grid returned should be a new object
  // And there is no way to modify the internal state of this grid
  // by modifying the grid returned
  public Grid copy(){
    GridImpl gridCopy = new GridImpl(size);
    for (int i=0; i<size; i++){
        for (int j=0; j<size; j++){
          gridCopy.grid[i][j] = this.grid[i][j];
        }
    }
    return gridCopy;
  }

  @Override
  public String toString() {
    String visGrid = new String();
    for (int i=0; i<size; i++){
      for (int j=0; j<size; j++){
        if (grid[i][j]==PieceColour.NONE || grid[i][j]== null) {
          visGrid=visGrid+".";
        } else if (grid[i][j]==PieceColour.WHITE){
          visGrid=visGrid+"W";
        } else if (grid[i][j]==PieceColour.BLACK){
          visGrid=visGrid+"B";
        }
      }
      visGrid=visGrid+"\n";
    }
    return visGrid;
  }

}
