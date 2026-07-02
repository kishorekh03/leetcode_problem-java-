import java.util.Scanner;

public class Function {

    int sum_of_numbers(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
    int sum_of_digits(int n) {

        int sum = 0;
        while (n>0){
            sum+=n%10;
            n/=10;

        }
        

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for sum: ");
        int n = sc.nextInt();

        System.out.print("Enter number for factorial: ");
        int factNum = sc.nextInt();

        System.out.print("Enter number to find the sum of digits: ");
        int digitSumNum = sc.nextInt();

        Function obj = new Function();

        int sum = obj.sum_of_numbers(n);

        System.out.println("Sum of " + n + " is " + sum);

        int fact = obj.factorial(factNum);

        System.out.println("Factorial of " + factNum + " is " + fact);
        
        int digitSum = obj.sum_of_digits(digitSumNum);
        System.out.println("Sum of digits of " + digitSumNum + " is " + digitSum);
        sc.close();
    }
}