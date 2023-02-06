package transport;

import transport.Car;

public class Main {
    /**
     */
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия",
                "механика", "седан", "y555yy98", 5, true, null, 100);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "автомат",
                "универсал", "щ252щщ12", 0, true, new Car.Key(false,true), 0);
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "механика", "хэтчбек", "m123mm25", 4, false, null, 70);
        Car car4 = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея",
                "автомат", "седан", "в456вв75", 6, true, new Car.Key(true,true), -1);
        Car car5 = new Car("Hyundai", "Avante", 1.6, " оранжевый", 2016, "Южная Корея",
                "автомат", "универсал", "е899ее58", 5, true, new Car.Key(true,false), 120);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Car car6 = new Car("BMW", "5", 3.0, "красный", 2022, "Германия",
                "автомат", "седан", null, 5, false, null, 0) ;

        System.out.println(car6);
        car6.changeTires(5);
        System.out.println("смена шин");
        System.out.println(car6);

    }
}