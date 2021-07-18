package comporators;

import Planes.Plane;

import java.util.Comparator;

public class PlaneMaxDistanseComparator implements Comparator<Plane> {
    @Override
    public int compare (Plane o1, Plane o2){
        return o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
    }

}
