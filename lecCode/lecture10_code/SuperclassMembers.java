class A {
    public void doSomething() {
        System.out.println("A.doSomething()");
    }
}

class B extends A {
    public void doSomething() {
        System.out.println("B.doSomething()");
    }
}

class C extends B {
    public void doSomething() {
        super.doSomething();
    }
}

public class SuperclassMembers {
    public static void main(String[] args) {
        C c = new C();
        c.doSomething();
    }
}