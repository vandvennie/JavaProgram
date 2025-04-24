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