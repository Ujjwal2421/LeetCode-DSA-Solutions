package StackPractise;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        s.push('1');
        s.push('2');
        s.push('3');
        s.push('4');

        System.out.println("Original Stack");

        System.out.println(s);

        // function to reverse
        // the stack
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(s);
        deleteMiddleElement(s, s.size(), 0);
        System.out.println(s);
        String st = "abc d efg";
        function(st);

    }
    static Stack<Character> s=new Stack<>();
    static void insertBottom(char x){

        if(s.isEmpty()){
            s.push(x);
        }
        else{
            char a=s.peek();
            s.pop();
            insertBottom(x);
            s.push(a);
        }
    }
    static  void reverse(){
        if(s.size()>0){
            char a= s.peek();
            s.pop();
            reverse();
            insertBottom(a);
        }
    }
    static void deleteMiddleElement(Stack<Character> s,int n, int curr){

        if(s.isEmpty() || curr==n){
            return;
        }
        char c= s.pop();

        deleteMiddleElement(s,n,curr+1);

        if(curr!=n/2){
            s.push(c);
        }
    }
   static void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }
}
