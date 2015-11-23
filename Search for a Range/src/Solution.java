public class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirstIndex(nums, 0, nums.length, target), findLastIndex(nums, 0, nums.length, target)};
    }

    private int findFirstIndex(int[] nums, int headIndex, int len, int target) {
        if (len == 1) {
            if (target == nums[headIndex]) {
                return headIndex;
            } else {
                return -1;
            }
        } else {
            int p = len / 2;
            int p1 = nums[headIndex + p - 1];
            int p2 = nums[headIndex + p];
            if (target <= p1) {
                return findFirstIndex(nums, headIndex, p, target);
            } else if (target > p2) {
                return findFirstIndex(nums, headIndex + p, len - p, target);
            } else if (target > p1 && target < p2) {
                return -1;
            } else if (target == p2) {
                return headIndex + p;
            } else {
                return -1;
            }
        }
    }

    private int findLastIndex(int[] nums, int headIndex, int len, int target) {
        if (len == 1) {
            if (target == nums[headIndex]) {
                return headIndex;
            } else {
                return -1;
            }
        } else {
            int p = len / 2;
            int p1 = nums[headIndex + p - 1];
            int p2 = nums[headIndex + p];
            if (target < p1) {
                return findLastIndex(nums, headIndex, p, target);
            } else if (target >= p2) {
                return findLastIndex(nums, headIndex + p, len - p, target);
            } else if (target > p1 && target < p2) {
                return -1;
            } else if (target == p1) {
                return headIndex + p - 1;
            } else {
                return -1;
            }
        }
    }
}