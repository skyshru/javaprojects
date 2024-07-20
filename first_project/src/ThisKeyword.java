class Marks{
    int a=7;///here we initialized it with 7

    public Marks(int a)//but we passed 5 as an argument
    {
        this.a=a;
        System.out.println(a);
    }

    public int getMarks()
    {
        return a;
    }
}

public class ThisKeyword {


    public static void main(String[] args) {

        Marks diva= new Marks(5);
        System.out.println(diva.getMarks());


    }
}
