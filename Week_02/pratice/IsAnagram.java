package pratice;

import java.util.HashSet;
import java.util.prefs.PreferencesFactory;

/**
 * @author yd
 * @version 1.0
 * @date 2020-08-03 15:45
 */
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i] != 0){
                return false;
            }
        }
        return true;
    }
}
