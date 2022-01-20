package carproject;

import carproject.clases.BusAutoImpl;
import carproject.clases.RoofAutoImpl;
import carproject.clases.StandardAutoImpl;
import carproject.clases.SuvAutoImpl;

public class Main {


    public static void main(String[] args) {
        BusAutoImpl happyBus = new BusAutoImpl("Happy Bus");

        StandardAutoImpl happyCar = new StandardAutoImpl("Happy Car");

        RoofAutoImpl happyRoofCar = new RoofAutoImpl("Happy Roof Car");

        SuvAutoImpl happySuvCar = new SuvAutoImpl("Happy SUV Car");

        happyBus.stopToDropPassangers();
        happyCar.honk();
        happyRoofCar.putRoof();
        happySuvCar.doubleTractionAction();
    }
}
