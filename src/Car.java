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
    /**
     * Дополните созданные ранее конструкторы проверками:
     * Если передана пустая строка или null в поля модель, марка машины и страна сборки,
     то значение по умолчанию — default.
     * Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
     * Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
     * Если год производства ≤0, то значение по умолчанию — 2000.
     * В случае если какая-либо информация не указана по объекту, программа должна выводить в консоль информацию
      о каждом автомобиле и все указанные выше характеристики, подставляя вместо отсутствующей информации
      значение по умолчанию.
     */
    public Car(String brand, String model, double engineVolume, String color, int year, String country){
        if (brand == null || brand.isEmpty()){
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()){
            model = "default";
        }
        this.model = model;
        if (engineVolume <=0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

        if (color == null || color.isEmpty()){
            color = "белый";
        }
        this.color = color;

        if (year<=0){
            year = 2000;
        }
        this.year = year;
        if (country == null || country.isEmpty()){
            country = "default";
        }
        this.country = country;

    }
    public String toString(){
        return "Автомобиль " + this.brand + ", модель " + this.model + ", объем двигателя " + this.engineVolume + " л, цвет " + this.color + ", сборка в " + this.year + " году в стране "+ this.country;
    }

}
