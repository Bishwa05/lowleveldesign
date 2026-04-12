package hotel_management_system;

import java.util.List;

public class HotelLocation {
    private String name;
    private Address location;

    public List<Room> getRooms();
}

public class Hotel {
    private String name;
    private List<HotelLocation> locations;

    public boolean addLocation(HotelLocation location);
}
