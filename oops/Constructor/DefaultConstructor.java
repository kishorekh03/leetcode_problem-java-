package oops.Constructor;

public class DefaultConstructor {

    // Instance variables
    String name;
    int usn;
    String department;

    // Default Constructor
    public DefaultConstructor() {

        name = "Unknown";
        usn = 0;
        department = "Not Assigned";

        System.out.println("Default Constructor Called");
    }

    // Display method
    public void display() {

        System.out.println("Name       : " + name);
        System.out.println("USN        : " + usn);
        System.out.println("Department : " + department);
    }

    public static void main(String[] args) {

        // Constructor is called automatically
        DefaultConstructor s1 = new DefaultConstructor();

        // Display default values
        s1.display();

        // Update object values
        s1.name = "Kishore KH";
        s1.usn = 123;
        s1.department = "ECE";

        System.out.println("\nAfter Updating Values:");

        // Display updated values
        s1.display();
    }
}