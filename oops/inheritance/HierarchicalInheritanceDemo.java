package oops.inheritance;

// ---------------- Parent Class ----------------
class Person {

    String name = "Kishore";

    public void displayPerson() {
        System.out.println("Name : " + name);
    }
}

// ---------------- First Child ----------------
class Employee extends Person {

    int employeeId = 101;

    public void displayEmployee() {
        System.out.println("Employee ID : " + employeeId);
    }
}

// ---------------- Second Child ----------------
class Student extends Person {

    int usn = 123;

    public void displayStudent() {
        System.out.println("USN : " + usn);
    }
}

// ---------------- Main Class ----------------
public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println("Employee Details");
        emp.displayPerson();
        emp.displayEmployee();

        System.out.println();

        Student stu = new Student();

        System.out.println("Student Details");
        stu.displayPerson();
        stu.displayStudent();
    }
}