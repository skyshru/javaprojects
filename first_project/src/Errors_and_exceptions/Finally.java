package Errors_and_exceptions;



public class Finally {
    public static int division()
    {
        int a=4;
        int b=2;

        try{
            return a/b;
        }

        catch (Exception e)
        {
            System.out.println("eeeee");
        }
// Before the return statement actually returns the value 2, the finally block is executed.
        finally {
            System.out.println("Cleaning up the resources...");
        }

        return 1;
    }
    public static void main(String[] args) {

        System.out.println(division());

        ///if we write a code for a while loop including break statement, then also the finally block will execute
    }
}
