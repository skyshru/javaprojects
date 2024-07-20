import calculator.MathPackage;
public class ApplyPackage {
    public static void main(String[] args) {

        int a=6;
        int b=12;

        MathPackage op= new MathPackage();
        System.out.println("The sum of a and b is :"+ op.sum(a,b));
        System.out.println("On multiplying a and b we get: "+ op.multiply(a,b));

    }
}
