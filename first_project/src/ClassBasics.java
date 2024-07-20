
class Cars{
    String name;
    int position;

    public void Radio()
    {
        System.out.println(name+ " : I am schupid, Box! Box!");
    }
};

public class ClassBasics {
    public static void main(String[] args) {
        System.out.println("Lets learn about classes!!");

        Cars car= new Cars();// Instantiating a new Cars Object

        //initializing the attributes
        car.name="Ferrari";
        car.position=2;

        System.out.println(car.name+" is in a pole position "+ car.position);
        car.Radio();


    }
}
