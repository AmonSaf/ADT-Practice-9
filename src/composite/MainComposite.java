package composite;

public class MainComposite {

    public static void main(String[] args) {

        Employee e1 = new Employee("Amanat", "Dev", 2000);
        Employee e2 = new Employee("Alex", "QA", 1500);

        Department it = new Department("IT");
        it.add(e1);
        it.add(e2);

        Department company = new Department("Компания");
        company.add(it);

        company.show();

        System.out.println("Бюджет: " + company.budget());
        System.out.println("Сотрудников: " + company.count());
    }
}