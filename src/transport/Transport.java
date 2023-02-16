package transport;

/**В родительском классе создайте абстрактный метод getType, который необходимо переопределить в классах наследниках.
 В абстрактный класс Transport добавьте абстрактный метод printType, который выводит в консоль либо значение типа
 транспортного средства, либо, если тип транспортного средства не указан, строку вида “Данных по транспортному средству недостаточно”.
 */
public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
    }
    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }
    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract Type getType();
    public abstract void printType();


    @Override
    public String toString(){
        return "Марка "+ brand + ", модель " + model + ", мощность двигателя " + engineVolume + " л" ;
    }

}
