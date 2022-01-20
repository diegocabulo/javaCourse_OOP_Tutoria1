package carproject.clases;
import carproject.interfaces.doubleTraction;

public class SuvAutoImpl extends Car implements doubleTraction{
    public SuvAutoImpl(String name) {
        super(name);
    }

    @Override
    public void doubleTractionAction() {
        System.out.println(this.getName() + "activate double traction, time to go anywhere");
    }

}
