package transport;

import java.util.List;

public class Truck extends Transport<DriverC>{
    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverC driver, List<Mechanic> mechanics, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, mechanics);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");

    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " пит - стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Грузовик " + getBrand() + " лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Грузовик " + getBrand() + " максимальная скорость");
    }
    @Override
    public Type getType() {
        return Type.TRUCK;
    }
    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузовик " + getBrand() + " "+ getModel() + " " + loadCapacity);
        }
    }
    @Override
    public String toString() {
        return "Грузовой автомобиль " + super.toString() + ", " + loadCapacity;
    }
    @Override
    public void doDiagnostics() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " прошел диагностику.");
    }

    @Override
    public boolean isTypeOfTransportNeedsInspection() {
        return true;
    }
}
