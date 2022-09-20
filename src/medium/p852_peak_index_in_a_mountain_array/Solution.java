package medium.p852_peak_index_in_a_mountain_array;

public class Solution {

    public int peakIndexInMountainArray(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
