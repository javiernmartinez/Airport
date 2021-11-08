package Airport.employee;

public class PassengerService extends Employee{
    public PassengerService(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public void sellTicket(){
        System.out.println("How many tickets do you want to buy");
    }
}
