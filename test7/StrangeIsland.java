package test7;

import java.util.Scanner;

public class StrangeIsland {
	
    public static int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
            	if (visited[i][j] == false && grid[i][j] == '1') {
                    DFStraverse(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    static void DFStraverse(char[][] grid, int row, int col, boolean visited[][]) {
        if (row < 0 || col < 0 || row == grid.length || col == grid[0].length || grid[row][col] == '0' || visited[row][col] == true) {
            return;
        }
        visited[row][col] = true;
        DFStraverse(grid, row, col - 1, visited);
        DFStraverse(grid, row, col + 1, visited);
        DFStraverse(grid, row - 1, col, visited);
        DFStraverse(grid, row + 1, col, visited);
    }
    
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        char grid[][] = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("Grid:- ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(numIslands(grid));
    }
}
