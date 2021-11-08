package Airport.employee;

public class Pilot  extends Employee{

    public Pilot(String name, String surname, int salary) {
        super(name, surname, salary);
    }

    public void flyPlane(){
        System.out.println("Traveling to destination");
    }
}
