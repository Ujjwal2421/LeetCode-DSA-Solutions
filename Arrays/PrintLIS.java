package Graph;

import java.util.Arrays;

public class PrintLIS{
    public static void main(String[] args) {
      int[] arr={5,4,11,1,16,8};

      int max=1;
        int lastIndex=0;
        int[] dp=new int[arr.length];
        int[] hash=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            hash[i]=i;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    hash[i]=j;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                lastIndex=i;
            }
        }
        int ans[]=new int[arr.length];
        ans[0]=arr[lastIndex];
        int index=1;
        while(hash[lastIndex]!=lastIndex){
            lastIndex=hash[lastIndex];
            ans[index++]=arr[lastIndex];
        }
        Arrays.sort(ans);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
    }
}