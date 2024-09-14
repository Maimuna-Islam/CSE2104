package person2;
class Person2 
{
    private String name;
    private int age;
    private String gender;
    private String address;
    public Person2(String name, int age, String gender, String address)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public Person2(String name, int age) 
    {
        this(name, age, "Unknown", "Unknown"); 
    }
    public void displayInfo() 
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
    }
    public void displayInfo(String title) 
    {
        System.out.println(title + " Info:");
        displayInfo(); 
    }
    public static void main(String[] args) 
    {
        Person2 person1 = new Person2("Noor", 23, "F", "118/ka shymoli");
        Person2 person2 = new Person2("faaz Ibrahim", 25);
        person1.displayInfo("Person 1");
        person2.displayInfo("Person 2");
    }
}