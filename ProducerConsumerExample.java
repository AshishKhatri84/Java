import java.util.*;
class SharedBuffer {
    private final int capacity;
    private final LinkedList<Integer> buffer = new LinkedList<>();
    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }
    public synchronized void produce(int item) {
        while (buffer.size() == capacity) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }}
        buffer.add(item);
        System.out.println("Produced: " + item);
        notify();
    }
    public synchronized void consume() {
        while (buffer.isEmpty()) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }}
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notify();
    }}
class Producer implements Runnable {
    private final SharedBuffer buffer;
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }}}}
class Consumer implements Runnable {
    private final SharedBuffer buffer;
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            buffer.consume();
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }}}}
public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(2);
        Thread p = new Thread(new Producer(buffer));
        Thread c = new Thread(new Consumer(buffer));
        p.start();
        c.start();
    }}