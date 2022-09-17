package Graph;

import java.util.Arrays;

public class LongestlnSub{
    public static void main(String[] args) {
        int n = 6 ; 
        String s="cheese";
        char[] ch =s.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     System.out.print(ch[i]+ ",");
        // }   
        int count=1;
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]) count++;
        }
        System.out.println("The length of the string is "+s.length());
        System.out.println(count);
        if(count==n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }   
    }
}