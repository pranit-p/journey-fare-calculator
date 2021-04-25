package main;

public class Ride {
    private double distance;
    private double time;
    private final int FARE_PER_KM=10;
    private final int FARE_PER_MINUTE=1;
    public Ride(double distance,double time)
    {
        this.distance=distance;
        this.time=time;
    }
    public double getTotalFareForRide()
    {
        return (distance*FARE_PER_KM)+(time+FARE_PER_MINUTE);
    }
}
