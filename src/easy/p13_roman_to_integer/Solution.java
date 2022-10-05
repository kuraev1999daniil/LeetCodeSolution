package easy.p13_roman_to_integer;

import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {
        HashMap<String, Integer> weightSymbols = new HashMap<>();
        weightSymbols.put("I", 1);
        weightSymbols.put("V", 5);
        weightSymbols.put("X", 10);
        weightSymbols.put("L", 50);
        weightSymbols.put("C", 100);
        weightSymbols.put("D", 500);
        weightSymbols.put("M", 1000);
        weightSymbols.put("IV", 4);
        weightSymbols.put("IX", 9);
        weightSymbols.put("XL", 40);
        weightSymbols.put("XC", 90);
        weightSymbols.put("CD", 400);
        weightSymbols.put("CM", 900);

        int result = 0;

        int count = 0;
        while (count < s.length()) {
            char symbol = s.charAt(count);
            if ((symbol == 'I' || symbol == 'X' || symbol == 'C') && (count + 1 < s.length())) {
                String combine = "" + symbol + s.charAt(count + 1);
                if (weightSymbols.get(combine) != null) {
                    result += weightSymbols.get(combine);
                    count += 2;

                    continue;
                }
            }

            result += weightSymbols.get("" + symbol);
            count++;
        }

        return result;
    }
}
