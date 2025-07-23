import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        int number, i;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a prime number:");
        number = sc.nextInt();
        if (number <= 1) {
            isPrime = false; 
        } else {
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        sc.close();
    }
}
