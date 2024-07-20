package Errors_and_exceptions;

public class TryCatchBlock {
    public static void main(String[] args) {
        int a=4394803;
        int b=0;

        try{
            System.out.println("On dividing we get: "+ a/b);
        }

        catch (Exception e){
            //Exception is a class
            // e is its object
            System.out.println("Sorry the program could'nt be run, Reason:-");
            System.out.println(e);
        }
    }
}
