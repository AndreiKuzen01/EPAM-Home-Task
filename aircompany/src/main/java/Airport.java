import Planes.ExperimentalPlane;
import comporators.PlaneMaxDistanseComparator;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.lang.reflect.Array;
import java.util.*;



public class Airport {
    private List <Plane> planes;


    public Airport(List <Plane> planes) {
        this.planes = planes;
    }

    public List <PassengerPlane> getPassengerPlane() {
        List <Plane> allPlanes = planes; //?
        List <PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : allPlanes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List <MilitaryPlane> getMilitaryPlanes() {
        List <MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List <PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List <MilitaryPlane> getTransportMilitaryPlanes() {
    List <MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    List <MilitaryPlane> militaryPlanes = getMilitaryPlanes();
    for (int i = 0; i < militaryPlanes.size(); i++) {
        if (militaryPlanes.get(i).getType() == MilitaryType.TRANSPORT) {
            transportMilitaryPlanes.add(militaryPlanes.get(i));
        }
    }
    return transportMilitaryPlanes;
    }

    public List <MilitaryPlane> getBomberMilitaryPlanes() {
        List <MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List <MilitaryPlane> militaryPlanes = getMilitaryPlanes();
        for (int i = 0; i < militaryPlanes.size(); i++) {

            if (militaryPlanes.get(i).getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(militaryPlanes.get(i));
            }
        }
        return bomberMilitaryPlanes;
    }

    public List <ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new PlaneMaxDistanseComparator());
        return this;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeed() - o2.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    private void print(Collection <Plane> collection) {
        Iterator<Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }


}
