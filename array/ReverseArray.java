package array;

public class ReverseArray {
    void reverseInPlace(int[] array) {
    int start = 0;
    int end = array.length - 1;

    while (start < end) {
        // Standard swap logic
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        // Move pointers toward the middle
        start++;
        end--;
    }
    System.out.println("Reversed (In-Place): " + java.util.Arrays.toString(array));
}
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        ReverseArray obj=new ReverseArray();
        obj.reverseInPlace(array);
    }
    
}
