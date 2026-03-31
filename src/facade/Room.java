package facade;

public class Room {

    public boolean available() {
        System.out.println("Проверка доступности номеров...");
        return true;
    }

    public void book(String guest) {
        System.out.println("Номер забронирован для " + guest);
    }

    public void cancel(String guest) {
        System.out.println("Бронирование отменено для " + guest);
    }
}