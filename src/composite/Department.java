package composite;

import java.util.*;

public class Department extends Component {

    private String name;
    private List<Component> list = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public void show() {
        System.out.println("Отдел: " + name);
        for (Component c : list) {
            c.show();
        }
    }

    @Override
    public double budget() {
        double sum = 0;
        for (Component c : list) {
            sum += c.budget();
        }
        return sum;
    }

    @Override
    public int count() {
        int total = 0;
        for (Component c : list) {
            total += c.count();
        }
        return total;
    }

    public Employee find(String name) {
        for (Component c : list) {
            if (c instanceof Employee e) {
                if (e.getName().equals(name)) return e;
            } else if (c instanceof Department d) {
                Employee res = d.find(name);
                if (res != null) return res;
            }
        }
        return null;
    }
}