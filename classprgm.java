import java.io.*;
import java.util.Scanner;
class student{
    int rollno;
    String name;
    float mark;

    void display(int rollno,String name,float mark){
        System.out.println("Roll no : "+rollno);
        System.out.println("Name : "+name);
        System.out.println("Mark : "+mark);
    }
}
public class classprgm {
    public static void main(String args[]){
        int rollno;
        String name;
        float mark;
        
        Scanner sc=new Scanner(System.in);

        student st = new student();

        System.out.println("Enter Roll no :");
        rollno=sc.nextInt();

        System.out.println("Enter Name :");
        name=sc.next();

        System.out.println("Enter Mark :");
        mark=sc.nextFloat();
        
        st.display(rollno, name, mark);
        sc.close();

    }
}
