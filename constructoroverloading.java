import java.util.Scanner;
class Circle{
    double radius;

    public Circle(){
        radius=0;
    }

    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle{
    double width;
    double height;

    public Rectangle(){
        width=0;
        height=0;
    }

    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getArea(){
        return width*height;
    }

}
public class constructoroverloading {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        // two circle object
        Circle c1=new Circle();
        Circle c2=new Circle(radius);

        System.out.println("First circle area = "+c1.getArea());
        System.out.println("Second circle area = "+c2.getArea());

        System.out.println("Enter the width of the rectangle : ");
        double width = sc.nextDouble();
        System.out.println("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        // two rectangle object
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(width,length);

        System.out.println("First rectangle area = "+r1.getArea());
        System.out.println("Second rectangle area = "+r2.getArea());

        sc.close();
    }
}
