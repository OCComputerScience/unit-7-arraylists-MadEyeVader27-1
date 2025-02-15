package RoadTrip;

import java.util.ArrayList;

public class RoadTrip
{
    ArrayList<GeoLocation> destinations = new ArrayList<GeoLocation>();

    public void addStop(String name, double longitude, double latitude)
    {
        GeoLocation stop = new GeoLocation(longitude, latitude, name);
        destinations.add(stop);

    }

    public int getNumOfStops()
    {
        return destinations.size();
    }

    public double getTripLength()
    {
        double totalDistance = 0;
        for(int i = 0; i < destinations.size()-1; i++)
        {
            double distance = destinations.get(i).distanceFrom(destinations.get(i+1));
            totalDistance += distance;
        }

        return totalDistance;
    }

    public void printList()
    {
        for(GeoLocation location : destinations)
        {
            System.out.println(location);
        }
    }



}
