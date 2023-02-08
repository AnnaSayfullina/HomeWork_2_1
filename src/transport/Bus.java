package transport;

/**
 * Создайте новый класс «Автобус» (Bus), который полностью наследует все параметры класса Transport.
 * Создайте любые 3 объекта для данного класса, по каждому выведите в консоль данные.
 */
public class Bus extends Transport{

    public Bus(String brand, String model, String color, int year, String country, int maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }
}
