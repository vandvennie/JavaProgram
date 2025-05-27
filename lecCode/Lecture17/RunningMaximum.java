public class RunningMaximum<T extends Comparable<T>> {
    private T currentMax;


    public RunningMaximum(T initial) {
        currentMax = initial;
    }

    public void addNumber(T number) {
        if (number.compareTo(currentMax) > 0) {
            currentMax = number;
        }
    }

    public T getCurrentMax() {
        return currentMax;
    }

    public static void main(String[] args) {
        RunningMaximum<Integer> runningMax = new RunningMaximum<>(1);
        System.out.println(runningMax.getCurrentMax());
        runningMax.addNumber(5);
        System.out.println(runningMax.getCurrentMax());
        runningMax.addNumber(3);
        System.out.println(runningMax.getCurrentMax());
        runningMax.addNumber(7);
        System.out.println(runningMax.getCurrentMax());
    }
}