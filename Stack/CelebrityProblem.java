package StackPractise;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
         int[][] arr = { { 0, 0, 1, 0 },
                         { 0, 0, 1, 0 },
                         { 0, 0, 0, 0 },
                         { 0, 0, 1, 0 } };
        System.out.println( solve(arr));
    }
    static int solve(int[][] arr){
        if(arr.length==0){
            return 0;
        }
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while(st.size()>=2){
            int a= st.pop();
            int b= st.pop();
            if(arr[a][b]==1){
                st.push(b);
            }else{
                st.push(a);
            }
        }
        int pot= st.pop();
        for (int i = 0; i < arr.length; i++) {
            if(i!=pot){
                if(arr[i][pot]==0 || arr[pot][i]==1){
                    return -1;
                }
            }
        }
        return pot;
    }
}
