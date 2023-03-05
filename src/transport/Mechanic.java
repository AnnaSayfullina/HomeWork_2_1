package transport;

import java.util.Objects;

public class Mechanic {
    private final String name;
    private final String surname;
    private final String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return name +" " + surname +"(компания " + company + ")";
    }

    public void doMaintenance (Transport<?> transport){
        if(transport!= null) {
            System.out.println("Механик " + name + " " + surname + " должен провести техобслуживание транспортного средства " + transport.getBrand() + " " + transport.getModel());
        }
    }
    public void repairTransport(Transport<?> transport){
        if(transport!= null) {
            System.out.println("Механик " + name + " " + surname + " должен отремонтировать транспортное средство " + transport.getBrand() + " " + transport.getModel());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return name.equals(mechanic.name) && surname.equals(mechanic.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
