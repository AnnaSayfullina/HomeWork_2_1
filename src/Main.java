import transport.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * В приложении для автогонок создайте список всех участвующих автомобилей.
 * В гонках участвуют объекты всех классов: «Легковые автомобили», «Грузовые автомобили» и «Автобусы».
 * Каждый автомобиль проходит техобслуживание. Список механиков должен присутствовать в конструкторе автомобиля.
 * Создайте в классе Transport список механиков.
 * Напишите программу, с помощью которой можно узнать:
 * как зовут водителя авто;
 * какие механики есть у автомобиля.
 */
public class Main {

    public static void main(String[] args) {
        List<Transport> transportList = new ArrayList<>();
        Mechanic mechanic1 = new Mechanic("Иван", "Иванов", "Автосервис");
        Mechanic mechanic2 = new Mechanic("Пётр", "Петров", "Автосервис");
        Mechanic mechanic3 = new Mechanic("Василий", "Васильев", "Ремсервис");
        Mechanic mechanic4 = new Mechanic("Федор", "Федоров", "Ремсервис");
        Mechanic mechanic5 = new Mechanic("Степан", "Степанов", "Пилотсервис");
        Mechanic mechanic6 = new Mechanic("Илья", "Ильин", "Пилотсервис");
        List<Mechanic> mechanicsList1 = new ArrayList<>();
        mechanicsList1.add(mechanic1);
        mechanicsList1.add(mechanic2);
        List<Mechanic> mechanicsList2 = new ArrayList<>();
        mechanicsList2.add(mechanic3);
        mechanicsList2.add(mechanic4);
        List<Mechanic> mechanicsList3 = new ArrayList<>();
        mechanicsList3.add(mechanic5);
        mechanicsList3.add(mechanic6);
        List<Mechanic> mechanicsList4 = new ArrayList<>();
        mechanicsList4.add(mechanic1);
        mechanicsList4.add(mechanic3);
        List<Mechanic> mechanicsList5 = new ArrayList<>();
        mechanicsList5.add(mechanic2);
        mechanicsList5.add(mechanic4);

        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7, new DriverB("Иван", true, 10), mechanicsList1, CarBody.SEDAN);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, new DriverB("Олег", true, 11), mechanicsList2, CarBody.HATCHBACK);
        cars[2] = new Car("BMW", "Z8", 3.0, new DriverB("Степан", true, 12), mechanicsList1, CarBody.SEDAN);
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4, new DriverB("Михаил", true, 9), mechanicsList3, CarBody.CROSSOVER);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Hyundai", "County", 3, new DriverD("Кирилл", true, 14), mechanicsList1, PassengerCapacity.SMALL);
        buses[1] = new Bus("МАЗ", "104", 4, new DriverD("Алексей", true, 4),mechanicsList5, PassengerCapacity.LARGE);
        buses[2] = new Bus("Mercedes-Benz", "Sprinter Classic", 0, new DriverD("Дмитрий", true, 10),mechanicsList3, PassengerCapacity.EXTRA_SMALL);
        buses[3] = new Bus("Mercedes", "Classic", 0, new DriverD("Артем", true, 5), mechanicsList3, PassengerCapacity.MEDIUM);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Камаз", "3553", 5, new DriverC("Петр", true, 8), mechanicsList2, LoadCapacity.N1);
        trucks[1] = new Truck("Маз", "555", 2.1, new DriverC("Павел", true, 9), mechanicsList5, LoadCapacity.N2);
        trucks[2] = new Truck("Mercedes", "222", 5, new DriverC("Игорь", true, 14),mechanicsList4, LoadCapacity.N1);
        trucks[3] = new Truck("УАЗ", "111", 3, new DriverC("Илья", true, 15),mechanicsList1, LoadCapacity.N3);

        printAll(cars);
        printAll(buses);
        printAll(trucks);
        trucks[0].pitStop();
        buses[1].bestLapTime();
        cars[2].maxSpeed();
        printInfo(trucks[1]);
        printInfo(cars[0]);
        printInfo(buses[3]);
        System.out.println(cars[0].getType());
        System.out.println(buses[1].getType());
        System.out.println(trucks[2].getType());
        cars[1].printType();
        buses[0].printType();
        trucks[3].printType();

        cars[0].doDiagnostics();
        trucks[1].doDiagnostics();

//        try {
//            buses[2].doDiagnostics();
//        } catch (TransportTypeException e) {
//            System.err.println(e.getMessage());;
//        }
        System.out.println();
        mechanic3.doMaintenance(cars[0]);
        mechanic2.repairTransport(trucks[1]);

        addToListTransport(transportList, cars);
        addToListTransport(transportList, buses);
        addToListTransport(transportList, trucks);

        findAndPrintNameOfDriver(cars[3]);
        findAndPrintMechanicsOfTransport(buses[0]);
        System.out.println();

        Queue<Transport> transportQueue = new LinkedList<>();
        ServiceStation serviceStation = new ServiceStation(transportQueue);
        serviceStation.addTransportListToQueue(transportList);

        for (Transport element: transportQueue){
            System.out.println(element);
        }
        System.out.println();
        serviceStation.conductTechnicalInspection();
    }
    public static void addToListTransport(List<Transport> list,Transport[] transport) {
        for (Transport element: transport){
            list.add(element);
        }
    }

    public static void findAndPrintNameOfDriver(Transport<?> transport){
        if (transport!= null) {
            System.out.println("Водитель транспортного средства " + transport.getBrand() + " " + transport.getModel() + " " + transport.getDriver());
        }
    }

    public static void findAndPrintMechanicsOfTransport(Transport<?> transport){
        if (transport != null) {
            System.out.print("Механики транспортного средства " + transport.getBrand() + " " + transport.getModel() + " ");
            for (int i = 0; i < transport.getMechanics().size(); i++) {
                if (i == transport.getMechanics().size() - 1) {
                    System.out.println(transport.getMechanics().get(i));
                } else {
                    System.out.print(transport.getMechanics().get(i) + ", ");
                }
            }
        }
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