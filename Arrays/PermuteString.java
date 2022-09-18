import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PermuteString {
   static  HashSet<String> hs=new HashSet<>();
    public static void main(String[] args) {
       String s="ABC";
       System.out.println(per(s)); 
    }
    static List<String> per(String s){
        List<String> st=new ArrayList<>();
        int index=0;
        solve(s,index, st);
        Collections.sort(st);
        return new ArrayList<>(hs); 
      
   }
    static String swap(String s,int i,int j){
        char[] ch=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    static void solve(String s,int index,List<String> st){
        if(index>=s.length()){
            hs.add(s);
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
            s=swap(s, index, i);
            solve(s, index+1, st);
            s=swap(s, index, i);
        }
    }
       //simar simar naam jeevan
     
}
