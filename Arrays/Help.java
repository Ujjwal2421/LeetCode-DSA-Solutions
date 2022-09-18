package JavaS;

public class Help {
    public static void main(String[] args) {
        int[] nums={1,0,0,0,1,0,0,1};
        int k=2;
        hell(nums, k);
    }
    public static void hell(int[] nums,int k){
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==1){
            arr[i++]=i;
            }else{
                i++;
            }
        }
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] +" ");
    }
}
}
