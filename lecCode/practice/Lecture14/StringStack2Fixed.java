public class StringStack2Fixed {
    private String[] data;
    private int top;

    public StringStack2Fixed(int capacity) {
        data = new String[capacity];
        top = 0;
    }

    public void push(String s) throws StackFull {
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
        StringStack2Fixed ss = new StringStack2Fixed(5);
        try {
            ss.push("Hello");
            ss.push("World");
            ss.push("!");
            ss.push("Hello");
            ss.push("World");
            ss.push("!");
        } catch (StackFull e) {
            System.err.println(e);
        }
    }
}