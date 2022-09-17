import java.util.*;

public class ShortestPath { 
    public static void main(String[] args) {
        int matrix[][]={{0,1,0,0,0},{0,0,0,1,0},{1,1,1,1,0},{1,1,1,1,0}};
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.print(func(matrix,n,m));
    }
    public static int func(int[][] matrix,int n,int m){
        
        int[] dx={0,-1,1,0};
        int[] dy={1,0,0,-1};
        
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(0,0,0,false));
        boolean[][] visit=new boolean[n][m];
        visit[0][0]=true;
        // int ans=-1;
        while(!q.isEmpty()){
            Pair p=q.poll();
            
            if(p.i==n-1 && p.j==m-1){
                return p.steps;
            }
            for(int i=0;i<4;i++){
                int x=p.i+dx[i];
                int y=p.j+dy[i];
                
                if(x>0 && y>0 && x<n && x<m && !visit[x][y]){
                    visit[x][y]=true;
                    
                    if(matrix[x][y]==0){
                        q.add(new Pair(x,y,p.steps+1,p.flag));
                    }else if(p.flag==false){
                        q.add(new Pair(x,y,p.steps+1,true));
                    }
                }
            }
        }
        return -1;
    }
   static class Pair{
        int i,j,steps;
        boolean flag;
        
        Pair(int i,int j,int steps,boolean flag){
            this.i=i;
            this.j=j;
            this.steps=steps;
            this.flag=flag;
        }
    }
}
