package easy.p724_find_pivot_index;

/**
 * <a href="https://leetcode.com/problems/find-pivot-index/">724. Find Pivot Index</a>
 * */
public class Solution {

    public int pivotIndex(int[] nums) {
        int sumNums = sum(nums);
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sumNums -= nums[i];
            if (sumNums == currentSum) {
                return i;
            } else {
                currentSum += nums[i];
            }
        }

        return -1;
    }

    private int sum(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result += num;
        }

        return result;
    }
}