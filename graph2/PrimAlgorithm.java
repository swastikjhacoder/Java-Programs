package graph2;

import java.util.Scanner;

public class PrimAlgorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int graph [][] = new int [V][V];
        int t1,t2,cost;
        int []weight= new int[V];
       	while(E>0) {
            E--;
            t1=s.nextInt();
            t2=s.nextInt();
            cost = s.nextInt();
            graph[t1][t2] = cost;
            graph[t2][t1] = cost;
        }
        int [] parent = new int[V];
        for(int i=0;i<V;i++) {
            weight[i] = Integer.MAX_VALUE;
        }
        boolean [] visited = new boolean [V];
        parent[0] =-1;
        weight[0] =0;
        int source = 0;
        for(int i=1;i<V;i++){
            source = findMinVertex(weight,visited);
            visited[source]=true;
            for(int j=0;j<V;j++) {
                if(graph[source][j]>0 && visited[j]==false && weight[j] > graph[source][j]) {
                    weight[j] =  graph[source][j];
                    parent[j] = source;
                }
            }
        }
        for(int i = 1;i<V;i++){
            if(i< parent[i])
                System.out.println(i+" "+parent[i]+" "+weight[i]);
            else
                System.out.println(parent[i]+" "+i+" "+weight[i]);
        }
        s.close();
	}

	public static int findMinVertex(int []weight, boolean[] visited) {
        int v, min_edge,n;
        n=weight.length;
        v=0;
        min_edge =  Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(visited[i] == false && min_edge > weight[i]) {
                v = i;
                min_edge = weight[i];
            }
        }
        return v;
	}
}
