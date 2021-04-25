package main;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StatementGeneratorTest {
    @Test
    public void calculateTotalFareForMultipleRide()
    {
        List<Ride> rideList = Arrays.asList(new Ride(12,32),new Ride(32,44),new Ride(11,2));
        System.out.println(new Statement(rideList).getAverageTotalFare());
        System.out.println(new Statement(rideList).getTotalFare());
        System.out.println(new Statement(rideList).getNumberOfRides());
    }

}