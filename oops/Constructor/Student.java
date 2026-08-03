package oops.Constructor;

public class Student {

    // Instance Variables
    String name;
    int usn;
    String department;

    // ---------------- Default Constructor ----------------
    public Student() {

        name = "Unknown";
        usn = 0;
        department = "Not Assigned";

        System.out.println("Default Constructor Called");
    }

    // ---------------- Parameterized Constructor ----------------
    public Student(String name, int usn, String department) {

        this.name = name;
        this.usn = usn;
        this.department = department;
        System.out.println("");

        System.out.print("Parameterized Constructor Called");
    }

    // ---------------- Display Method ----------------
    public void display() {

        System.out.println("Name       : " + name);
        System.out.println("USN        : " + usn);
        System.out.println("Department : " + department);
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {

        // Calls Default Constructor
        Student s1 = new Student();

        System.out.println("\nStudent 1 Details");
        s1.display();

        // Calls Parameterized Constructor
        Student s2 = new Student("Kishore KH", 123, "ECE");

        System.out.println("\nStudent 2 Details");
        s2.display();
    }
}