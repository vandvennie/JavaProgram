package game;

public class MoveImpl implements Move {
  private int row, col;

  public MoveImpl() {
  }
  public MoveImpl(int row, int col) {
    if (row < 0 || col < 0) {
        throw new IllegalArgumentException("Row and column must be positive");
    }
    this.row = row;
    this.col = col;
  }
  @Override
  // Returns the row of the move
  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }
  @Override
  // Returns the column of the move
  public int getCol() {
    return col;
  }

  public void setCol(int col) {
    this.col = col;
  }
  @Override
  public String toString() {
    return "(" + row + "," + col + ")" ;
  }
}
