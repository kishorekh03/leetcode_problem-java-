package oops.Constructor;

public class CopyConstructor {

    // Instance Variables
    String name;
    int usn;
    String department;

    // Parameterized Constructor
    public CopyConstructor(String name, int usn, String department) {

        this.name = name;
        this.usn = usn;
        this.department = department;
    }

    // Copy Constructor
    public CopyConstructor(CopyConstructor s) {

        this.name = s.name;
        this.usn = s.usn;
        this.department = s.department;

        System.out.println("Copy Constructor Called");
    }

    // Display Method
    public void display() {

        System.out.println("Name       : " + name);
        System.out.println("USN        : " + usn);
        System.out.println("Department : " + department);
    }

    public static void main(String[] args) {

        // Original Object
        CopyConstructor s1 = new CopyConstructor("Kishore KH", 123, "ECE");

        System.out.println("Original Object");
        s1.display();

        // Copy Object
        CopyConstructor s2 = new CopyConstructor(s1);

        System.out.println("\nCopied Object");
        s2.display();
    }
}