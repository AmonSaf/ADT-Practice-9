package composite;

public class Employee extends Component {

    private String name;
    private String role;
    private double salary;

    public Employee(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void show() {
        System.out.println(name + " (" + role + ") - " + salary);
    }

    @Override
    public double budget() {
        return salary;
    }

    @Override
    public int count() {
        return 1;
    }
}