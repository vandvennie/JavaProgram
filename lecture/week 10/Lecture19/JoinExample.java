class MyThread extends Thread {
    private int number;

    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("MyThread (" + number + ") running");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new MyThread(i);
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {}
        }
        System.out.println("All threads finished");
    }
}