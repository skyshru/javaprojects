package Errors_and_exceptions;
import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        int [] arr= new int[2];
        arr[0]= 1;
        arr[1]= 2;

        Scanner sc= new Scanner(System.in);
        int divisor= sc.nextInt();
        int index= sc.nextInt();


        try{
            System.out.println("On dividing "+index+"th index with the divisor "+divisor+", we get: "+ arr[index]/divisor);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception Occured, see");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occured, see");
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println("Other exception occured");
            System.out.println(e);
        }

    }
}
