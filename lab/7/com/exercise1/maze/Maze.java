package com.exercise1.maze;// declaration of a package

public class Maze {
  // Add fields here. They should all be private!
  private int rows;
  private int cols;
  public String[][] maze;

  public Maze(int rows, int cols) {
      // TODO
      this.rows = rows;
      this.cols = cols;
      maze = new String[rows][cols];

  }

  // Puts a wall at the given row and column.
  // Throws a MazeBoundsException if the row or column is invalid.
  public void setWall(int row, int col) throws MazeBoundsException {
      // TODO
      if (row < 0 || row >= rows || col < 0 || col >= cols)  {
        throw new MazeBoundsException("Out of boundary's location: (" + row + ", " + col + ")");
      }
      maze[row][col] = "x";
  }

  // Returns true if there is a wall at the given row and column.
  // Throws a MazeBoundsException if the row or column is invalid.
  public boolean isWall(int row, int col) throws MazeBoundsException {
      // TODO

      if (row < 0 || row >= rows || col < 0 || col >= cols)  {
        throw new MazeBoundsException("Out of boundary's location: (" + row + ", " + col + ")");
      }
      
        return "x".equals(maze[row][col]);
      }
  

  public int getRows() {
    return rows;
  }

  public void setRows(int rows) {
    this.rows = rows;
  }

  public int getCols() {
    return cols;
  }

  public void setCols(int cols) {
    this.cols = cols;
  }
}