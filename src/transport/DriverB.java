package transport;

public class DriverB extends Driver{
    public DriverB(String name, boolean drivingLicense, int experience) {
        super(name, drivingLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории В " + getName() + " остановился");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В " + getName() + " заправляет ТС");
    }
}
