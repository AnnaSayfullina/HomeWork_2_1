package transport;

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
        return "Механик " + name +" " + surname +"(компания " + company + ")";
    }

    public void doMaintenance (Transport transport){
        System.out.println("Механику " + name + " " + surname +" необходимо провести техобслуживание транспортного средства " + transport.getBrand() + transport.getModel());
    }
    public void repairTransport(Transport transport){
        System.out.println("Механику " + name + " " + surname +" необходимо отремонтировать транспортное средство " + transport.getBrand() + transport.getModel());
    }

}
