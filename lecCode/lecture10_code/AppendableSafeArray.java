public class AppendableSafeArray extends BasicSafeArray {
    AppendableSafeArray(int size) {
        super(size);
    }

    public void append(int value) {
        int newSize = size + 1;
        int[] newArray = new int[newSize];
        for (int i = 0; i < size; i++)
            newArray[i] = array[i];
        newArray[size] = value;
        size = newSize;
        array = newArray;
    }

    public static void main(String[] args) {
        AppendableSafeArray a = new AppendableSafeArray(0);
        a.append(1);
        a.append(1);
        a.set(1, 2);
        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));
    }
}