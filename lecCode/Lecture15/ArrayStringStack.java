public class ArrayStringStack implements StringStack {
    private String[] stack;

    public ArrayStringStack() {
        stack = new String[0];
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String top = stack[0];
        String[] newStack = new String[stack.length - 1];
        for (int i = 1; i < stack.length; i++) {
            newStack[i - 1] = stack[i];
        }
        stack = newStack;
        return top;
    }

    @Override
    public void push(String s) {
        String[] newStack = new String[stack.length + 1];
        newStack[0] = s;
        for (int i = 0; i < stack.length; i++) {
            newStack[i + 1] = stack[i];
        }
        stack = newStack;
    }

    @Override
    public boolean isEmpty() {
        return stack.length == 0;
    }

    public static void main(String[] args) {
        ArrayStringStack ss = new ArrayStringStack();
        ss.push("Hello");
        ss.push("World");
        ss.push("!");
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.isEmpty());
        System.out.println(ss.pop());
        System.out.println(ss.isEmpty());
    }
}