package easy.p409_longest_palindrome;

import java.util.HashMap;

public class Solution {

    public int longestPalindrome(String s) {
        int result = 0;

        HashMap<Character, Integer> symbols = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (!symbols.containsKey(symbol)) {
                symbols.put(symbol, 1);
            } else {
                int numberSymbols = symbols.get(symbol) + 1;

                int numberSymbolPairs = numberSymbols / 2;

                if (numberSymbolPairs != 0) {
                    symbols.put(symbol, numberSymbols - numberSymbolPairs * 2);

                    result += numberSymbols;
                } else {
                    symbols.put(symbol, numberSymbols);
                }
            }
        }

        if (result < s.length()) result++;

        return result;
    }
}
