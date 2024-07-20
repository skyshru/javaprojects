class Base{

    int x;

    //A constructor
    public Base(){
        System.out.println("Constructor of the Base Class invoked");
    }
    public void setX( int a)
    {

        this.x=a;
        System.out.println("Setting the value of X as: "+x);
    }

    public void getX()
    {
        System.out.println("I am X:"+x);
    }
}

//deriving the new class
class Derived extends Base{

    String name;

    public void getName(String n)
    {
        this.name= n;
        System.out.println("The name of the "+ x+" sub department is: "+name);
    }
}


public class Inheritance {
    public static void main(String[] args) {

        Base kitty = new Base();

        kitty.setX(6);
        kitty.getX();

        Derived kitten= new Derived();

        kitten.setX(1);
        kitten.getName("Paw");
        //accessing parent class properties
        kitten.setX(7);
        kitten.getX();


    }

}
