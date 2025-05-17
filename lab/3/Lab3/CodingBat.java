public class CodingBat {
    public int makeChocolate(int small, int big, int goal) {
        while (big > 0 && goal >= 5) {
            goal -= 5;
            --big;
        }
        int used = 0;
        while (small > 0 && goal > 0) {
            --goal;
            --small;
            ++used;
        }
        return goal == 0 ? used : -1;
    }

    public boolean closeFar(int a, int b, int c) {
        boolean bClose = Math.abs(a-b) <= 1;
        boolean cClose = Math.abs(a-c) <= 1;
        boolean bFar = Math.abs(a-b) > 1 && Math.abs(b-c) > 1;
        boolean cFar = Math.abs(a-c) > 1 && Math.abs(c-b) > 1;
        return bClose && cFar || bFar && cClose;
    }
}