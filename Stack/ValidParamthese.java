package StackPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParamthese {
    public static void main(String[] args) {
        String str = "{[]()}}";
        System.out.println(isValid(str));

    }

    static boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;

                char p = st.peek();
                if (ch == ')' && p != '(') return false;
                else if (ch == ']' && p != '[') return false;
                else if (ch == '}' && p != '{') return false;
                else st.pop();
            }
        }

        return st.isEmpty();
    }
}