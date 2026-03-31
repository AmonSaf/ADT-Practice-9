package facade;

public class Restaurant {

    public void bookTable(String guest) {
        System.out.println("Стол забронирован для " + guest);
    }

    public void order(String guest, String dish) {
        System.out.println(guest + " заказал(а) " + dish);
    }
}