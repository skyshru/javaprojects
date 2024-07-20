package Errors_and_exceptions;
///In this code you will also learn about the Throw Keyword


class ShouldNotBeNegative extends Exception{
    @Override
    public String toString(){
    return super.toString()+ "Radius Cannot Be Negative!!";
    }

    @Override
    public String getMessage()
    {
        return super.getMessage()+ " Radius Cannot Be Negative!!";
    }
}



public class CustomException {
    public static double volume(int r) throws ShouldNotBeNegative//by using throws in function, the code will instruct the user to handle the exception at their own end
    {
        if(r<0)
            throw new ShouldNotBeNegative();

        return r * r * r;
    }
    public static void main(String[] args) {

        int r= -4;

        try{
            System.out.println(volume(r));

        }

        catch (Exception e)
        {
            System.out.println("Exception occured: "+e);
        }

    }
}
