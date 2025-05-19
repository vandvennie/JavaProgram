class ProduceConsume {
    private String sharedResource;

    public synchronized void produce(String value) throws InterruptedException {
        while (sharedResource != null) {
            wait();  // wait for the consumer to consume the resource
        }
        sharedResource = value;
        System.out.println("Produced: " + value);
        notify();  // notify the consumer that the resource is ready
    }

    public synchronized void consume() throws InterruptedException {
        while (sharedResource == null) {
            wait();  // wait for the producer to produce the resource
        }
        System.out.println("Consumed: " + sharedResource);
        sharedResource = null;
        notify();  // notify the producer that the resource has been consumed
    }
}

class Produce extends Thread {
    private ProduceConsume produceConsume;

    public Produce(ProduceConsume produceConsume) {
        this.produceConsume = produceConsume;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                produceConsume.produce("value " + i);
            } catch (InterruptedException e) {}
        }
    }
}

class Consume extends Thread {
    private ProduceConsume produceConsume;

    public Consume(ProduceConsume produceConsume) {
        this.produceConsume = produceConsume;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                produceConsume.consume();
            } catch (InterruptedException e) {}
        }
    }
}

public class WaitNotify {
    public static void main(String[] args) {
        ProduceConsume produceConsume = new ProduceConsume();
        Thread t1 = new Produce(produceConsume);
        Thread t2 = new Consume(produceConsume);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){}
    }
}