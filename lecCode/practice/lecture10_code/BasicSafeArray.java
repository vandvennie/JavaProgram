public class BasicSafeArray {
    protected int size;
    protected int[] array;

    public BasicSafeArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public int size() {
        return size;
    }

    protected boolean isValidIndex(int index) {
        return index >= 0 && index < size;
    }

    public int get(int index) {
        if (isValidIndex(index))
            return array[index];
        System.out.println("Invalid index: " + index);
        return 0;
    }

    public void set(int index, int value) {
        if (isValidIndex(index))
            array[index] = value;
        else
            System.out.println("Invalid index: " + index);
    }
}