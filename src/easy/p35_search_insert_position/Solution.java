package easy.p35_search_insert_position;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;

        while (upperBound >= lowerBound) {
            int middle = (lowerBound + upperBound) / 2;
            int current = nums[middle];
            if (target > current) {
                lowerBound = middle + 1;
            } else if (target < current) {
                upperBound = middle - 1;
            } else {
                return middle;
            }
        }

        return lowerBound;
    }
}
