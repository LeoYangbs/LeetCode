import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(temp.containsKey(target-nums[i])) {
                return new int[]{temp.get(target-nums[i]), i + 1};
            }
            temp.put(nums[i], i + 1);
        }
        return new int[]{0, 0};
    }

}