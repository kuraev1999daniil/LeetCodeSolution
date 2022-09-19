package easy.p392_is_subsequence;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        Queue<Character> symbols = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            symbols.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if (symbols.isEmpty()) return true;

            if (t.charAt(i) == symbols.peek()) {
                symbols.remove();
            }
        }

        return symbols.isEmpty();
    }
}
