package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Vertex{
    public char label;
    public boolean visit;
    Vertex(char lab){
        this.label=lab;
    }
}
class Node{
    int first,second;
    Node(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Graph{
    public int MAX_VERTEX=20;
    public Vertex vertexList[];
    public int[][] adjM;
    public int vertex;
    public Stack<Integer> s;
    Graph(){
        vertexList=new Vertex[MAX_VERTEX];
        adjM=new int[MAX_VERTEX][MAX_VERTEX];
        vertex=0;
        s=new Stack<>();
    }
    public void addVertex(char lab){
        vertexList[vertex++]=new Vertex(lab);
    }
    public void addEdge(int start,int end){
        adjM[start][end]=1;
        adjM[end][start]=1;       //Undirected Graph
    }
    public void display(int v){
        System.out.println(vertexList[v].label+ " ");
    }
    public int getVertex(int v){
        for (int i = 0; i < vertex; i++) {
            if(adjM[v][i]==1 && vertexList[i].visit==false){
                return i;
            }
        }
        return -1;
    }
    
    public void dfs(){
        vertexList[0].visit=true;
        display(0);
        s.push(0);
        
        while(!s.isEmpty()){
            int v=getVertex(s.peek());
            if(v==-1){
                s.pop();
            }
            else{
                vertexList[v].visit=true;
                display(v);
                s.push(v);
            }
        }
    }
    // public void  bfs(){
        //     vertexList[0].visit=true;
        //     display(0);
        //     q.add(0);
        //     int v2;
        //     while(!q.isEmpty()){
            //         int v=q.remove();
            //         if((v2=getVertex(v))!=1){
                //             vertexList[v2].visit=true;
                //             display(v2);
                //             q.add(v2);
                //         }
                //     }
                // }
                public boolean hasCycleDirected(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visit,boolean[] dfsVisit){
                    visit[node]=true;
                    dfsVisit[node]=true;
                    
                    for(Integer it:adj.get(node)){
                        if(!visit[it]){
                            if(hasCycleDirected(it, adj, visit, dfsVisit)==true){
                                return true;
                            }else if(dfsVisit[it]==true)
                            return true;
                        }
                        dfsVisit[it]=false;
                    }
                    return false;
                }
                public boolean hasCycleUndirected(int s,ArrayList<ArrayList<Integer>> adj, boolean[] visit, int[] parent){
                    Queue<Node> q=new LinkedList<>();
                    q.add(new Node(s,-1));
                    visit[s]=true;
                    while(!q.isEmpty()){
                        int node=q.peek().first;
                        int par=q.peek().second; 
                        q.remove();
                        for(Integer it: adj.get(node)){
                            if(visit[it]==false){
                                q.add(new Node(it,node));
                                visit[it]=true;
                            }else if(par!=it) return true;
                        }
                    }
                    return false;
                }
                public void shortestPath(int start,int end,ArrayList<ArrayList<Integer>> ans,int n){
                    int[] dist=new int[n];
                    Arrays.fill(dist, Integer.MAX_VALUE);
                    Queue<Integer> q=new LinkedList<>();
                    dist[start]=0;
                    q.add(start);
                    
                    while(!q.isEmpty()){
                        int nd=q.poll();
                        for(int it: ans.get(n)){
                            dist[it]=dist[nd]+1;
                            q.add(nd);
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println(dist[i]+ " ");
                    }
                }   
                public void minimumSpanningTree(){
                    vertexList[0].visit=true;
                    s.push(0);
                    
                    while(!s.isEmpty()){
                        int n=s.pop();
                        int v=getVertex(n);
                        if(v==1) break;
                        else{
                            vertexList[v].visit=true;
                            display(n);
                            display(v);
                            s.push(v);
                        }
                    }
                }
            }
            
            public class GraphM {
                public static void main(String[] args) {
                    Graph g=new Graph();
                    g.addVertex('A');
                    g.addVertex('B');
                    g.addVertex('C');
                    g.addVertex('D');
                    g.addVertex('E');
                    g.addVertex('F');
                    
                    g.addEdge(0, 1);
                    g.addEdge(1, 2);
                    g.addEdge(0, 3);
                    g.addEdge(3, 4);
                    g.addEdge(4, 5);
                    
                    System.out.println("Visit= ");
                    g.dfs();
                    
                    
                }
                
            }
            