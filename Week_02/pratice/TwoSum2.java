package pratice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yd
 * @version 1.0
 * @date 2020-08-03 16:43
 */
public class TwoSum2 {

    public int[] twoSumVersion1(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(tempMap.containsKey(need)){
                return new int[]{i, tempMap.get(need)};
            }
            tempMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumVersion2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
