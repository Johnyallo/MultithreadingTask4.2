package Showroom;

public class CarShowroom {
    private int cars;

    public synchronized void produceCar() {
        while(cars >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cars++;
        System.out.println("Producer has produced new car.");
        System.out.println("Number of cars: " + cars);
        notifyAll();
    }

    public synchronized void buyCar() {
        System.out.println(Thread.currentThread().getName() + " has come in to showroom.");
        while (cars == 0) {
            System.out.println("There aren't cars. Waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cars--;
        System.out.println(Thread.currentThread().getName() + " has bought new car and has gone out at home.");
        System.out.println("Number of cars: " + cars);
        notify();
    }
}
