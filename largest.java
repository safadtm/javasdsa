import java.io.*;
import java.util.Scanner;

public class largest{
    public static void main(String args[]){
        int large;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a =sc.nextInt();
        System.out.println("enter second number");
        int b =sc.nextInt();
        System.out.println("enter third number");
        int c =sc.nextInt();

        if(a>b && a>c){
             large=a;
        }else if (b>a && b>c){
             large=b;
        }else{
             large=c;
        }
        System.out.println("Largest among "+a+","+b+","+c+" is "+large);
        sc.close();
    }
}
