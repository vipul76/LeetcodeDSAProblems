package mutithreading.producerConsumerSharedResource;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void addItem(){
        isAvailable = true;
        System.out.println("Item added by: "+Thread.currentThread().getName() +
                " and invoking all threads which are waiting");
        notifyAll();
    }
    public synchronized void consumeItem() throws InterruptedException {
        System.out.println("Consume Item invoked by : "+Thread.currentThread().getName());

        while (!isAvailable){
            System.out.println("Thread : "+Thread.currentThread().getName()+" is waiting now.");
            wait();
        }
        System.out.println("Item consumed by : "+Thread.currentThread().getName());
        isAvailable=false;
    }
}
