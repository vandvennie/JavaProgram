public class SafeArray {
    private int size;
    private int[] array;
    public SafeArray(int size) {
    // todo
        this.size = size;
        this.array = new int[this.size];
    }
    public SafeArray(SafeArray other) {
        this.size = other.size;
        this.array = new int[this.size];
        for (int i=0; i<this.size; i++){
            this.array[i]=other.array[i];
        }
    }

    private boolean isValidIndex(int index) {
    // todo
        return index >= 0 && index < size;

    }
    public int get(int index) {
    // todo
        return isValidIndex(index) ? array[index]: 0;
    }
    public void set(int index, int value) {
    // todo
        if (isValidIndex(index)) {
            array[index] = value;
        } else{
            System.out.println("arguments is invalid");
        }
    }
    public void copyInto(SafeArray other) {
        if (other.size != size){
            System.out.println("sizes of two SafeArray are not same");
        }
        for (int i = 0; i<size; i++){
            other.array[i] = array[i];
        }
    }

    public SafeArray append(int value) {
        SafeArray newArray = new SafeArray(size+1);
        newArray.array[size]=value;
        copyInto(newArray);
        return newArray;
    }

    public void append(SafeArray other) {
        SafeArray lArray = new SafeArray(size+other.size);
        copyInto(lArray);
        for(int i=0; i <other.size; i++){
            lArray.array[i+size]=other.array[i];
        }
        array = lArray.array;
        size = lArray.size;
    }


    public static void main(String[] args) {
    SafeArray arr1 = new SafeArray(3);
    SafeArray arr2 = new SafeArray(3);
    arr1.set(0, 1);
    arr1.set(1, 2);
    arr1.set(2, 3);
    arr2.set(0, 10);
    arr2.set(1, 20);
    arr2.set(2, 30);
    System.out.println(arr2.get(0) + " " + arr2.get(1) + " " + arr2.get(2));
    arr1.copyInto(arr2);
    System.out.println(arr2.get(0) + " " + arr2.get(1) + " " + arr2.get(2));
}
}