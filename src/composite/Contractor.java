package composite;

public class Contractor extends Employee {

    public Contractor(String name, String role, double salary) {
        super(name, role, salary);
    }

    @Override
    public double budget() {
        return 0;
    }
}