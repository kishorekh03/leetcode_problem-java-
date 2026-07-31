package recursion;

public class Fibonacci {

    // Recursive method to find the nth Fibonacci number
    public int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();

        int n = 6;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(obj.fib(i) + " ");
        }

        System.out.println(); // Move to the next line

        System.out.println("Fibonacci number at index " + n + " is: " + obj.fib(n));
    }
}