package transport;

/**
 */
public class Car extends Transport<DriverB> {
    private CarBody carBody;
    public Car(String brand, String model, double engineVolume, DriverB driver, CarBody carBody) {
        super(brand, model, engineVolume, driver);
        this.carBody = carBody;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString() + ", " + carBody;
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
