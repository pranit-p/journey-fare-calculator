package main;

import java.util.List;

public class Statement {
    List<Ride> RideList;

    Statement(List<Ride> rideList) {
        this.RideList = rideList;
    }

    public double getTotalFare() {
        double totalFare = 0;
        for (Ride ride : RideList) {
            totalFare += ride.getTotalFareForRide();
        }
        return totalFare;
    }

    public double getNumberOfRides() {
        return RideList.size();
    }

    public double getAverageTotalFare() {
        return getTotalFare() / getNumberOfRides();
    }
}
