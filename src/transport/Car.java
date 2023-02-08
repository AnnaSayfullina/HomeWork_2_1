package transport;

/**
 */
public class Car extends Transport {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
}
