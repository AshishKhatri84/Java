class f1 extends Thread {
    // run method
    public void run() {
        System.out.println("First Thread");
        // yield method
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                Thread.yield();
                System.out.println("First Thread " + i);
            }}
        // sleep method
        try {
            sleep(1000); // Sleep for 1000 milliseconds (1 second)
            System.out.println("sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Second Thread is completed");
    }}

class MyRunnable implements Runnable {
    // run method
    public void run() {
        System.out.println("Runnable Thread");
        // yield method
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                Thread.yield();
                System.out.println("Runnable Thread " + i);
            }}
        // sleep method
        try {
            Thread.sleep(1000);
            System.out.println("sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runnable Thread is completed");
    }}
public class ThreadExample {
public static void main(String[] args) {
    f1 o1 = new f1();
    o1.start();
        // join method
        try {
            o1.join();
            System.out.println("join");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Third Thread is completed");
        
    MyRunnable myRunnable = new MyRunnable();
    Thread o2 = new Thread(myRunnable);
    o2.start();
        // join method
        try {
            o2.join();
            System.out.println("join");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread is completed");
    }}