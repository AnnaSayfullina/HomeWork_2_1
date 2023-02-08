package transport;

public class Truck extends Transport{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");

    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " пит - стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Грузовик " + getBrand() + " лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " максимальная скорость");
    }
    @Override
    public String toString() {
        return "Грузовой автомобиль " + super.toString() ;
    }

}
