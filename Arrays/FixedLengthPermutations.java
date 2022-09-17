package Graph;

import java.util.Arrays;

public class FixedLengthPermutations {
    public static void main(String[] args) {
        int n = 5; 
        String s="abacd";
        char[] ch =s.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     System.out.print(ch[i]+ ",");
        // }   
        int count=0;
        Arrays.sort(ch);
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]!=ch[i+1]) count++;
        }
        if(count==n){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    
}
