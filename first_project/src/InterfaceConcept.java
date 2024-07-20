//an interface is like a strict abstract concept, where every method of parent class needs to be overrided or implemented

interface Bike{
    public void speedUp(int increase);
    public void brake( int decrease);
    default public void showTime()
    {
        System.out.println("The time right now is....");
    }

}

class Speed implements Bike{

    int speed_value;
    public Speed(int n)
    {
        this.speed_value =n;

    }

    @Override
    public void speedUp(int increase) {
        speed_value+=increase;
        System.out.println("The speed has now increased to "+ speed_value);
    }

    @Override
    public void brake(int decrease) {
        speed_value-=decrease;
        System.out.println("The speed has now decreased to "+ speed_value);
    }
}

public class InterfaceConcept {
    public static void main(String[] args) {
        Speed Harley= new Speed(20);
        Harley.speedUp(4);
        Harley.brake(12);
        Harley.showTime();


    }
}
