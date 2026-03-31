package facade;

public class Main {

    public static void main(String[] args) {

        HotelFacade hotel = new HotelFacade();

        hotel.bookAll("Amanat", "Пицца", "101");
        hotel.event("Конференция", "Гость");
        hotel.restaurant("Amanat");

        hotel.cancel("Amanat");
        hotel.cleanNow("101");
    }
}