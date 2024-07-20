package Threads;


class UseBrowser extends Thread{
    @Override
    public void run(){

        int i=0;
        while(i<400000)
        {
            System.out.println("******** I am using LinkedIn ****");
            i++;
        }
    }

}

class PlayGames extends Thread{
    public void run(){
        int i=0;

        while(i<400000)
        {
            System.out.println("@@@@@@  I am playing Valo @@@@@@");
            i++;
        }
    }
}


public class MultithreadingUsingExtendedClass {
    public static void main(String[] args) {
        UseBrowser obj= new UseBrowser();
        PlayGames obj2= new PlayGames();

        obj.start();
        obj2.start();

        //we saw in the output that The threads gave some time to use the browser and some time to play games
    }
}

