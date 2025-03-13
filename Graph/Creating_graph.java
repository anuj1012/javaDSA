package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Creating_graph {
    public static class Edge{
        int src;
        int dst;
//        int weight;
        Edge(int sc,int dst){
            this.src=sc;
            this.dst=dst;
//            this.weight=wt;
        }
    }
    public static void creatingraph(ArrayList<Edge>graph[]){
        for (int i=0;i<graph.length;i++){
         graph[i]=new ArrayList<>();
        }
     graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));


    }
    public static void BFS(ArrayList<Edge> graph[],int V){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]==false){
                System.out.print(curr +" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge a=graph[curr].get(i);
                    q.add(a.dst);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge> graph[] = new ArrayList[V];


        creatingraph(graph);
//        for(int i=0;i<graph[2].size();i++){
//
//            System.out.println(graph[2].get(i).dst);
//        }

        BFS(graph,V);
    }
}
