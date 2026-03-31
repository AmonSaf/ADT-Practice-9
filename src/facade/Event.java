package facade;

public class Event {

    public void bookHall(String name) {
        System.out.println("Зал забронирован для: " + name);
    }

    public void equipment(String eq) {
        System.out.println("Заказано оборудование: " + eq);
    }
}