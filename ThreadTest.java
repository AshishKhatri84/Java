class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Thread " + ": Count " + i);
            try {sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (Exception e) {
                System.out.println(e);
            }}}}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
}}