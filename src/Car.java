/**Создайте класс «Автомобиль», у которого есть:
 марка (brand),
 модель (model),
 объем двигателя в литрах (engineVolume),
 цвет кузова (color),
 год производства (year),
 страна сборки (country).
 */
public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

}
