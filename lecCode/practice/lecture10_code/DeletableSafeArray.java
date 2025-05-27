public class DeletableSafeArray extends BasicSafeArray {
    public DeletableSafeArray(int size) {
        super(size);
    }

    public void delete(int index) {
        if (isValidIndex(index)) {
            for (int i = index; i < size - 1; i++)
                array[i] = array[i + 1];
            size--;
        } else
            System.out.println("Invalid index: " + index);
    }
}