package pratice;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-07-28 17:27
 */
public class MaxArea1 {

    public static int maxAreaVersion1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++){
            for (int j = 1; j < height.length; j++){
                int minHeight = Math.min(height[i], height[j]);
                int area = minHeight * (j - i);
                max = Math.max(area, max);
            }
        }
        return max;
    }

    public static int maxAreaVersion2(int[] height){
        int max = 0;
        for(int i = 0, j = height.length - 1; i < j;){
            int minHeight = height[i] < height[j] ? height[i++]:height[j--];
            int area = minHeight * (j - i + 1);
            max = Math.max(area, max);
        }
        return max;
    }

}
