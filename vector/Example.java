package vector; // Ensure this matches your folder name

import java.util.Vector; // Needed to use Vector

public class Example {
    public static void main(String[] args) {
        // Create a new Vector
        Vector<Integer> v = new Vector<>();

        // Add elements
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector elements: " + v);
        System.out.println("Size of vector: " + v.size());
        System.out.println("Capacity: " + v.capacity()); // Current storage space
        v.remove(0);
        System.out.println("After removing first element: " + v);
        System.out.println("First element after removal: " + v.get(0));
    }
}