class Parent_two {
    int family_n;
    String caste;

    public Parent_two(int n, String name)
    {
        this.family_n= n;
        this.caste= name;
    }

    public void getDetails(){
        System.out.println("This is the Parent's residence of "+ family_n+" "+ caste);
    }
}

class Child_two extends Parent_two {

    int child_age;
    public Child_two(int n, String name, int age) {
        super(n, name);//we had to use super because the parent class didn't have a parameterless constructor which would have been automatically called otherwise
        this.child_age=age;///own version of the constructor
    }

    @Override
    public void getDetails() {
        System.out.print("Calling the parent's version in child class ");
        super.getDetails();//also wanting the parent's version
        System.out.println("This is the Children's Residence of "+ family_n+ " "+ caste+"and his age is "+child_age);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        Parent_two aanand= new Parent_two(4,"SooryaVansham");
        aanand.getDetails();
        
        Child_two abhay= new Child_two(4,"Abhimanyu",15);
        abhay.getDetails();


    }
}
