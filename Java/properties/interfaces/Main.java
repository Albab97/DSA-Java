package properties.interfaces;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
//        Engine c = new Car();  // possible but we won't be able to access methods which are not in Engine interface. Ex- brake.
        c.start();
        c.acc();
        c.brake();

        Media carMedia = new Car();
        carMedia.stop(); // still calling the only one which is defined in Car class.

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
