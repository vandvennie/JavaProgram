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
    boolean[][] previousGrid = grid;
    boolean n1,n2,n3,n4,n6,n7,n8,n9;
    for (int n = 0; n < previousGrid.length; n++){
        for (int m = 0; m < previousGrid[n].length; m++){
            ArrayList<Boolean> nms = new ArrayList<>();
            if (n == 0){  //查找当前cell的8个邻居
                if (m == 0) {
                    n6 = previousGrid[n][m+1];
                    n8 = previousGrid[n+1][m];
                    n9 = previousGrid[n+1][m+1];
                    nms.clear();
                    nms.add(n6);
                    nms.add(n8);
                    nms.add(n9);
                } else if (m == 9){
                    n4 = previousGrid[n][m-1];
                    n7 = previousGrid[n+1][m-1];
                    n8 = previousGrid[n+1][m];
                    nms.clear();
                    nms.add(n4);
                    nms.add(n7);
                    nms.add(n8);
                } else {
                    n4 = previousGrid[n][m-1];
                    n6 = previousGrid[n][m+1];
                    n7 = previousGrid[n+1][m-1];
                    n8 = previousGrid[n+1][m];
                    n9 = previousGrid[n+1][m+1];
                    nms.clear();
                    nms.add(n4);
                    nms.add(n6);
                    nms.add(n7);
                    nms.add(n8);
                    nms.add(n9);                
                }  
            } else if (n == 9) {
                if (m == 0) {
                    n2 = previousGrid[n-1][m];
                    n3 = previousGrid[n-1][m+1];
                    n6 = previousGrid[n][m+1];
                    nms.clear();
                    nms.add(n2);
                    nms.add(n3);
                    nms.add(n6); 
                } else if (m == 9){
                    n1 = previousGrid[n-1][m-1];
                    n2 = previousGrid[n-1][m];
                    n4 = previousGrid[n][m-1];
                    nms.clear();
                    nms.add(n1);
                    nms.add(n2);
                    nms.add(n4);
                } else {
                    n1 = previousGrid[n-1][m-1];
                    n2 = previousGrid[n-1][m];
                    n3 = previousGrid[n-1][m+1];
                    n4 = previousGrid[n][m-1];
                    n6 = previousGrid[n][m+1];
                    nms.clear();
                    nms.add(n1);
                    nms.add(n2);
                    nms.add(n3);
                    nms.add(n4);
                    nms.add(n6);
                }  
            } else if (m == 0 && (n != 0 || n != 9)){
                n2 = previousGrid[n-1][m];
                n3 = previousGrid[n-1][m+1];
                n6 = previousGrid[n][m+1];
                n8 = previousGrid[n+1][m];
                n9 = previousGrid[n+1][m+1];
                nms.clear();
                nms.add(n2);
                nms.add(n3);
                nms.add(n6);
                nms.add(n8);
                nms.add(n9);
            } else if(m == 9 && (n != 0 || n != 9)) {
                n1 = previousGrid[n-1][m-1];
                n2 = previousGrid[n-1][m];
                n4 = previousGrid[n][m-1];
                n7 = previousGrid[n+1][m-1];
                n8 = previousGrid[n+1][m];
                nms.clear();
                nms.add(n1);
                nms.add(n2);
                nms.add(n4);
                nms.add(n7);
                nms.add(n8);
            } else {
                n1 = previousGrid[n-1][m-1];
                n2 = previousGrid[n-1][m];
                n3 = previousGrid[n-1][m+1];
                n4 = previousGrid[n][m-1];
                n6 = previousGrid[n][m+1];
                n7 = previousGrid[n+1][m-1];
                n8 = previousGrid[n+1][m];
                n9 = previousGrid[n+1][m+1];
                nms.clear();
                nms.add(n1);
                nms.add(n2);
                nms.add(n3);
                nms.add(n4);
                nms.add(n6);
                nms.add(n7);
                nms.add(n8);
                nms.add(n9);
                }
            // 修改下一个grid
            if (previousGrid[n][m]){
                int condit1 = 0; //判断：任何有两个或三个活邻居的活细胞都能存活。
                for (boolean a : nms) {
                    if (a){
                        condit1 ++;
                    }
                }
                if (condit1 == 2 || condit1 == 3){
                    grid[n][m] = true;
                } else {
                    grid[n][m] = false;//所有其他活细胞都会在下一代死亡。同样，所有其他死细胞也会保持死亡状态。
                }
            } else {
                int condit2 = 0;//任何有三个活邻居的死细胞都会变成活细胞。
                for (boolean a : nms) {
                    if (a){
                        condit2 ++;
                    }
                }
                if (condit2 == 3){
                    grid[n][m] = true;
                } else {
                    grid[n][m] = false;
                }
            } 
            

        }  
    }
    boolean[][] newGrid = grid;
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