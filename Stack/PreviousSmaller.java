package StackPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousSmaller {
    public static void main(String[] args) {
            int arr[]={4,10,5,8,20,15,3,12};
        System.out.println(previousSm(arr));
        System.out.println(next(arr));
        System.out.println(previousGreater(arr));
    }

    static List<Integer> previousSm(int arr[]) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
    static List<Integer> next(int arr[]) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i =arr.length-1; i >=0; i--) {
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
    static List<Integer> previousGreater(int arr[]) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                list.add(-1);
            }
            else{
                list.add(st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }

    }

