package array;

public class SumProduct {
    
    // Calculates the sum of all elements
    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Calculates the product of all elements
    // Uses 'long' to handle larger numbers than 'int' can store
    public long calculateProduct(int[] arr) {
        long product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        SumProduct obj = new SumProduct();
        
        int totalSum = obj.calculateSum(arr);
        long totalProduct = obj.calculateProduct(arr);
        
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Sum of array elements: " + totalSum);
        System.out.println("Product of array elements: " + totalProduct);
    }
}