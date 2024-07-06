package student1;
public class Student1
{
    public static String university = "Jahangirnagar University";
    public static int studentCount = 0;
    public int id;
    public String name;
    public String department;
    private double cgpa;
    public Student1(int id, String name, String department, double cgpa) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }
    public void displayDetails() 
    {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Department:" + department);
        System.out.println("CGPA:" + cgpa);
        System.out.println("University:" + university);
        System.out.println();
    }
    public static void displayTotalStudents()
    {
        System.out.println("Total number of students:" + studentCount);
    }
    public static void main(String[] args) 
    {
        Student1 student1 = new Student1(231014089, "Meghla", "Computer Science & Engineering", 3.74);
        Student1 student2 = new Student1(223013028, "Nipun", "Electrical & Electronic Engineering", 3.59);
        Student1 student3 = new Student1(232012009, "Sayera", "Mechanical Engineering", 3.06);
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        Student1.displayTotalStudents();
    }
}

