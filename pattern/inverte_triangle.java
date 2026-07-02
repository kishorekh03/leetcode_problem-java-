package pattern;

public class inverte_triangle {

    public static void main(String[] args) {

        int n = 5;

        // Pattern 1
        for (int i = 0; i < n; i++) {

            printSpaces(i);

            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        // Pattern 2
        for (int i = 0; i < n; i++) {

            printSpaces(i);

            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print((i + 1) + " ");
            }

            System.out.println();
        }

        System.out.println();

        // Pattern 3
        for (int i = 0; i < n; i++) {

            printSpaces(i);

            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // method for spaces
    public static void printSpaces(int i) {
        for (int k = 0; k < i; k++) {
            System.out.print("  ");
        }
    }
}