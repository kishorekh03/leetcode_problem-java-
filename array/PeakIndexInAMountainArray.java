package array;

public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // We are on the increasing slope
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // We are on the decreasing slope (or at the peak)
            else {
                end = mid;
            }
        }

        // start == end, both point to the peak
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 8, 9, 5, 2};

        PeakIndexInAMountainArray obj = new PeakIndexInAMountainArray();

        System.out.println("Peak Index: " + obj.peakIndexInMountainArray1(nums));
    }
}