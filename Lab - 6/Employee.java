package employee;
class Employee 
{
    private String name;
    private int id;
    private double salary;
    private String designation;
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public double getSalary() 
    {
        return salary;
    }
    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    public String getDesignation() 
    {
        return designation;
    }
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
    public static void main(String[] args) 
    {
        Employee employee1 = new Employee();
        employee1.setName("Humayun");
        employee1.setId(201013028);
        employee1.setSalary(75000.00);
        employee1.setDesignation("planner");
        Employee employee2 = new Employee();
        employee2.setName("Zahra");
        employee2.setId(212012289);
        employee2.setSalary(65000.00);
        employee2.setDesignation("Manegar");
        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID: " + employee1.getId());
        System.out.println("Salary: $" + employee1.getSalary());
        System.out.println("Designation: " + employee1.getDesignation());
        System.out.println("\nEmployee 2 Details:");
        System.out.println("Name: " + employee2.getName());
        System.out.println("ID: " + employee2.getId());
        System.out.println("Salary: $" + employee2.getSalary());
        System.out.println("Designation: " + employee2.getDesignation());
    }
}