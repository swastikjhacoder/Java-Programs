package graph2;

import java.util.Scanner;

public class DijkstraAlgorithm {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
		int [][]  graph = new int [V][V];
        int t1,t2,cost;
        while(E>0) {
            E--;
            t1 = s.nextInt();
            t2 = s.nextInt();
            cost = s.nextInt();
            graph[t1][t2] =  cost;
            graph[t2][t1] = cost;
        }
        int [] dis = new int [V];
        boolean [] visited = new boolean[V];
        for(int i=1;i<V;i++)
            dis[i] = Integer.MAX_VALUE;
    	int source=0;
        for(int i=0;i<V;i++) {
            source = findMinVertex(dis,visited);
            visited[source] =  true;
            for(int j=0;j<V;j++) {
                if(graph[source][j]>0 && visited[j]== false && dis[j] > dis[source]+graph[source][j]) {
                     dis[j] = dis[source]+graph[source][j];
                }
            }
        }
        for(int i=0;i<V;i++)
        	System.out.println(i+" "+dis[i]);
        s.close();
	}

	public static int findMinVertex(int [] dis, boolean [] visited) {
     	int v, min_edge,n;
        min_edge = Integer.MAX_VALUE;
        n = dis.length;
        v=-1;
        for(int i=0;i<n;i++) {
            if(min_edge>dis[i] && visited[i]==false) {
                min_edge =  dis[i];
                v = i;
            }
        }
        return v;
	}
}
