import java.util.ArrayList;

public class GameOfLife {
  private boolean[][] grid;

  public GameOfLife(boolean[][] initialGrid) {//有参构造方法
      grid = initialGrid;
  }

  public void printGrid() {
    for (int n = 0; n < grid.length; n++){
        for (int m = 0; m < grid[n].length; m++){
            if (grid[n][m]){
                System.out.print('0');//不换行打印
            } else {
                System.out.print('.');
            }
        }
        System.out.println();//换行打印
    }
  }

  public void simulateStep() {
    boolean[][] newgrid = new boolean[grid.length][grid[0].length];

    for (int i = 0; i < grid.length; i++){
        for (int j = 0; j < grid[i].length; j++){
            int up=(i-1 +grid.length)%grid.length; //%取余数。当表达式可能是负数时，才在取模前加上 rows 来“推回”到合法区间
            int down=(i+1 )%grid.length;
            int left=(j-1 +grid[i].length)%grid[i].length;
            int right=(j+1 )%grid[i].length;
            int neighbor = grid[up][left] ? 1:0;
            neighbor += grid[up][j] ? 1:0;
            neighbor += grid[up][right] ? 1:0;
            neighbor += grid[i][left] ? 1:0;
            neighbor += grid[i][right] ? 1:0;
            neighbor += grid[down][left] ? 1:0;
            neighbor += grid[down][j] ? 1:0;
            neighbor += grid[down][right] ? 1:0;

            if (grid[i][j]){
                if ( neighbor==2|| neighbor==3){
                    newgrid[i][j] = true;
                }
            } else {
                if ( neighbor==3){
                    newgrid[i][j] = true;
                }
            } 
            
        }
    }
    grid = newgrid;
  }

  public static void main(String[] args) {
      boolean[][] initialGrid = new boolean[10][10];
      initialGrid[4][5] = true;
      initialGrid[4][6] = true;
      initialGrid[5][4] = true;
      initialGrid[5][5] = true;
      initialGrid[6][5] = true;
      GameOfLife game = new GameOfLife(initialGrid);//调用有参构造方法
      for (int i = 0; i < 10; i++) {
          System.out.println("Before Step " + (i+1));
          game.printGrid();
          System.out.println();
          game.simulateStep();
      }
  }
}