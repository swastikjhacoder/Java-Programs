package graph1;

import java.util.*;

public class IsConnected {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
        if(v==0){
            System.out.print("true");
            s.close();
            return;
        }
		int[][] edges = new int[v][v];
		for(int i=0;i<e;i++) {
			int sv = s.nextInt();
			int ev = s.nextInt();
			edges[sv][ev] = 1;
			edges[ev][sv] = 1;
		}
		System.out.println(isConnected(edges,0));
		s.close();
	}

	public static boolean isConnected(int[][] edges,int sv) {
        boolean[] visited = new boolean[edges.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sv);
        visited[sv] = true;
        while(!queue.isEmpty()) {
            int front = queue.poll();
            for(int i=0;i<edges.length;i++) {
                if(!visited[i] && edges[front][i] ==1) {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        for(boolean b : visited) {
            if(!b) {
                return false;
            }
        }
        return true;
    }
}
