package oops;

public class UserAccount {

    // ---------------- Private Data Members ----------------
    // Password is hidden from outside the class.
    private String username;
    private String password;

    // ---------------- Setter Methods ----------------

    // Set username
    public void setUsername(String username) {
        this.username = username;
    }

    // Set password
    public void setPassword(String password) {

        // Password should have at least 8 characters
        if (password.length() >= 8) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Password must contain at least 8 characters.");
        }
    }

    // ---------------- Getter Methods ----------------

    // Get username
    public String getUsername() {
        return username;
    }

    // ---------------- Business Method ----------------

    // Verify the entered password
    public boolean login(String enteredPassword) {

        if (password.equals(enteredPassword)) {
            return true;
        }

        return false;
    }

    // ---------------- Main Method ----------------

    public static void main(String[] args) {

        UserAccount user = new UserAccount();

        user.setUsername("Kishore");

        // Set password
        user.setPassword("Kishore@123");

        // Login attempt
        if (user.login("Kishore@123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Password");
        }
    }
}