package mutithreading.producerConsumerQueue;

public class QueueProducerConsumerMLT {

    public static void main(String[] args) {
        SharedResource sharedBuffer = new SharedResource(10);

        Thread producerThread = new Thread(() -> {
           for (int i=0;i<=500;i++){
               try {
                   sharedBuffer.produce(i);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread consumerThread = new Thread(() -> {
           for (int i=0;i<=500;i++){
               try {
                   sharedBuffer.consume();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread producerThread2 = new Thread(() -> {
            for (int i=0;i<=500;i++){
                try {
                    sharedBuffer.produce(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumerThread2 = new Thread(() ->{
            for (int i=0;i<=500;i++){
                try {
                    sharedBuffer.consume();
                }
                catch (InterruptedException e){
                    throw new RuntimeException();
                }
            }
        });

        consumerThread.start();
        producerThread.start();
        consumerThread2.start();
        producerThread2.start();
    }


}
