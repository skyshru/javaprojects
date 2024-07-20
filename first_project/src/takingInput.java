import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class takingInput {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Let's take some input");
        Scanner sc= new Scanner(System.in);//system.in means taking input from the keyboard
//        int a =sc.nextInt();
//        int b= sc.nextInt();
//        System.out.println(a+b);

        //difference between next and nextline

        String r= sc.nextLine();//it willl read the whole sentence
        String p=sc.next();// it just reads a word
        System.out.println(r);
        System.out.println(p);

        System.out.printf("the value of string is %s",p);//it is printf

    }
}
