public class Methods {

    static int multiply(int first, int second){
        //here we have used static to define a method because from the method main that it is being
        // called is also static
        return first*second;
    }
    public static void main(String[] args) {

        int a=2;
        int b=3;

        System.out.println(multiply(a,b));
    }
}
