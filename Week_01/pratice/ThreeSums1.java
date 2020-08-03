package pratice;

import java.util.*;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-28 21:55
 */
public class ThreeSums1 {

    public List<List<Integer>> threeSumVersion1(int[] nums) {
        if(nums == null || nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for (int k = j + 1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(value);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static List<List<Integer>> threeSumVersion2(int[] nums) {
        if(nums == null || nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++){
            if(nums[k] > 0){
                break;
            }
            if(k > 0 && nums[k] == nums[k - 1]){
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j){
                int sum = nums[j] + nums[k] + nums[i];
                if(sum < 0){
                    while (i < j && nums[i] == nums[++i]){}
                }else if(sum > 0){
                    while (i < j && nums[j] == nums[--j]){}
                }else {
                    List<Integer> value = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(value);
                    while (i < j && nums[i] == nums[++i]){}
                    while (i < j && nums[j] == nums[--j]){}
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arra = {-1,0,1,2,-1,-4};
        threeSumVersion2(arra);
    }

}
