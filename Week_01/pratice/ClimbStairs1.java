package pratice;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-07-28 17:51
 */
public class ClimbStairs1 {

    public static int climbStairs(int n) {
        if(n == 1 || n == 2){
            return n;
        }
        int a = 1, b = 2, result = 0;
        for (int i = 3; i <= n; i++){
            result = a + b;
             a = b;
             b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        climbStairs(2);
    }
}
