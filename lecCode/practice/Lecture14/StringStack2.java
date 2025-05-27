public class StringStack2 {
    private String[] data;
    private int top;

    public StringStack2(int capacity) {
        data = new String[capacity];
        top = 0;
    }

    public void push(String s) {
        if (top == data.length) {
            throw new StackFull("Stack can only hold " + data.length + " elements");
        }
        data[top++] = s;
    }

    public String pop() throws StackEmpty {
        if (top == 0) {
            throw new StackEmpty();
        }
        return data[--top];
    }

    public static void main(String[] args) {
        StringStack2 ss = new StringStack2(5);
        ss.push("Hello");
        ss.push("World");
        ss.push("!");
        ss.push("Hello");
        ss.push("World");
        ss.push("!");
    }
}