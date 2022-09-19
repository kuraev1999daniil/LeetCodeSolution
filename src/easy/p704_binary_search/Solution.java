package easy.p704_binary_search;

public class Solution {

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (end >= start) {
            int current = nums[(start + end) / 2];
            int middle = (start + end) / 2;
            if (target > current) {
                start = middle + 1;
            } else if(target < current) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
