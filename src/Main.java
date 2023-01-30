public class Main {
    /**
     * Создайте объекты для следующих автомобилей:
     * Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
     * Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
     * BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
     * Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
     * Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
     */
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car car4 = new Car("KIA", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai", "Avante", 1.6, " оранжевый", 2016, "Южная Корея");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        System.out.println();
        Car car6 = new Car(null, null, 0, null, 0, null);
        System.out.println(car6);



    }
}