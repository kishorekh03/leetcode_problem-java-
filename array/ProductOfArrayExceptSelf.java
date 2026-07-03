package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] bruteForce(int[] nums) {

        int[] product = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int total = 1;

            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    total *= nums[j];
                }
            }

            product[i] = total;
        }

        return product;
    }
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

        System.out.println(Arrays.toString(obj.bruteForce(nums)));
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }
}