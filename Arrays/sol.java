import java.util.ArrayList;

public class sol{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        // arr.add(e);
        System.out.println(SmallerElements( arr));
    }
    
    static int SmallerElements( ArrayList<Integer> list) {
        int count=0;
        for(int index=1;index<list.size();index++){
            if(list.get(index-1)>list.get(index)){
                count+=1;
            }
        }
        return count;
    }
}