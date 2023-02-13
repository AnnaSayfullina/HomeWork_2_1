package transport;

/**
 */
public class Car extends Transport<DriverB> {
    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " пит - стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автомобиль " + getBrand() + " лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " максимальная скорость");
    }
}
