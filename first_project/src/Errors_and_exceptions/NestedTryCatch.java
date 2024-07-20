package Errors_and_exceptions;

public class NestedTryCatch {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=0;

        try{
            System.out.println("Our divisor is going to be "+a+ "for this time.");

            try{
                System.out.println("We will try to divide 20/0: "+ a/c);
            }

            catch (Exception e)
            {
                System.out.println("Exception in level 2");
                System.out.println(e);
            }
        }

        catch (Exception e){
            System.out.println("Exception in level 1 occurred");
            System.out.println(e);

        }
    }
}
