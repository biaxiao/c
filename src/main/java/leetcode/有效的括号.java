package leetcode;

import java.util.Stack;

public class 有效的括号 {
    public static boolean isValid(String s) {
        Stack<Character> stack =new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()){
                    return false;
                }
                Character pop = stack.pop();
                if(c == ')'&& pop != '('){
                    return false;
                }
                if(c == ']'&& pop != '['){
                    return false;
                }
                if(c == '}'&& pop != '{'){
                    return false;
                }
            }
        }

        if(!stack.empty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="()[]{}";
        System.out.println(isValid(s));
    }
}
