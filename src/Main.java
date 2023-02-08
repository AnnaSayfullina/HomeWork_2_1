import transport.Bus;
import transport.Car;
import transport.Transport;
import transport.Truck;

public class Main {
    /**
     */
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0);
        cars[2] = new Car("BMW", "Z8", 3.0);
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Hyundai", "County", 3);
        buses[1] = new Bus("МАЗ", "104", 4);
        buses[2] = new Bus("Mercedes-Benz", "Sprinter Classic", 0);
        buses[3] = new Bus("Mercedes", "Classic", 0);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Камаз", "3553", 5);
        trucks[1] = new Truck("Маз", "555", 2.1);
        trucks[2] = new Truck("Mercedes", "222", 5);
        trucks[3] = new Truck("УАЗ", "111", 3);

        printAll(cars);
        printAll(buses);
        printAll(trucks);


    }
    public static void printAll(Transport[] transport){
        for (Transport element: transport){
            System.out.println(element);
        }
    }
}