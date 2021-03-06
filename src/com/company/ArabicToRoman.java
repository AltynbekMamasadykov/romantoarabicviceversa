package com.company;
import java.util.Collections;
import java.util.TreeMap;

public class ArabicToRoman {

    private static final TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
    public static String convertArabicToRoman(int num) {
        StringBuilder roman = new StringBuilder("");
        for (Integer i: map.keySet()) {
            for (int j = 1; j <= num / i; j++) {
                roman.append(map.get(i));
            }
            num %= i;
        }
        return roman.toString();
    }
}
