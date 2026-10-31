package Test1;
	
public class Employee_management{
    public static void main(String[] args) {
        // Creating a Manager object
        Manager mgr = new Manager(101, "Alice Smith", "Human Resources");
        
        // Creating a Developer object
        Developer dev = new Developer(102, "Bob Jones", "Java");

        System.out.println("--- Manager Details ---");
        mgr.displayDetails();

        System.out.println("\n--- Developer Details ---");
        dev.displayDetails();
    }
}

// Parent Class
class Employee {
    int employeeId;
    String name;

    // Constructor
    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Child Class 1
class Manager extends Employee {
    String department; // Child-specific field

    public Manager(int employeeId, String name, String department) {
        super(employeeId, name); // Calls the parent constructor
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Displays ID and Name from parent class
        System.out.println("Department: " + department);
    }
}

// Child Class 2
class Developer extends Employee {
    String programmingLanguage; // Child-specific field

    public Developer(int employeeId, String name, String programmingLanguage) {
        super(employeeId, name); // Calls the parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Displays ID and Name from parent class
        System.out.println("Primary Language: " + programmingLanguage);
    }
}

