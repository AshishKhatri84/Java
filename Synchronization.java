class call1{
    synchronized void display(int n){
        for (int i = 0; i <= 5; i++) {
            System.out.println(n*i);
            try {Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }}}}
class thread1 extends Thread{
    call1 x;
    thread1(call1 x){
        this.x=x;
    } public void run(){
        x.display(5);
    }}
class thread2 extends Thread{
    call1 x;
    thread2(call1 x){
        this.x=x;
    } public void run(){
        x.display(100);
    }}
public class Synchronization{
    public static void main(String[] args) {
        call1 o1= new call1();
        thread1 t1=new thread1(o1);
        thread2 t2=new thread2(o1);
        t1.start();
        t2.start();
    }}