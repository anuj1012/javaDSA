package Graph;

import java.util.ArrayList;

public class Basic_understanding {
    static class edge{
        int src;
        int dst;
        int wt;
        edge(int s,int d,int weight){
            this.src=s;
            this.dst=d;
            this.wt=weight;
        }
    }
    public static void createGraph(ArrayList<edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<edge>();
        }
        graph[0].add(new edge(0,2,2));
        graph[1].add(new edge(1,3,0));
        graph[1].add(new edge(1,2,10));
        graph[2].add(new edge(2,3,-1));
        graph[2].add(new edge(2,1,10));
        graph[2].add(new edge(2,0,2));
        graph[3].add(new edge(3,2,-1));
        graph[3].add(new edge(3,1,0));
    }
    public static void main(String[] args) {
    int V=4;
        ArrayList<edge> graph[]=new ArrayList[V];
        createGraph(graph);
        //Printing the neighbour's of 2;
        for(int i=0;i<graph[2].size();i++){
            edge e=graph[2].get(i);
            System.out.println(e.dst +" " +e.wt);
        }
    }
}
