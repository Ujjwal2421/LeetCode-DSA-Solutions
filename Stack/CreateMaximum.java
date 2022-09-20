package StackPractise;

import java.util.ArrayList;
import java.util.List;

public class CreateMaximum {
    public static void main(String[] args) {
        int num=886869;
        System.out.println(maximumSwap(num));
    }
    static int maximumSwap(int num){
     char[] chars=String.valueOf(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j=chars.length-1;
            int index=i;
            while(j>i){
                if(chars[j]>chars[i]){
                    chars[i]=chars[j];
                    index=j;
                }
                j--;
                }
            if(index!=i) {
                char temp = chars[i];
                chars[i] = chars[index];
                chars[index] = temp;
                return Integer.parseInt(String.valueOf(chars));
            }
        }
        return num;
    }
}
