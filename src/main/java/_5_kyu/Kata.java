package _5_kyu;

import java.util.HashSet;
import java.util.Set;

/**
 * Play with two Strings
 *
 * @author Krzysztof Wójcik
 */
public class Kata {

    public static String workOnStrings(String a, String b) {
        Set<Character> charsOfAinB = occurrences(a, b);
        Set<Character> charsOfBinA = occurrences(b, a);
        return swap(a, charsOfAinB) + swap(b, charsOfBinA);
    }

    public static Set<Character> occurrences(String s, String str) {
        Set<Character> output = new HashSet<>();
        for (char c : s.toCharArray()) {
            long count = str
                    .chars()
                    .filter(ch -> ch == Character.toLowerCase(c) || ch == Character.toUpperCase(c))
                    .count();
            if (count % 2 != 0) {
                output.add(Character.toLowerCase(c));
            }
        }
        return output;
    }

    public static String swap(String s, Set<Character> set) {
        String out = s;
        for (Character c : set) {
            out = out.replaceAll(String.valueOf(c), " ");
            out = out.replaceAll(String.valueOf(c).toUpperCase(), String.valueOf(c).toLowerCase());
            out = out.replaceAll(" ", String.valueOf(c).toUpperCase());
        }
        return out;
    }
}
