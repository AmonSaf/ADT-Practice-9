package facade;
public class HotelFacade {

    private Room room = new Room();
    private Restaurant restaurant = new Restaurant();
    private Event event = new Event();
    private Cleaning cleaning = new Cleaning();
    private Taxi taxi = new Taxi();

    // номер + еда + уборка
    public void bookAll(String guest, String dish, String roomNum) {
        if (room.available()) {
            room.book(guest);
            restaurant.order(guest, dish);
            cleaning.schedule(roomNum);
        }
    }

    // мероприятие
    public void event(String name, String guest) {
        event.bookHall(name);
        event.equipment("Проектор");
        room.book(guest);
    }

    // ресторан + такси
    public void restaurant(String guest) {
        restaurant.bookTable(guest);
        taxi.call(guest);
    }

    public void cancel(String guest) {
        room.cancel(guest);
    }

    public void cleanNow(String roomNum) {
        cleaning.now(roomNum);
    }
}