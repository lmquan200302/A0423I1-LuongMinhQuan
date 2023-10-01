package _16_String_Regex.ThucHanh.Check_Account;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckAccount {
    private static Pattern pattern;
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public CheckAccount(){
          pattern = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validate(String account){
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }

}
