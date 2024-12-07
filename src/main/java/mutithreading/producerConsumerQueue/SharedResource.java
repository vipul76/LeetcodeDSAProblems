package mutithreading.producerConsumerQueue;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private final Queue<Integer> sharedBuffer;
    private final int bufferSize;

    SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {

        while (sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full, Producer is waiting for Consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Producer: "+item);
        notify();;
    }

    public synchronized void consume() throws InterruptedException {

        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, Consumer is waiting for Producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consume : "+item);
        notify();
    }

}
