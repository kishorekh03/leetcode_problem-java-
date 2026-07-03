package array;

public class  {

    // Brute Force Approach
    // Time Complexity: O(n²)
    // Space Complexity: O(1)
    public int bruteForce(int[] height) {

        int maxWater = 0;

        // Try every possible pair of lines
        for (int left = 0; left < height.length; left++) {

            for (int right = left + 1; right < height.length; right++) {

                // Area = Width × Minimum Height
                int area = (right - left) * Math.min(height[left], height[right]);

                // Update maximum area
                if (area > maxWater) {
                    maxWater = area;
                }
            }
        }

        return maxWater;
    }

    // Optimal Two-Pointer Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxArea(int[] height) {

        // Start pointers at both ends
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            // Calculate current container area
            int area = (right - left) * Math.min(height[left], height[right]);

            // Update maximum area found so far
            if (area > maxArea) {
                maxArea = area;
            }

            // Move the pointer with the smaller height
            // because the smaller height limits the area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        ContainerWithMostWater obj = new ContainerWithMostWater();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Brute Force: " + obj.bruteForce(height));
        System.out.println("Two Pointers: " + obj.maxArea(height));
    }
}