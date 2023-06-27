package abhi.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        Engine car1 = new Car();
//        car1.acc();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        ElectricEngine electric = new ElectricEngine();
//        car.upgradeEngine(electric);
//        car.start();
        NiceCar car1 = new NiceCar(electric);
        car1.start();


    }
}
