package person;
class Person
{
    private String name;
    private int age;
    private String gender;
    private String address;
    public String getName() 
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getGender() 
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public static void main(String[] args) 
    {
        Person person1 = new Person();
        person1.setName("Asad");
        person1.setAge(30);
        person1.setGender("M");
        person1.setAddress("28/5 Sheser kobita");
        Person person2 = new Person();
        person2.setName("Zoya");
        person2.setAge(25);
        person2.setGender("F");
        person2.setAddress("Khan Villa");
        System.out.println("Person 1 Details:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Gender: " + person1.getGender());
        System.out.println("Address: " + person1.getAddress());
        System.out.println("\nPerson 2 Details:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());
        System.out.println("Address: " + person2.getAddress());
    }
}