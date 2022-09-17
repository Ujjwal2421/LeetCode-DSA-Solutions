import java.util.*;

public class SamllestDifference {
    public static void main(String[] args) {
        // int[] arr={1,3,15,11,2};
        // int[] arr2={23,127,235,19,8};
        // Arrays.sort(arr);
        // Arrays.sort(arr2);
        
        // int i=0;
        // int i1=0;
        // int min=Integer.MAX_VALUE;
        // while(i<arr.length && i1<arr2.length){
            //     if(Math.abs(arr[i]-arr2[i1]) <min){
                //         min=Math.abs(arr[i]-arr2[i1]);
                //     }
                //     if(arr[i]<arr2[i1]){
                    //         i++;
                    //     }else{
                        //         i1++;
                        //     }
                        // }
                        // System.out.println(min);
                        StringBuilder str=new StringBuilder("aabccba");
                        System.out.println(removeConsecutive(str));
                    }
                    public static String removeConsecutive(StringBuilder str) 
                    {
                        StringBuilder sb=new StringBuilder();
                        Stack<Character> s=new Stack<>();
                        s.push('0');
                        
                        for(int i=1;i<str.length();i++){
                            if(str.charAt(i-1)==str.charAt(i)){
                                if(str.charAt(i)!=s.peek()){
                                    s.push(str.charAt(i));
                                }
                            }else{
                                s.push(str.charAt(i));
                            }
                        }
                        while(s.size()>1){
                            sb.append(s.pop());
                        }
                        return sb.toString();
                    }
                }
                