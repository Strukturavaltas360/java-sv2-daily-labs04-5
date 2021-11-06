package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    int maxCapacity;
    List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
            if (passengers.size() < maxCapacity) {
                passengers.add(passenger);
                return true;
            }
        return false;
    }

    public int numberOfPackages() {
        int numberOfPackages = 0;
        for (Passenger actual: passengers) {
            numberOfPackages += actual.getPackages();
        }
        return numberOfPackages;
    }
}
