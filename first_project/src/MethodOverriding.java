class Parent{

    public void meth1(){
        System.out.println("I am meth1 of Base Class");

    }

    public void meth2(){
        System.out.println("I am meth2 of Base Class");
    }
}

class Child extends Parent {

    @Override
    //this annotation can work as in case our method wont be overriding, this annotation will show error itself
    public void meth2(){
        //Here we provided this class's own version of method2, hence overriding meth2 of Base Class
        System.out.println("I am meth2 of Child class");
    }

}


public class MethodOverriding {
    public static void main(String[] args) {

        Parent A= new Parent();
        Child C= new Child();
        C.meth1();
        C.meth2();


    }
}
