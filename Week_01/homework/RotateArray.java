package homework;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-30 15:45
 */
public class RotateArray {

    /**
     * 看了好几遍才完整明白思路，本质思想很简单n次换位纠正n个位置是非常直接的思路，但是往往在编写程序的时候会忽略这种最直接的思想
     * 会下意识觉得这种直接暴力的思想效率不高，会先往复杂了想。但是思想虽然简单，代码的实现还是不简单的，如何计算位移以及有些情况一次循环无法解决
     * @param nums
     * @param k
     */
    public void rotateVersion2(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        int count = 0;
        for(int i = 0; count < nums.length; i++){
            int cur = i;
            int pre = nums[cur];
            do{
                int next = (cur + k)%length;
                int temp = nums[next];
                nums[next] = pre;
                pre = temp;
                cur = next;
                count++;
            }while (i != cur);
        }
    }

    /**
     * 好想
     * @param nums
     * @param k
     */
    public void rotateVersion1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
