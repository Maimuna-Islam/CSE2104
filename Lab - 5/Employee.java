package employee;
public class Employee 
{
    private String name;
    private int id;
    private double salary;
    private String designation;
    public Employee(String name, int id, double salary, String designation)
    {
        this.name = name; 
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }
    public Employee(String name, int id) 
    {
        this(name, id, 0.0, "Not assigned"); 
    }
    public Employee(String name) 
    {
        this(name, 0, 0.0, "Not assigned"); 
    }
    public void displayEmployeeInfo() 
    {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
    }
    public void updateSalary(double newSalary) 
    {
        this.salary = newSalary;
        System.out.println("Updated Salary : " + this.salary);
    }
    public void updateSalary(double newSalary, String newDesignation) 
    {
        this.salary = newSalary;
        this.designation = newDesignation;
        System.out.println("Updated Salary and designation : " + this.salary + ", " + this.designation);
    }
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("Shahadath", 202102, 50000, "Manager");
        Employee emp2 = new Employee("Sharmin", 201203);
        Employee emp3 = new Employee("Shamim");
        emp1.displayEmployeeInfo();
        System.out.println(); 
        emp2.displayEmployeeInfo();
        System.out.println(); 
        emp3.displayEmployeeInfo();
        emp2.updateSalary(35000);
        emp1.updateSalary(70000, "Senior Manager");
    }
}