package transport;

public class DriverD extends Driver{

    public DriverD(String name, boolean drivingLicense, int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D " + getName() + " остановился");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName() + " заправляет ТС");
    }
}
