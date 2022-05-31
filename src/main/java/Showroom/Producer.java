package Showroom;

public class Producer implements Runnable {
    CarShowroom carShowroom;

    public Producer(CarShowroom carShowroom) {
        this.carShowroom = carShowroom;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            carShowroom.produceCar();
        }
    }
}
