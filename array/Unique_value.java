package array;

import java.util.Scanner;

public class Unique_value {

    // Method to read array elements
    int[] readElements(int len) {
        int[] array = new int[len];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < len; i++) {
            array[i] = sc.nextInt();
        }

        return array;
    }

    // Method to find unique elements
    void unique(int[] array) {

        System.out.println("Unique elements are:");
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Unique_value obj = new Unique_value();
        Scanner sc = new Scanner(System.in);
        // Read size of array
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        // Read array elements
        int[] array = obj.readElements(length);
        // Find and display unique elements
        obj.unique(array);
        sc.close();
    }
}