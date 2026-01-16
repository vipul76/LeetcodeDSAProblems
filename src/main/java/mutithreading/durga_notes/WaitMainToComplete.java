package mutithreading.durga_notes;

public class WaitMainToComplete {
    public static void main(String[] args) throws InterruptedException {
        MainThread.mt = Thread.currentThread();

        Thread MainThread = new MainThread();
        MainThread.start();

        for (int i=0;i<10;i++){
            System.out.println("executing main thread");
            Thread.sleep(2000);
        }
    }
    static class MainThread extends Thread{
        static Thread mt;
        public void run(){
            try {
                mt.join();
            }catch(InterruptedException e){
                System.out.println("Got Interrupted Exceptions");
            }
            for (int i=0;i<10;i++){
                System.out.println("executing child Thread");
            }
        }
    }
}
