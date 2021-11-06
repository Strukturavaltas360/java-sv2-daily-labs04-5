package day04;

public class Airport {
    public static void main(String[] args) {

        Plane plane = new Plane(3);
        Passenger passenger1 = new Passenger("Molnár Péter","FK452-1234",2);
        plane.addPassenger(passenger1);

        plane.addPassenger(new Passenger("Kiss Éva","FK422-2233",6));
        plane.addPassenger(new Passenger("Kiss Éva","FK422-8233",4));

        if (plane.addPassenger(new Passenger("Kiss Éva","FK422-2273",7)) == false) {
            System.out.println("Sajnos a járat már betelt.");
        }

        System.out.println("A gépen szállított csomagok száma: " + plane.numberOfPackages());
    }
}

