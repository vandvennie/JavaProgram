interface A {
    int x = 1;
}

interface B {
    double x = 2.0;
}

interface C extends A, B {
    // What is the type of C.x?
}

public class DuplicateFields {
    public static void main(String[] args) {
        System.out.println(C.x);
    }
}