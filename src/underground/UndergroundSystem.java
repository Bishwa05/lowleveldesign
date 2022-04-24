package underground;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * https://leetcode.com/problems/design-underground-system/
 * Leetcode 1396. Design Underground System
 *
 */

class Passenger {
    String start;
    String end;
    int t1;
    int t2;

    public Passenger (String start, int t1){
        this.start = start;
        this.t1 = t1;
    }
    public void checkout(String endStation, int t2){
        this.end = endStation;
        this.t2 = t2;
    }
}

class Route {
    int tripCount;
    long totalTime;
    public Route(){
        this.tripCount = 0;
        this.totalTime = 0L;
    }

    double getAverage(){
        return (double) totalTime/tripCount;
    }

    void addTrip(int tripDuration) {
        this.totalTime += tripDuration;
        this.tripCount+=1;
    }
}
public class UndergroundSystem {

    Map<Integer, Passenger> passengerMap;
    Map<String, Route> routeMap;

    public UndergroundSystem() {
        passengerMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        if(!passengerMap.containsKey(id)){
            Passenger traveller = new Passenger(stationName, t);
            this.passengerMap.put(id, traveller);
        }
    }

    public void checkOut(int id, String stationName, int t) {
        if(passengerMap.containsKey(id)){
            Passenger temp = passengerMap.get(id);
            temp.checkout(stationName, t);
            String route = temp.start + "-"+temp.end;
            Route routeDetails = routeMap.getOrDefault(route, new Route());
            routeDetails.addTrip(temp.t2- temp.t1);
            routeMap.put(route, routeDetails);
            passengerMap.remove(id);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        Route routeDetails = routeMap.get(startStation+"-"+endStation);
        return routeDetails.getAverage();
    }

}
