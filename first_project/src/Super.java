class Brand
{
    int store_number;

    public Brand()
    {
        System.out.println("Welcome to Our Multi Brand Store");
    }

    //constructor
    public Brand (int num)
    {
        this.store_number=num;
    }

    public void getDetails()
    {
        System.out.println("You are in Section number: "+store_number);
    }

}

class Levi extends Brand{

    String brand_name;

    public  Levi()
    {
        super();
        System.out.println("In case of only default constructor, we woulndt have needed to create it explicitly using super keyword");
    }


    public Levi( int num, String name)
    {

        super(num);
        this.brand_name=name;
    }

    public void displayDetails()
    {
        System.out.println("Thank you for choosing "+brand_name+" as your Outfit choice, you can now exit the  "+store_number+" Section");
    }


}


public class Super {

    public static void main(String[] args) {
        Levi anna= new Levi();
        Levi andy= new Levi(5,"Levi's");
        andy.displayDetails();
    
    }
}
