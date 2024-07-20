abstract class Furniture{
    public void hindi()
    {
        System.out.println("kese hein aap");

    }

    abstract public void language();

}

//Standard no. 1 for using abstract class, is to override the abstract method

class Table extends Furniture{
    public void language()
    {
        System.out.println("OHAYOO GOZAIMASU");
    }

}

//Standard no. 2 is to declare a class abstract
abstract class Chair extends Furniture{

    @Override
    public void hindi() {
        super.hindi();
        System.out.println("Aur btayein");
    }
}

public class AbstractConcept {
    public static void main(String[] args) {

        Furniture obj2= new Table();//this is also possible as we leanrnt in Dynamic method dispatch
        obj2.hindi();
       // Furniture obj= new Furniture(); also abstract class cannot be instantiated
        Table obj= new Table();
        obj.language();

//Chair obj= new Chair();///this object was also not created because it was abstact class

        }



    }

