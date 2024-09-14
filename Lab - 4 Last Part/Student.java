package student;
import java.util.*;
public class Student 
{
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static int studentCount = 0;
    public Student(int id, String name, String department, double cgpa) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
    }
    public static void displayStudentCount() 
    {
        System.out.println("Total number of students: " + studentCount);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++)
        {    
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Department: ");
            String department = scanner.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); 
            Student student = new Student(id, name, department, cgpa);
            studentList.add(student);
            studentLinkedList.add(student);
        }
        System.out.println("\nStudent Details (ArrayList):");
        for (Student student : studentList) 
        {
            student.displayDetails();
            System.out.println();
        }
        System.out.println("Student Details (LinkedList):");
        for (Student student : studentLinkedList) 
        {
            student.displayDetails();
            System.out.println();
        }
        Student.displayStudentCount();
        scanner.close();
    }
}