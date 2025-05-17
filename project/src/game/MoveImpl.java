package game;

public class MoveImpl implements Move {
  private int row, col;

  public MoveImpl() {
  }
  public MoveImpl(int row, int col) {
    this.row = row;
    this.col = col;
  }
  @Override
  public int getRow() {
    return row;
  }

  public void setRow(int row) {
    this.row = row;
  }
  @Override
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
