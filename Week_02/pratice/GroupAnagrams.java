package pratice;

import java.util.*;

/**
 * @author yd
 * @version 1.0
 * @date 2020-08-03 16:18
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            if (!result.containsKey(key)) {
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
