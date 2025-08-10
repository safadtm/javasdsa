import java.util.Scanner;

class Shape {
    double perimeter() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double len, double bre) {
        this.length = len;
        this.breadth = bre;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class methodoverriding {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Perimeter of the circle = " + circle.perimeter());

        System.out.println("Enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double breadth = sc.nextDouble();
        Shape rectangle = new Rectangle(length, breadth);
        System.out.println("Perimeter of the rectangle = " + rectangle.perimeter());

        sc.close();
    }
}
