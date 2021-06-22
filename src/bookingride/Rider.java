package bookingride;

import java.util.List;

public class Rider extends Person
{

    List<Ride> completedRides;

    Ride currentRide;

    public void createRide(int id, int origin, int dest, int seats){


        currentRide.setId(id);
        currentRide.setOrigin(origin);
        currentRide.setDestination(dest);
        currentRide.setSeats(seats);
        currentRide.setRideStatus(RideStatus.CREATED);
    }

    public void updateRide(int id, int origin, int dest, int seats){

        //if ride is not withdrawn or completed

        //if created

        currentRide.setOrigin(origin);
        currentRide.setDestination(dest);
        currentRide.setSeats(seats);
        currentRide.setRideStatus(RideStatus.CREATED);

        createRide(id, origin, dest, seats);
    }

    public void withdrawRide(){
        //if ride is created
    }

    public int closeRide(){

        return 0;
    }

    public Ride currentRide(){
        return currentRide;
    }
}
