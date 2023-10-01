package _16_String_Regex.ThucHanh.CheckEmail_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {
    private static Pattern pattern;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ValidationUtil(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public static boolean isEmail(String email){
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
