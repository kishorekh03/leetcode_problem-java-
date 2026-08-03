package oops.inheritance;

// ---------------- Parent Interface ----------------
interface Person {

    void showName();
}

// ---------------- Employee Interface ----------------
interface Employee extends Person {

    void showEmployeeId();
}

// ---------------- Student Interface ----------------
interface Student extends Person {

    void showUSN();
}

// ---------------- Child Class ----------------
public class HybridInheritanceDemo implements Employee, Student {

    @Override
    public void showName() {
        System.out.println("Name : Kishore");
    }

    @Override
    public void showEmployeeId() {
        System.out.println("Employee ID : 101");
    }

    @Override
    public void showUSN() {
        System.out.println("USN : 123");
    }

    public static void main(String[] args) {

        HybridInheritanceDemo obj = new HybridInheritanceDemo();

        obj.showName();
        obj.showEmployeeId();
        obj.showUSN();
    }
}