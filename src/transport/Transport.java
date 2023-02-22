package transport;

import java.util.List;

/**Добавьте в класс Transport метод «Пройти диагностику».
 * Переопределите данный метод для классов «Легковые автомобили» и «Грузовые автомобили» — объекты данных типов могут
 * проходить диагностику. Объекты класса «Автобусы» диагностику проходить не должны.
 * При выполнении этого метода у автобуса должно выводиться сообщение о том, что автобусам проходить диагностику не нужно.
 * Для этого создайте собственное проверяемое исключение TransportTypeException.
 * Конкретную информацию о причине возникновения исключения следует передать в объекте исключения в виде строки.
 * В методе main вызовите метод «Пройти диагностику» для объектов каждого типа транспорта.
 */
public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic> mechanics;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanics = mechanics;
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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract Type getType();
    public abstract void printType();
    public abstract void doDiagnostics() throws TransportTypeException;

    /**
     * создан метод проверки типа ТС
     */
    public Transport checkTypeOfTransport(){
        if ( getType() != Type.BUS){
            return this;
        } else {
            return null;
        }
    }

    @Override
    public String toString(){
        return "Марка "+ brand + ", модель " + model + ", мощность двигателя " + engineVolume + " л" ;
    }

}
