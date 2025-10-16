import mypack.matrix;
import pack.prime;
import java.util.Scanner;

public class maths {
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter a number to check prime number:");
            int number = sc.nextInt();
            System.out.println(number+(new prime().isPrime(number)?" is prime":" not prime"));


            System.out.println("Enter matrix row count");
            int m=sc.nextInt();
            System.out.println("Enter matrix column count");
            int n=sc.nextInt();
            
            int[][] a=new int[m][n];

            System.out.println("Enter matrix elements:");
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
                }
            }
            
            new matrix().print(a, m, n);
            sc.close();
    }
}
