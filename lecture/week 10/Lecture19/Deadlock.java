class SpecialInt {
    private int value;

    public SpecialInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
    }
}

class AddBothThread extends Thread {
    private SpecialInt specialInt1, specialInt2;

    public AddBothThread(SpecialInt specialInt1, SpecialInt specialInt2) {
        this.specialInt1 = specialInt1;
        this.specialInt2 = specialInt2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Before lock 1 " + this.getId());
            synchronized (specialInt1) {
                System.out.println("Before lock 2 " + this.getId());
                synchronized (specialInt2) {
                    specialInt1.increment();
                    specialInt2.increment();
                }
                System.out.println("After lock 2 " + this.getId());
            }
            System.out.println("After lock 1 " + this.getId());
        }
    }

}

public class Deadlock {
    public static void main(String[] args) {
        SpecialInt specialInt1 = new SpecialInt(0);
        SpecialInt specialInt2 = new SpecialInt(0);
        Thread t1 = new AddBothThread(specialInt1, specialInt2);
        Thread t2 = new AddBothThread(specialInt2, specialInt1); // Oops!
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){}
        System.out.println(specialInt1.getValue());
        System.out.println(specialInt2.getValue());
    }
}
