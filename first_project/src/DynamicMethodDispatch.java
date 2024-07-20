class Flowers{

    public void display()
    {
        System.out.println("Some collection of flowers we have:-");
    }

}

class Lilly extends Flowers{
    @Override
    public void display() {

        System.out.println("I am Lilly");
    }

}

class Dahllia extends Flowers{
    @Override
    public void display() {
        System.out.println("I am Dahllia");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Flowers obj= new Flowers();
        obj.display();

        obj= new Lilly();
        obj.display();

        obj= new Dahllia();
        obj.display();

        //in this code when you compile the code, you cannot tell obj will call which object
        //it will only be decided at the runtime, that's why it is called runtime polymorphism here
        
    }
}

