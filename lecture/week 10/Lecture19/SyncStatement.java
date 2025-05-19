class SpecialInt {
    private int value;

    public SpecialInt(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void increment() {
        value++;
    }
}

class AddThread extends Thread {
    private SpecialInt specialInt;

    public AddThread(SpecialInt specialInt) {
        this.specialInt = specialInt;
    }

    public void run() {
        for (int i = 0; i < 1000000; i++) {
            // synchronized (specialInt) {
                specialInt.increment();
            // }
        }
    }
}

public class SyncStatement {
    public static void main(String[] args) {
        SpecialInt specialInt = new SpecialInt(0);
        Thread t1 = new AddThread(specialInt);
        Thread t2 = new AddThread(specialInt);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){}
        System.out.println(specialInt.getValue());
    }
}