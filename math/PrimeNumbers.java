package math;

public class PrimeNumbers {

    public boolean isprime(int num) {

        // 0 and 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility till √num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        // Assume every number is prime initially
        boolean[] prime = new boolean[n];

        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Mark multiples of each prime as non-prime
        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                // Start from i*i
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        PrimeNumbers obj = new PrimeNumbers();

        System.out.println(obj.isprime(3));   // true
        System.out.println(obj.countPrimes(10)); // 4
    }
}