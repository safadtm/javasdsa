import java.util.Scanner;

abstract class Bank {
    double principal;
    int time;

    Bank(double principal, int time) {
        this.principal = principal;
        this.time = time;
    }

    abstract double getRateOfInterest();
 
    double calculateInterest() {
        return (principal * getRateOfInterest() * time) / 100;
    }

}



class SBI extends Bank {
    SBI(double principal, int time) {
        super(principal, time);
    }

    double getRateOfInterest() {
        return 6.5;
    }
}



class HDFC extends Bank {
    HDFC(double principal, int time) {
        super(principal, time);
    }

    double getRateOfInterest() {
        return 7.0;
    }

}

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount and time (in years):");

        double principal = sc.nextDouble();

        int time = sc.nextInt();

        Bank b1 = new SBI(principal, time);

        Bank b2 = new HDFC(principal, time);


        System.out.println("SBI Interest: " + b1.calculateInterest());

        System.out.println("HDFC Interest: " + b2.calculateInterest());

        sc.close();

    }

}

