public class VarArgs {

    static int multiply(int ...arr)//available as int[] arr
    {
        int result=1;

        for(int a : arr)
        {
            result*= a;
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        //suppose you gotta do method overloading
        //you have make three functions named Multiply
        //which will perform multiplication between two, three and four arguments respectively
        // so instead of making three functions, you can make use of varArgs
        // all the arguments that you pass will be collected as an array in the function
        //so you will just have to make one function

        System.out.println("Let us show the implementation of VarArgs");
        multiply(3,4);
        multiply(4,5,6);
        multiply(7,8,9999,10);
        System.out.println("the sum of nothing is" + multiply());
        //for all of these you won't need three seprate functions with different number of parameters
        //you just need one

    }
}
