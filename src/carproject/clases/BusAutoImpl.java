package carproject.clases;
import carproject.interfaces.BusAuto;

public class BusAutoImpl extends Car implements BusAuto{

    public BusAutoImpl(String name) {
        super(name);
    }

    @Override
    public void stopToDropPassangers() {
        System.out.println(this.getName() + "is stoping to drop passangers");
    }
}
