package facade;

public class Cleaning {

    public void schedule(String room) {
        System.out.println("Уборка запланирована для номера " + room);
    }

    public void now(String room) {
        System.out.println("Уборка выполняется для номера " + room);
    }
}