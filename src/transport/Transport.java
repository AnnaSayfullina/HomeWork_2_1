package transport;

/**
 */
public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
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
    public abstract void startMoving();
    public abstract void finishMoving();

    @Override
    public String toString(){
        return "Марка "+ brand + ", модель " + model + ", мощность двигателя " + engineVolume + " л" ;
    }

}
