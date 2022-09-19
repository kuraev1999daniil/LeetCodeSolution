package easy.p205_isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sSymbols = new HashMap<>();
        Map<Character, Character> tSymbols = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sSymbols.containsKey(sChar)) {
                if (tSymbols.get(tChar) != null) {
                    if (tSymbols.get(tChar) != sChar) return false;
                }
                sSymbols.put(sChar, tChar);
                tSymbols.put(tChar, sChar);
            } else if (sSymbols.get(sChar) != tChar) {
                return false;
            }
        }

        return true;
    }
}
