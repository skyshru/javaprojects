package Errors_and_exceptions;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        int a=20;
        boolean flag= true;

        while(flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Provide the correct input");
            int b= sc.nextInt();

            try{
                System.out.println(a/b);
                flag= false;
            }

            catch(Exception e)
            {
                System.out.println(e);
            }


        }

        System.out.println("The program ends here");

    }
}
