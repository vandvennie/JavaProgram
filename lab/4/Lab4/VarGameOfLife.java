public class VarGameOfLife {
    private boolean[][] grid;

    public VarGameOfLife(boolean[][] initialGrid) {
        grid = initialGrid;
    }

    public void printGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]) {
                    System.out.print("O");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public void simulateStep() {
        var newGrid = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int l = (i - 1 + grid.length) % grid.length;
                int r = (i + 1) % grid.length;
                int u = (j - 1 + grid[i].length) % grid[i].length;
                int d = (j + 1) % grid[i].length;
                int neighbors = grid[l][u] ? 1 : 0;
                neighbors += grid[l][j] ? 1 : 0;
                neighbors += grid[l][d] ? 1 : 0;
                neighbors += grid[i][u] ? 1 : 0;
                neighbors += grid[i][d] ? 1 : 0;
                neighbors += grid[r][u] ? 1 : 0;
                neighbors += grid[r][j] ? 1 : 0;
                neighbors += grid[r][d] ? 1 : 0;
                if (grid[i][j]) {
                    if (neighbors == 2 || neighbors == 3) {
                        newGrid[i][j] = true;
                    }
                } else {
                    if (neighbors == 3) {
                        newGrid[i][j] = true;
                    }
                }
            }
        }
        grid = newGrid;
    }

    public static void main(String[] args) {
        var initialGrid = new boolean[10][10];
        initialGrid[4][5] = true;
        initialGrid[4][6] = true;
        initialGrid[5][4] = true;
        initialGrid[5][5] = true;
        initialGrid[6][5] = true;
        var game = new GameOfLife(initialGrid);
        for (var i = 0; i < 10; i++) {
            System.out.println("Before Step " + (i+1));
            game.printGrid();
            System.out.println();
            game.simulateStep();
        }
    }
}