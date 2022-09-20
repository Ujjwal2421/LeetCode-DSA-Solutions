package StackPractise;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int i, j, n, k = 3, x;
        int arr[]={4,0,-1,3,5,3,6,8};
        int ans[] = func(arr, k);
        System.out.println("Maximum element in every " + k + " window ");
        for (i = 0; i < ans.length; i++)
            System.out.print(ans[i] + "  ");

    }


    static int[] func(int[] arr,int k){
        int n=arr.length;
        int[] ans=new int[n-k+1];
        int index=0;
        Deque<Integer> q=new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while(!q.isEmpty() && arr[q.peekLast()]<arr[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                ans[index++]=arr[q.peek()];
            }
        }
        return ans;
    }
}
