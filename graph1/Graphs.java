package graph1;

import java.util.Scanner;

public class Graphs {
	
	public static void dftraversal(int adjMatrix[][], int currentVertex, boolean visited[]){
		visited[currentVertex] = true; 
		System.out.print(currentVertex + " "); 
		for(int i = 0; i < adjMatrix.length; i++){ 
			if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
				dftraversal(adjMatrix, i, visited);
			}
		}
	}

	public static void dftraversal(int adjMatrix[][]){
		boolean visited[]= new boolean[adjMatrix. length];
		dftraversal(adjMatrix, 0, visited);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int adjMatrix[][] = new int[n][n]; 
		for(int i = 0; i <e; i++){
			int v1 = s.nextInt(); 
			int v2 = s.nextInt(); 
			adjMatrix[v1][v2] = 1; 
			adjMatrix[v2][v1] = 1;
		}
		dftraversal(adjMatrix); 
//		for(int i = 0; i<n; i++){
//			for(int j = 0; j<n; j++){
//				System.out.print(adjMatrix[i][j] +" ");
//			}
//			System.out.println();
//		}
		s.close();
	}

}
