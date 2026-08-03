package oops;

public class Student {

    // ---------------- Properties ----------------

    String name;
    int usn;
    String department;
    float cgpa;
    int backlogs;

    // ---------------- Methods ----------------

    // Method to change the department
    public String newDepartment(String newDep) {
        department = newDep;
        return department;
    }

    // Method to calculate CGPA
    public float calculateCGPA(float sgpa, int noOfSemesters) {

        // Formula to update CGPA
        cgpa = (cgpa + sgpa) / noOfSemesters;

        return cgpa;
    }

    // ---------------- Main Method ----------------

    public static void main(String[] args) {

        // Creating Student object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Kishore";
        s1.usn = 12345;
        s1.department = "ECE";
        s1.cgpa = 8.8f;
        s1.backlogs = 0;

        // Displaying details
        System.out.println("Name : " + s1.name);
        System.out.println("USN : " + s1.usn);
        System.out.println("Department : " + s1.department);
        System.out.println("CGPA : " + s1.cgpa);
        System.out.println("Backlogs : " + s1.backlogs);

        // Change department
        s1.newDepartment("CSE");
        System.out.println("\nUpdated Department : " + s1.department);

        // Calculate new CGPA
        float updatedCGPA = s1.calculateCGPA(9.2f, 2);
        System.out.println("Updated CGPA : " + updatedCGPA);
    }
}