import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] adjMat = new int[n+1][n+1];
		
    //Making edge
		for(int i=0; i<m; i++) {
			int u = input.nextInt();
			int v = input.nextInt();
			adjMat[u][v] = 1; 
			adjMat[v][u] = 1;
		}
	}
}
