package oops.Constructor;

public class ParameterizedConstructor {

    // Instance Variables
    String name;
    int usn;
    String department;

    // Parameterized Constructor
    public ParameterizedConstructor(String name, int usn, String department) {

        this.name = name;
        this.usn = usn;
        this.department = department;

        System.out.println("Parameterized Constructor Called");
    }

    // Method to display student details
    public void display() {

        System.out.println("Name       : " + name);
        System.out.println("USN        : " + usn);
        System.out.println("Department : " + department);
    }

    public static void main(String[] args) {

        // Creating first object
        ParameterizedConstructor s1 = new ParameterizedConstructor("Kishore KH", 123, "ECE");

        System.out.println("\nStudent 1 Details");
        s1.display();

        // Creating second object
        ParameterizedConstructor s2 = new ParameterizedConstructor("Rahul", 456, "CSE");

        System.out.println("\nStudent 2 Details");
        s2.display();
    }
}