package _4_kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Binary multiple of 3
 *
 * @author Krzysztof Wójcik
 */
public class BinaryRegexp {

    public static void main(String[] args) {

    }


    public static Pattern multipleOf3() {
        String REGULAR_EXPRESSION = "(1(01*0)*1|0)*";
        return Pattern.compile(REGULAR_EXPRESSION);
    }

}
