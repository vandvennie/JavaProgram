public class StringStack {
    private String[] data;
    private int top;

    public StringStack(int capacity) {
        data = new String[capacity];
        top = 0;
    }

    public void push(String s) {
        if (top == data.length) {
            throw new RuntimeException("Stack is full");
        }
        data[top++] = s;
    }

    public String pop() {
        if (top == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return data[--top];
    }

    public static void main(String[] args) {
        StringStack ss = new StringStack(5);
        ss.push("Hello");
        ss.push("World");
        ss.push("!");
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
    }
}