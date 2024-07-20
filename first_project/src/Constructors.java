class Tesla{
    String name;
    int id;

    public Tesla()
    {
        name="Elon";
        id=1;
    }

    //we will do here Method overloading in a constructor
    public Tesla (String n, int i)
    {
        name=n;
        id=i;

    }
}

public class Constructors {

    public static void main(String[] args) {

        Tesla worker= new Tesla();
        System.out.println(worker.name);
        System.out.println(worker.id);

        System.out.println();

        Tesla worker2= new Tesla("Bezoz",3);//here you can see an example od constructor overloading
        System.out.println(worker2.name);
        System.out.println(worker2.id);

    }
}
