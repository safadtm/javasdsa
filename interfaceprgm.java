interface College{
    void departmentName();
    int numberOfStudents();
}

class ComputerScience implements College{    
    public void departmentName() {
    System.out.println("Department: Computer Science");
    }
    public int numberOfStudents() {
        return 150;
    }
}

class Commerce implements College{    
    public void departmentName() {
    System.out.println("Department: Commerce");
    }
    public int numberOfStudents() {
        return 2000;
    }
}
public class interfaceprgm {
    public static void main(String args[]){
        College dept;

        dept= new ComputerScience();
        dept.departmentName();
        System.out.println("Students :"+dept.numberOfStudents());

        dept= new Commerce();
        dept.departmentName();
        System.out.println("Students :"+dept.numberOfStudents());
        
    }
}
