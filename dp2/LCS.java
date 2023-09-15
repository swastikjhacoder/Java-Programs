package dp2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int lcs(String s, String t) {
		int[][] storage = new int[s.length() + 1][t.length() + 1];
		return lcsDP(s, t, storage);
	}
	
	public static int lcsDP(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		int storage1[][] = new int[s.length() + 1][t.length() + 1];
		for(int i=0;i<=m;i++) {
			storage1[i][0]=0;
		}
		for(int i=0;i<=n;i++) {
			storage1[0][i]=0;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					storage1[i][j]=1+storage1[i-1][j-1];
				}else {
					storage1[i][j]=Math.max(storage1[i][j-1],storage1[i-1][j]);
				}
			}
		}
		return storage1[m][n];
    }

	public static void main(String[] args) throws IOException {
		String s = br.readLine().trim();
        String t = br.readLine().trim();
        System.out.println(lcs(s, t));
	}

}
