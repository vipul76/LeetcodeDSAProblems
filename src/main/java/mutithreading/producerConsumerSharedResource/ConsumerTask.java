package mutithreading.producerConsumerSharedResource;

public class ConsumerTask implements Runnable{
    SharedResource sharedResource;

    public ConsumerTask(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Consumer Thread : "+Thread.currentThread().getName());
        try {
            sharedResource.consumeItem();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
