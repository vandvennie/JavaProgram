```java
package com.exercise1.maze;
// add the package declaration here
import java.util.Random;

public class RandomMaze extends Maze {
  // Creates a random maze with the given number of rows and columns.
  // The wallProbability is the probability that a given cell will be a wall.
  public RandomMaze(int rows, int cols, double wallProbability) {
     // TODO
    super(rows,cols);

    Random random = new Random();
    
    for(int i=0; i<maze.length; i++){
      for (int j=0; j<maze[i].length; j++){
        if(random.nextDouble()< wallProbability){
          try {
            setWall(i,j);
          } catch (MazeBoundsException e) {
            // 出错处理
            maze[i][j]=" ";
            System.err.println("Out of the boundary" + e.getMessage());
          }
        } else {
          maze[i][j]=" ";
        }
      }
    }
    maze[0][0] = " ";  // 起点不是墙
    maze[rows-1][cols-1] = " ";  // 终点不是墙

  }
}




package com.exercise1.maze;

public class MazeBoundsException extends Exception {
  public MazeBoundsException() {
    super();
  }
  public MazeBoundsException(String message){
    super(message);
  }
}




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
```

