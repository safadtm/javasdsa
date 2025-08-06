import java.util.Scanner;

class VolumeCalculator {
    double width;
    double height;

    void volume(double radius, double height) {
        width = radius;
        this.height = height;
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of Cylinder = %.2f\n", volume);
    }

    void volume(double side) {
        double volume = side * side * side;
        System.out.printf("Volume of Cube = %.2f\n", volume);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator v = new VolumeCalculator();

        System.out.print("Enter side of the cube: ");
        double cubeSide = sc.nextDouble();
        v.volume(cubeSide);  

        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();
        v.volume(radius, height);  

        sc.close();
    }
}
