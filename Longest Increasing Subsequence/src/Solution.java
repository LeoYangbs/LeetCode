public class Solution {
    public int lengthOfLIS(int[] nums) {
        int max = 1;
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] f = new int[length + 1];
        f[0] = 1;
        for (int i = 1; i < length; i++) {
            int maxp = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (maxp < f[j] + 1) {
                        maxp = f[j] + 1;
                    }
                }
            }
            f[i] = maxp;
            if (maxp > max) {
                max = maxp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }
}