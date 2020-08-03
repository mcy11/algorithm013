package homework;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-28 18:00
 */
public class MoveZeroes1 {

    public static void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j++] = temp;
            }
        }
    }
}
