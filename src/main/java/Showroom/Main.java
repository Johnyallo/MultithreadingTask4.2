package Showroom;

public class Main {
    public static void main(String[] args) {
        CarShowroom carShowroom = new CarShowroom();
        Producer producer = new Producer(carShowroom);
        Consumer consumer1 = new Consumer(carShowroom);
        Consumer consumer2 = new Consumer(carShowroom);
        Consumer consumer3 = new Consumer(carShowroom);

        Thread thread = new Thread(producer);
        Thread thread1 = new Thread(consumer1);
        Thread thread2 = new Thread(consumer2);
        Thread thread3 = new Thread(consumer3);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
