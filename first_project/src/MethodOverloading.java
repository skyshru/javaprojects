public class MethodOverloading {

    static void hello(){
        System.out.println("hello pragg");

    }

    static void hello(int a)//here done method overloading, by defining differnent parameters
    {
        System.out.println("hello prag"+a);
    }

    static void hello( String h)///now the parameter different
    {
        System.out.println(h);
    }

  /**  static int hello(int b){//but moethod overloading cannot be done with different return types
        return b;
    }
   **/
    public static void main(String[] args) {

        hello();
        hello(2);
        hello("Halloween it is");
    }
}
