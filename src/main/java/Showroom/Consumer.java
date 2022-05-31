package Showroom;

public class Consumer implements Runnable{
    CarShowroom carShowroom;

    public Consumer(CarShowroom carShowroom) {
        this.carShowroom = carShowroom;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            carShowroom.buyCar();
        }
    }
}
