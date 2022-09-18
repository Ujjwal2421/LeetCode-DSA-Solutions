public class MinimumSwaps{
    public static void main(String[] args) {
        int[] arr={2, 7, 9, 5, 8, 7, 4};
        System.out.println("The minimum number of swaps is ="+swap(arr,6));
    }
    static int swap(int arr[],int n){
        if(arr.length==0) return 0;
        int good=0;
        int bad=0;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i]<=n){
              good+=1;
          }
    }
    for (int i = 0; i <good; i++) {  
        if(arr[i]>n){
            bad+=1;
        }
    }
    int k=0, j=good, ans=bad;
    while(j<arr.length){
        if(arr[k]>n){
            bad--;
        }
        if(arr[j]<n){
            bad++;
        }
        ans=Math.min(ans,bad);
        k++;j++;
    }
    return ans;
    }
}
