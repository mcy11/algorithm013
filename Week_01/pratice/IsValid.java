package pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author yd
 * @version 1.0
 * @date 2020-08-01 10:56
 */
public class IsValid {

    public boolean isValid(String s) {
        Map<Character ,Character> paramMap = new HashMap<>();
        paramMap.put(']','[');
        paramMap.put('}','{');
        paramMap.put(')','(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(paramMap.containsKey(temp)){
                Character character = stack.empty()? '1':stack.pop();
                if(!character.equals(paramMap.get(temp))){
                    return false;
                }
            }else {
                stack.push(temp);
            }
        }
        return stack.empty();
    }

}
