public class GenericPair<T, V> {
    T first;
    V second;
    public GenericPair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        var pair1 = new GenericPair<>("age", 18);
        System.out.println(pair1.first);
    }
}