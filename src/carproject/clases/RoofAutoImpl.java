package carproject.clases;
import carproject.interfaces.RoofAuto;

public class RoofAutoImpl extends Car implements RoofAuto{
    public RoofAutoImpl(String name) {
        super(name);
    }


    @Override
    public void removeRoof() {
        System.out.println(this.getName() + "is closing the roof");
    }

    @Override
    public void putRoof() {
        System.out.println(this.getName() + "is opening the roof");
    }
}
