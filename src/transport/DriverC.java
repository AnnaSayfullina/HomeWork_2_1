package transport;

public class DriverC extends Driver{

    public DriverC(String name, boolean drivingLicense, int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории С " + getName() + " остановился");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории С " + getName() + " заправляет ТС");
    }
}
