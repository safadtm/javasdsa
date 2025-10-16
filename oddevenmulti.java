import java.util.Scanner;

class Odd extends Thread {
    public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==1){

                System.out.println("Odd "+i);

                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Even extends Thread {
        public void run(){
        for(int i=1;i<=20;i++){
            if(i%2==0){

                System.out.println("Even "+i);

                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class oddevenmulti {
    public static void main(String[] args){
        Odd oddThread = new Odd();
        Even evenThread = new Even();

        oddThread.start();
        evenThread.start();
    }
}
