package _09_DSA_Stack_Queue.BaiTap.KiemTraDauNgoac;

import java.util.Stack;

public class check {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                check.push(')');
            }
            else if (check.empty() || check.pop() != ch) {
               return false;

            }


        }
        return check.empty();
    }
}


