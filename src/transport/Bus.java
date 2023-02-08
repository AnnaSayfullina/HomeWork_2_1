package transport;

/**
 * Создайте новый класс «Автобус» (Bus), который полностью наследует все параметры класса Transport.
 * Создайте любые 3 объекта для данного класса, по каждому выведите в консоль данные.
 */
public class Bus extends Transport{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public String toString() {
        return "Автобус " + super.toString();
    }
}
