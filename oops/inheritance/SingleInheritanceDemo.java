package oops.inheritance;

// ---------------- Parent Class ----------------
class Person {

    // Parent class variables
    String name = "Kishore";
    int age = 21;

    // Parent class method
    public void displayPerson() {
        System.out.println("Inside Parent Class");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// ---------------- Child Class ----------------
public class SingleInheritanceDemo extends Person {

    // Child class variables
    int employeeId = 101;
    double salary = 50000;

    // Child class method
    public void displayEmployee() {

        System.out.println("\nInside Child Class");

        // Inherited variables
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        // Child variables
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary : ₹" + salary);
    }

    public static void main(String[] args) {

        SingleInheritanceDemo emp = new SingleInheritanceDemo();

        emp.displayPerson();
        emp.displayEmployee();
    }
}