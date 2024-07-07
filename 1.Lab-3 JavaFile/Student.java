package student;
import java.util.Scanner;
public class Student
{
    private int id;
    private String name;
    private String department;
    private double cgpa;
    public static String university = "Rajshahi University.";
    public static int totalStudents = 0; 
    public Student(int id, String name, String department, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        totalStudents++; 
    }
    public void displayDetails() 
    {
        System.out.println("Student ID:" + id);
        System.out.println("Name:-" + name);
        System.out.println("Department:-" + department);
        System.out.println("CGPA:" + cgpa);
        System.out.println("University:-" + university);
        System.out.println("....  ....  ....  ....");
    }
    public static void displayTotalStudents() 
    {
        System.out.println("Total number of students: " + totalStudents);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID:");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name:-");
            String name = sc.nextLine();
            System.out.print("Department:-");
            String department = sc.nextLine();
            System.out.print("CGPA:");
            double cgpa = sc.nextDouble();
            System.out.println("....  ....  ....  ....");
            Student student = new Student(id, name, department, cgpa);
            student.displayDetails();
            System.out.println(); 
        }
        Student.displayTotalStudents();
        sc.close();
    }
}

