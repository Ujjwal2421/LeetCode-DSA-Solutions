package StackPractise;

import java.util.Stack;

// TC: 0(n)  and SC: 0(n)
public class ReverseString {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverse(s));
    }
    static String reverse(String s){
        Stack<Character> stack=new Stack<>();
        if(s.length()==0){
            return "";
        }
        for (int i = s.length()-1; i>=0 ; i--) {
            stack.push(s.charAt(i));
        }
        StringBuilder st=new StringBuilder();
        while(!stack.isEmpty()){
            st.insert(0,stack.pop());
        }
        return st.toString();
    }
}
