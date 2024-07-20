package Threads;

class RunnableThread1 implements Runnable{
    @Override
    public void run() {
        int a=0;
        while(a<3000)
        {
            System.out.println("BADA BOWOOWWBOW BOWWW");
            a++;
        }
    }
}

class RunnableThread2 implements Runnable{
    @Override
    public void run() {
        int a=0;
        while(a<3000)
        {
            System.out.println("I am a Thread not a threat");
            a++;
        }
    }
}

public class Multithreading_By_Implementing_Interface {
    public static void main(String[] args) {

        RunnableThread1 bullet1= new RunnableThread1();
        Thread gun1= new Thread(bullet1);

        RunnableThread2 bullet2= new RunnableThread2();
        Thread gun2= new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
