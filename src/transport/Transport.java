package transport;

/**
 * Создайте класс Transport, который содержит в себе следующие параметры:
 * «Марка», «Модель», «Год выпуска», «Страна производства», «Цвет кузова», «Максимальная скорость передвижения».
 * Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска», «Страна производства» не могут изменяться.
 * Параметры «Цвет» и «Скорость» изменяться могут.
 * Для изменяемых параметров добавьте проверку данных: значение должно быть указано корректно, не должно содержать
 * null и не может быть пустым.
 */
public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;

    private int maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, int maxSpeed){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setColor(color);
        this.year = year <= 0 ? 2000 : year;
        this.country = (country == null || country.isEmpty()) ? "default" : country;
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? "белый" : color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed <=0 ? 60 : maxSpeed;
    }
    @Override
    public String toString(){
        return "Марка "+ brand + ", модель " + model + ", цвет " +
                color + ", сборка в " + year + " году в стране "+ country+ ", max скорость " + maxSpeed;
    }

}
