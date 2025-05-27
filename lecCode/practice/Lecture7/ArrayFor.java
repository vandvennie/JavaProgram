    public class ArrayFor {
        public static void main(String[] args) {
            int[][] multiples = new int[5][5];
            // for loops go well with arrays
            for (int i = 0; i < multiples.length; i++) {
                for (int j = 0; j < multiples[i].length; j++) { // Notice the use of .length
                    multiples[i][j] = (i + 1) * (j + 1);
                }   
            }
            // So do for-each loops
            for (int[] row : multiples) {
                for (int num : row) {
                    System.out.print(num + "\t");// 这个打印方式是不换号，这里是增加了一个制表符帮助对齐列
                }
                System.out.println();//这个打印方式是换行
            }
        }
    }