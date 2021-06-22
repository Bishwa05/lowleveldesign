package bookingride;

enum RideStatus {IDLE, CREATED, WITHDRAWN, COMPLETED};
public class Ride
{

    int id;
    int origin;
    int destination;
    int seats;
    RideStatus rideStatus;

    private static final int AMT_PER_KM = 20;

    Ride(){

    }

    public int calculateFare(boolean isPriorityRider){

       return 0;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public int getOrigin ()
    {
        return origin;
    }

    public void setOrigin (int origin)
    {
        this.origin = origin;
    }

    public int getDestination ()
    {
        return destination;
    }

    public void setDestination (int destination)
    {
        this.destination = destination;
    }

    public int getSeats ()
    {
        return seats;
    }

    public void setSeats (int seats)
    {
        this.seats = seats;
    }

    public RideStatus getRideStatus ()
    {
        return rideStatus;
    }

    public void setRideStatus (RideStatus rideStatus)
    {
        this.rideStatus = rideStatus;
    }
}
