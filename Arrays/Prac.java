import java.util.*;
import java.util.Map;
// Reverse Mapping 
public class Prac {
    public static void main(String[] args) {
        int[] arr={-1,4,0,1,2,3};
        func(arr);
    }
    public static void func(int[] arr){
        int[] ans=new int[arr.length];
        Map<Integer,Integer> m=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==-1) ans[0]=i;
            else m.put(arr[i],i);
        }
        int index=1;
        while(index<ans.length){
            int a=ans[index-1];
            ans[index++]=m.get(a);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
