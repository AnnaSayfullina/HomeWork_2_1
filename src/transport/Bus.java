package transport;

/**
 * Создайте новый класс «Автобус» (Bus), который полностью наследует все параметры класса Transport.
 * Создайте любые 3 объекта для данного класса, по каждому выведите в консоль данные.
 */
public class Bus extends Transport<DriverD>{


    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " пит - стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус " + getBrand() + " лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " максимальная скорость");
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }
}
