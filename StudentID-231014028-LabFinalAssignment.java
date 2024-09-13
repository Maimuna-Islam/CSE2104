import java.io.*;
import java.util.*;
class Doctor 
{
    private String id;
    private String name;
    private String specialization;
    private String hospitalName;
    private String time;
    private String roomNumber;
    private String sector;
    private boolean available;
    public Doctor(String id, String name, String specialization, String hospitalName, String time, String roomNumber, String sector) 
    {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.hospitalName = hospitalName;
        this.time = time;
        this.roomNumber = roomNumber;
        this.sector = sector;
        this.available = true;
    }
    public String getId() 
    { 
        return id;
    }
    public void setId(String id) 
    { 
        this.id = id;
    }
    public String getName() 
    {
        return name; 
    }
    public void setName(String name) 
    { 
        this.name = name;
    }
    public String getSpecialization() 
    { 
        return specialization;
    }
    public void setSpecialization(String specialization)
    { 
        this.specialization = specialization;
    }
    public String getHospitalName() 
    { 
        return hospitalName;
    }
    public void setHospitalName(String hospitalName)
    { 
        this.hospitalName = hospitalName;
    }
    public String getTime() 
    { 
        return time;
    }
    public void setTime(String time)
    { 
        this.time = time;
    }
    public String getRoomNumber() 
    { 
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) 
    { 
        this.roomNumber = roomNumber;
    }
    public String getSector() 
    { 
        return sector;
    }
    public void setSector(String sector) 
    {
        this.sector = sector;
    }
    public boolean isAvailable() 
    {
        return available;
    }
    public void setAvailable(boolean available) 
    {
        this.available = available;
    }
    public void displayAvailability()
    {
        System.out.println(name + " (" + specialization + ", " + hospitalName + " Room: " + roomNumber + ") - " +
                (available ? "Available" : "Not Available"));
    }
}
class GeneralPractitioner extends Doctor
{
    public GeneralPractitioner(String id, String name, String hospitalName, String time, String roomNumber)
    {
        super(id, name, "General Practitioner", hospitalName, time, roomNumber, "N/A");
    }
    public void displayAvailability() 
    {
        System.out.println(getName() + " (" + getSpecialization() + ", " + getHospitalName() + " Room: " + getRoomNumber() + ") - " +
                (isAvailable() ? "Are Available" : "Not Available"));
    }
}
class Specialist extends Doctor 
{
    public Specialist(String id, String name, String hospitalName, String time, String roomNumber, String sector) 
    {
        super(id, name, "Specialist", hospitalName, time, roomNumber, sector);
    }
    public void displayAvailability() 
    {
        System.out.println(getName() + " (" + getSpecialization() + ", " + getHospitalName() + " Room: " + getRoomNumber() + ", Sector: " + getSector() + ") - " +
                (isAvailable() ? "Appointment Required" : "Not Available"));
    }
}
class Patient 
{
    private String name;
    private int age;
    private String gender;
    private String contact;
    public Patient(String name, int age, String gender, String contact)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }
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

    public String getContact() 
    { 
        return contact;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }
}
class Appointment 
{
    private Patient patient;
    private Doctor doctor;
    private String date;
    public Appointment(Patient patient, Doctor doctor, String date) 
    {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }
    public Patient getPatient()
    {
        return patient;
    }
    public void setPatient(Patient patient) 
    { 
        this.patient = patient;
    }
    public Doctor getDoctor() 
    { 
        return doctor;
    }
    public void setDoctor(Doctor doctor) 
    { 
        this.doctor = doctor;
    }
    public String getDate() 
    {
        return date;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }
}
public class Main 
{
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("1. Register Doctor");
            System.out.println("2. View Doctors");
            System.out.println("3. View Available Doctors");
            System.out.println("4. Register Patient");
            System.out.println("5. Book Appointment");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) 
            {
                case 1:
                    registerDoctor(scanner);
                    break;
                case 2:
                    viewDoctors();
                    break;
                case 3:
                    viewAvailableDoctors();
                    break;
                case 4:
                    registerPatient(scanner);
                    break;
                case 5:
                    bookAppointment(scanner);
                    break;
                case 6:
                    viewAppointments();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    saveAppointmentsToFile();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void registerDoctor(Scanner scanner) 
    {
        System.out.println("Enter doctor's ID:");
        String id = scanner.nextLine();
        System.out.println("Enter doctor's name:");
        String name = scanner.nextLine();
        System.out.println("Enter specialization (GP/SP):");
        String specialization = scanner.nextLine();
        System.out.println("Enter hospital name:");
        String hospitalName = scanner.nextLine();
        System.out.println("Enter time :");
        String time = scanner.nextLine();
        System.out.println("Enter room number:");
        String roomNumber = scanner.nextLine();
        Doctor doctor;
        if (specialization.equalsIgnoreCase("GP"))
        {
            doctor = new GeneralPractitioner(id, name, hospitalName, time, roomNumber);
        } 
        else 
        {
            System.out.println("Enter sector of specialization:");
            String sector = scanner.nextLine();
            doctor = new Specialist(id, name, hospitalName, time, roomNumber, sector);
        }
        doctors.add(doctor);
        System.out.println("Doctor registered successfully.");
    }
    private static void viewDoctors()
    {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) 
        {
            doctor.displayAvailability();
        }
    }
    private static void viewAvailableDoctors()
    {
        System.out.println("Available Doctors:");
        for (Doctor doctor : doctors) 
        {
            if (doctor.isAvailable())
            {
                doctor.displayAvailability();
            }
        }
    }
    private static void registerPatient(Scanner scanner) 
    {
        System.out.println("Enter patient's name:");
        String name = scanner.nextLine();
        System.out.println("Enter patient's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter patient's gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter patient's contact information:");
        String contact = scanner.nextLine();

        Patient patient = new Patient(name, age, gender, contact);
        System.out.println("Patient registered successfully.");
    }
    private static void bookAppointment(Scanner scanner) 
    {
        System.out.println("Enter patient's name:");
        String patientName = scanner.nextLine();
        System.out.println("Enter doctor's name:");
        String doctorName = scanner.nextLine();
        System.out.println("Enter date :");
        String date = scanner.nextLine();
        Doctor doctor = findDoctorByName(doctorName);
        if (doctor != null && doctor.isAvailable()) 
        {
            Patient patient = new Patient(patientName, 0, "", "");  
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            doctor.setAvailable(false);
            System.out.println("Appointment booked successfully.");
            saveAppointmentsToFile();
        }
        else 
        {
            System.out.println("Doctor not available or not found.");
        }
    }
    private static void viewAppointments() 
    {
        System.out.println("List of Appointments:");
        for (Appointment appointment : appointments)
        {
            System.out.println("Patient: " + appointment.getPatient().getName() +
                    ", Doctor: " + appointment.getDoctor().getName() +
                    ", Date: " + appointment.getDate());
        }
    }
    private static Doctor findDoctorByName(String name)
    {
        for (Doctor doctor : doctors) 
        {
            if (doctor.getName().equalsIgnoreCase(name)) 
            {
                return doctor;
            }
        }
        return null;
    }
   private static void saveAppointmentsToFile() 
    {
       try (PrintWriter writer = new PrintWriter(new FileWriter("appointments.txt", true)))
       {
            for (Appointment appointment : appointments) 
            {
                writer.println("Patient: " + appointment.getPatient().getName() +
                        ", Doctor: " + appointment.getDoctor().getName() +
                       ", Date: " + appointment.getDate());
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Error saving appointments to file.");
            e.printStackTrace();
        }
     }
}