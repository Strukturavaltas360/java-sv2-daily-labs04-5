package day04;

public class Passenger {
    String name;
    String ticketID;
    int packages;

    public Passenger(String name, String ticketID, int packages) {
        this.name = name;
        this.ticketID = ticketID;
        this.packages = packages;
    }

    public String getName() {
        return name;
    }

    public String getTicketID() {
        return ticketID;
    }

    public int getPackages() {
        return packages;
    }
}
