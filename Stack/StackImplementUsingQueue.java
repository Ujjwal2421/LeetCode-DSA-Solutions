package StackPractise;

import java.util.LinkedList;
import java.util.Queue;

class Implement{
      Queue<Integer> q1=new LinkedList<>();
      Queue<Integer> q2=new LinkedList<>();
      int size;
     Implement(){
        size=0;
    }
    public void push(int x){
         size++;
        q2.add(x);
        while(!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q=q1;
        q1=q2;
        q2=q;
    }
    public void pop(){
         if(q1.isEmpty())
             return;
         q1.remove();
         size--;
    }
    public int top(){
         if(q1.isEmpty())
             return -1;
         return q1.peek();
    }
    public int length(){
         return size;
    }
}



public class StackImplementUsingQueue {
    public static void main(String[] args) {
        Implement i=new Implement();
        i.push(2);
        i.push(22);
        i.push(23);
        i.push(24);
        i.push(25);
        System.out.println(i.length());
        i.pop();
        System.out.println(i.top());
        i.pop();
        System.out.println(i.top());
        System.out.println(i.length());
    }
}
