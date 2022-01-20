package carproject.clases;

public class Car {

    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void honk(){
        System.out.println(this.name + " HONK!! let me pass");
    }

    public void hitTheGas(){
        System.out.println(this.name + "is accelerating");
    }

    public void hitTheBreaks(){
        System.out.println(this.name+ "is slowing down");
    }
}
