package array;

public class Intersection_arrays {

    public static void main(String[] args) {

        // Initialize first array
        int[] array1 = {1, 2, 3, 4, 5};

        // Initialize second array
        int[] array2 = {3, 4, 5, 6, 7};

        // Display heading
        System.out.println("Intersection elements are:");

        // Traverse each element of the first array
        for (int i : array1) {

            // Compare it with every element of the second array
            for (int j : array2) {

                // Check if elements are equal
                if (i == j) {

                    // Print common element
                    System.out.print(i + " ");

                    // Exit inner loop to avoid duplicate printing
                    break;
                }
            }
        }
    }
}