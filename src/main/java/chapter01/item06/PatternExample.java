package chapter01.item06;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PatternExample {

    private static final Pattern ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD] | D?C{0,3})"
            + "(X[CL] | L?X{0,3}) (I[XV] | V?I{0,3})$"
    );

    public static void main(String[] args) {
        String s = "IV";
        boolean matches = isMatches(s);
        System.out.println(matches);
    }

    private static boolean isMatches(String s) {
        return ROMAN.matcher(s).matches();
    }
}
