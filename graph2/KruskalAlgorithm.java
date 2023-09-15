package graph2;
import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
    int source;
    int dest;
    int weight;
    
    public int compareTo(Edge o) {
        return this.weight - o.weight; 
    }
}

public class KruskalAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(); 
        int E = sc.nextInt(); 
        Edge[] input = new Edge[E];
        for(int i=0;i<E;i++) {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            int weight = sc.nextInt();
            Edge edge = new Edge(); 
            edge.source = sv;
            edge.dest = ev;
            edge.weight = weight;
            input[i] = edge;
        }
        Arrays.sort(input);
        kruskals(input,V);
        sc.close();
	}

public static void kruskals(Edge[] input, int V) {
		Edge[] output = new Edge[V-1]; 
		int[] parent = new int[V]; 
		for(int i=0;i<parent.length;i++) {
			parent[i] = i; 
		}
		int count =0;
		int i=0;
		while(count<V-1) {
			int parentSource = findParent(parent,input[i].source);
			int parentDest = findParent(parent,input[i].dest);
			if(parentDest == parentSource) {
				i++;
				continue;
			}
			output[count] = input[i];
			parent[parentSource] = parentDest; 
			count++;
			i++;
		}
		for(Edge edge : output) {
			if(edge.source < edge.dest)
			System.out.println( edge.source +" "+ edge.dest+" "+ edge.weight);
			else {
				System.out.println(edge.dest+" "+ edge.source+" " + edge.weight);
			}	
		}
	}

	public static int findParent(int[] parent, int i) {
		if(parent[i] == i) {
			return i;
		}
		return findParent(parent, parent[i] );
	}
}
