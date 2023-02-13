import transport.*;

public class Main {
    /**
     */
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Иван", true, 10);
        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7, driverB1);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, new DriverB("Олег", true, 11));
        cars[2] = new Car("BMW", "Z8", 3.0, new DriverB("Степан", true, 12));
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4, new DriverB("Михаил", true, 9));

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Hyundai", "County", 3, new DriverD("Кирилл", true, 14));
        buses[1] = new Bus("МАЗ", "104", 4, new DriverD("Алексей", true, 4));
        buses[2] = new Bus("Mercedes-Benz", "Sprinter Classic", 0, new DriverD("Дмитрий", true, 10));
        buses[3] = new Bus("Mercedes", "Classic", 0, new DriverD("Артем", true, 5));

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Камаз", "3553", 5, new DriverC("Петр", true, 8));
        trucks[1] = new Truck("Маз", "555", 2.1, new DriverC("Павел", true, 9));
        trucks[2] = new Truck("Mercedes", "222", 5, new DriverC("Игорь", true, 14));
        trucks[3] = new Truck("УАЗ", "111", 3, new DriverC("Илья", true, 15));

        printAll(cars);
        printAll(buses);
        printAll(trucks);
        trucks[0].pitStop();
        buses[1].bestLapTime();
        cars[2].maxSpeed();
        printInfo(trucks[1]);
        printInfo(cars[0]);
        printInfo(buses[3]);

    }
    public static void printAll(Transport[] transport){
        for (Transport element: transport){
            System.out.println(element);
        }
    }
    public static void printInfo (Transport<?> transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет ТС " + transport.getBrand() + " и будет участвовать в заезде");
    }
}