package mutithreading.montitorLock;

public class MonitorLockExample {

    public synchronized void task1() throws InterruptedException{
        System.out.println("inside task1 but before synchronized block");
        Thread.sleep(10000);
    }
    public void task2(){
        System.out.println("task2, but before synchronized block");
        synchronized (this){
            System.out.println("task2, inside synchronized block");
        }
    }
    public void task3(){
        System.out.println("inside task3");
    }
}
