public class GenericStack<T> {
    private T[] stack;
    private int top;

    public GenericStack(int size) {
        stack = (T[]) new Object[size];
        top = 0;
    }

    public void push(T item) {
        stack[top++] = item;
    }

    public T pop() {
        return stack[--top];
    }

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<Integer>(5);
        intStack.push(3);
        intStack.push(2);
        intStack.push(1);
        // intStack.push("Hello"); // compile-time error
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
    }
}