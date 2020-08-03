package homework;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-30 15:36
 */
public class RemoveDuplicate {

    /**
     * 未考虑判空问题，并且1并非特殊情况
     * @param nums
     * @return
     */
    public int removeDuplicatesVersion1(int[] nums) {
        if(nums.length == 1){
            return 1;
        }
        int i = 0, j = 1;
        for (; j < nums.length;){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j++];
            }else {
                j++;
            }
        }
        return i+1;
    }

    public int removeDuplicatesVersion2(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int p = 0;
        int q = 1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p + 1;
    }


}
