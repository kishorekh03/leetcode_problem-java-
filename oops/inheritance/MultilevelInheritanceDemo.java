package oops.inheritance;

// ---------------- Parent Class ----------------
class Person {

    String name = "Kishore";

    public void displayPerson() {
        System.out.println("Name : " + name);
    }
}

// ---------------- Child Class ----------------
class Employee extends Person {

    int employeeId = 101;

    public void displayEmployee() {
        System.out.println("Employee ID : " + employeeId);
    }
}

// ---------------- Grand Child ----------------
public class MultilevelInheritanceDemo extends Employee {

    String department = "Software";

    public void displayManager() {

        // Parent variable
        System.out.println("Name : " + name);

        // Child variable
        System.out.println("Employee ID : " + employeeId);

        // Grandchild variable
        System.out.println("Department : " + department);
    }

    public static void main(String[] args) {

        MultilevelInheritanceDemo manager = new MultilevelInheritanceDemo();

        manager.displayPerson();
        manager.displayEmployee();
        manager.displayManager();
    }
}