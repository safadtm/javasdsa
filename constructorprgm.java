import java.util.Scanner;

class student{
    // int rollno;
    // String name;
    // float mark;

    private int rollno;
    private String name;
    private float mark;


    // default constructor
    student(){
        this.rollno=1;
        this.name="Default";
        this.mark=96;
    }

    // parametrized constructor
    student(int rollno,String name,float mark){
       this.rollno=rollno;
       this.name=name;
       this.mark=mark;
    }

    public int getRollNo(){
        return rollno;
    }

    public String getName(){
        return name;
    }

    public float getMark(){
        return mark;
    }

    // void displayDetails() {
    //     System.out.println("Student Roll No: " + rollno);
    //     System.out.println("Student Name: " + name);
    //     System.out.println("Student Marks: " + mark);
    // }
    
}

public class constructorprgm{
    public static void main(String args[]){
    int rollno;
    String name;
    float mark;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Roll no :");
    rollno=sc.nextInt();

    System.out.println("Enter Name :");
    name=sc.next();

    System.out.println("Enter Mark :");
    mark=sc.nextFloat();
    

    student st=new student();
    System.out.println("\nDefault Student Details:");
    System.out.println("Student Roll No: " + st.getRollNo());
    System.out.println("Student Name: " + st.getName());
    System.out.println("Student Marks: " + st.getMark());

    student st2=new student(rollno, name, mark);
  
    // st.displayDetails();

    System.out.println("\nParametrized Student Details:");
    System.out.println("Student Roll No: " + st2.getRollNo());
    System.out.println("Student Name: " + st2.getName());
    System.out.println("Student Marks: " + st2.getMark());
    sc.close();
    }
}
