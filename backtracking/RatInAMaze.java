package backtracking;

import java.util.Scanner;

public class RatInAMaze {
	
	public static boolean ratInAMaze(int maze[][]){
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze, 0, 0, path);
	}

	public static boolean solveMaze(int maze[][], int i, int j, int path[][]){
		int n = maze.length;
		if(i  < 0 || i >= n || j < 0 || j >= n  || maze[i][j] == 0 || 	path[i][j] == 1) {
			return false;
		}
		path[i][j] = 1;
		if(i == n - 1 && j == n - 1) {	
			path[i][j] = 0;		
			return true;
		}
		boolean pathPossible = false;	
		if(solveMaze(maze, i - 1, j, path)){
			pathPossible = true;
		}
		else if(solveMaze(maze, i, j + 1, path)){
			pathPossible = true;
		}
		else if(solveMaze(maze, i + 1 , j, path)){
			pathPossible = true;
		}
		else if(solveMaze(maze, i, j - 1, path)){
			pathPossible = true;
		}		
		return pathPossible;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(ratInAMaze(maze));
		s.close();
	}
}
