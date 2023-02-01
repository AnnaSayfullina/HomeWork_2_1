package transport;

/**Создайте пакет transport и перенесите туда класс Car.
 В классе  Car уже созданы следующие свойства:
 «Марка», «Модель», «Объем двигателя» в литрах, «Цвет кузова», «Год производства»,  «Страна сборки».
 Нужно добавить классу Car следующие свойства:
 «Коробка передач», «Тип кузова», «Регистрационный номер», «Количество мест», признак «Летняя» или «Зимняя резина».
 При этом следующие поля изменяться не могут:
 «Марка», «Модель», «Год производства», «Страна сборки», «Тип кузова», «Количество мест».
 Соответственно, для этих полей нужно настроить модификатор доступа и создать геттеры.
 Остальные поля изменяться могут — доступ к ним должен осуществляться через геттеры и сеттеры.
 Не забудьте добавить модификаторы доступа для каждого параметра класса, а также для конструкторов.
 Пропишите проверку данных для новых полей класса, а также значения по умолчанию, если параметры пустые, равны null или имеют некорректное значение.
 Добавьте функциональность: метод «сменить шины на сезонные».
 */
public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String carBody;
    private String registrationNumber;
    private final int quantityOfSeats;
    private boolean summerTires;
    private Key key;

    public Key getKey() {
        return key;
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

    public String getCarBody() {
        return carBody;
    }

    public int getQuantityOfSeats() {
        return quantityOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isEmpty()) ? "белый" : color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = (transmission == null || transmission.isEmpty()) ? "автомат" : transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber ==null || registrationNumber.isEmpty() ? "а000аа00" : registrationNumber;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
       this.summerTires = summerTires;
    }

    public void setKey(Key key) {
        if (key == null){
            key = new Key(false,false);
        }
        this.key = key;

    }

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String carBody, String registrationNumber, int quantityOfSeats, boolean summerTires, Key key){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setColor(color);
        this.year = year <= 0 ? 2000 : year;
        this.country = (country == null || country.isEmpty()) ? "default" : country;
        setTransmission(transmission);
        this.carBody = (carBody == null || carBody.isEmpty()) ? "седан" : carBody;
        setRegistrationNumber(registrationNumber);
        this.quantityOfSeats = quantityOfSeats <=0 ? 2 : quantityOfSeats;
        this.summerTires = summerTires;
        setKey(key);
    }
    public void changeTires(int month){
        if ( month == 12 || (month <=2 && month>0)){
            summerTires = false;
        }
        if (month>2 && month<12){
            summerTires = true;
        }
    }
    public String toString(){
        return "Автомобиль " + brand + ", модель " + model + ", объем двигателя " + engineVolume + " л, цвет " +
                color + ", сборка в " + year + " году в стране "+ country+"\n" + "коробка передач " + transmission + ", тип кузова "
                + carBody + ", регистрационный номер " + registrationNumber + ", количество мест " + quantityOfSeats + ", шины " +
                (summerTires? "летние" : "зимние")  + ", ключ - "+ key+"\n";
    }
    /**
     * В классе Car создайте вложенный класс «Ключ» (Key) с параметрами:
     «Удаленный запуск двигателя»,
     «Бесключевой доступ».
     Данные параметры неизменяемые. Добавьте ко всем новым полям проверку данных:
     параметры не должны быть пустыми, не должны быть равны null и должны содержать корректные данные.
     */
    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;
        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart?"удаленный запуск двигателя" : "без удаленного запуска двигателя") + ", " +
                    (keylessAccess? "бесключевой доступ":"бесключевой доступ отсутствует");
        }
    }


}
