package RoadTrip;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        RoadTrip trip = new RoadTrip();

        trip.addStop("Boston",-71.058884, 42.360081);
        trip.addStop("New York",-74.005974, 40.712776);
        trip.addStop("San Fransisco",-122.419418, 37.774929);

        System.out.println("total trip length in miles: " + trip.getTripLength());
        System.out.println("number of stops: " + trip.getNumOfStops());
        trip.printList();
    }

}
