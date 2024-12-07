package mutithreading.producerConsumerSharedResource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method starts");
        SharedResource sharedResource = new SharedResource();
        ProducerTask producerTask = new ProducerTask(sharedResource);
        ConsumerTask consumerTask = new ConsumerTask(sharedResource);

        Thread producerThread = new Thread(producerTask);
        Thread consumerThread = new Thread(consumerTask);
        Thread consumerThread2 = new Thread(() -> {
            System.out.println("Consumer Thread : "+Thread.currentThread().getName());
            try {
                sharedResource.consumeItem();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        producerThread.start();
        consumerThread.start();
        consumerThread2.start();
        System.out.println("Main method ends");
    }
}
