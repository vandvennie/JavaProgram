public class GenericStackExample {
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<Integer>(5);
        // GenericStack<String> stringStack = intStack; // compile-time error
        GenericStack<Integer> intStack2 = intStack; // OK
    }
}