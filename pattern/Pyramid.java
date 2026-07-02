package pattern;

public class Pyramid {

    public static void main(String[] args) {

        int n = 4;

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // decreasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}