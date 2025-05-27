public class ObjectStack {
    private Object[] data;
    private int top;

    public ObjectStack(int capacity) {
        data = new Object[capacity];
        top = 0;
    }

    public void push(Object o) {
        data[top++] = o;
    }

    public Object pop() {
        return data[--top];
    }

    public static void main(String[] args) {
        ObjectStack ss = new ObjectStack(5);
        ss.push(3); // autoboxed into Integer
        ss.push("two");
        ss.push(1.0); // autoboxed into Double
        double one = (Double) ss.pop(); // unboxed into double
        System.out.println(ss.pop());
        int three = (Integer) ss.pop(); // unboxed into int
    }
}