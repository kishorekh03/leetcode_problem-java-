package array;

public class ContainerWithMostWater {

    public int bruteForce(int[] height) {

        int maxWater = 0;

        for (int left = 0; left < height.length; left++) {

            for (int right = left + 1; right < height.length; right++) {

                int area = Math.min(height[left], height[right]) * (right - left);

                if (area > maxWater) {
                    maxWater = area;
                }
            }
        }

        return maxWater;
    }

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int area = (right - left) * Math.min(height[left], height[right]);

            if (area > maxArea) {
                maxArea = area;
            }

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