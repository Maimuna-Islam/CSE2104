package employee;
public class Employee 
{
    static String companyName = " Tecnology Solutin.";
    static String companyAddress = "Taj ROad,Golden Street,Shymoly,Dhaka-1207.";
    static int employeeCount = 0;
    public String name;
    public int age;
    public String designation;
    private double salary;
    public Employee(String name, int age, String designation, double salary) 
    {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++; 
    }
    public void displayEmployeeDetails() 
    {
        System.out.println("Name:-" + name);
        System.out.println("Age:" + age);
        System.out.println("Designation:-" + designation);
        System.out.println("Salary:-BDT" + salary);
        System.out.println("Company Name:-" + companyName);
        System.out.println("Company Address:-" + companyAddress);
        System.out.println("...   ...   ...   ...");
    }
    public static void displayTotalEmployees()
    {
        System.out.print("Total Number of Employees:" + employeeCount);
    }
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("OVi", 28, "Web Devoloper", 45000);
        Employee emp2 = new Employee("Dipa", 25, "Data Analyst", 35000);
        Employee emp3 = new Employee("Siam", 35, "Project Maneger", 70000);
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
