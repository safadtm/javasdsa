import java.util.Scanner;
public class sumarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Program to find sum and average of the numbers");
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();

        int array[]=new int[size];
        float avg=0;
        int sum=0;
        
        System.out.println("Enter the array elements");
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
            sum=sum+array[i];
        }

        avg=sum/size;

        System.out.println("After calculation");
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);

        sc.close();
        
    }
}
