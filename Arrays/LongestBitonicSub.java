package Graph;

import java.util.Arrays;

public class LongestBitonicSub {
  public static void main(String[] args) {
      int[] arr={1,11,2,10,4,5,2,1};
      int n=arr.length;
      int[] dp=new int[n];
      int[] dp2=new int[n];
      Arrays.fill(dp, 1);
      Arrays.fill(dp2, 1);
      
      for(int i=0;i<n;i++){
          for(int j=0;j<i;j++){
              if(arr[i]>arr[j] && 1+dp[j]>dp[i]){
                  dp[i]=1+dp[j];
              }
          }
      }
      for(int i=n-1;i>=0;i--){
        for(int j=n-1;j>i;j--){
            if(arr[i]>arr[j] && 1+dp2[j]>dp2[i]){
                dp2[i]=1+dp2[j];
            }
        }
    }
        int maxi=1;
        for(int i =0;i<n;i++){
            maxi=Math.max(maxi, dp[i]+dp2[i]-1);
        }
        System.out.println("The longest bitonic increasing Subsequence is= " +maxi);
    }
  }  