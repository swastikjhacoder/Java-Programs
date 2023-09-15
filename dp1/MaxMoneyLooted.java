package dp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMoneyLooted {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static int[] takeInput() throws IOException {
		int n = Integer.parseInt(br.readLine().trim());
		if (n == 0) {
			return new int[0];
		}
		String[] strNums = br.readLine().trim().split("\\s");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strNums[i]);
        }
        return arr;
	}
	
	public static int maxMoneyLooted(int[] houses) {
		if (houses.length == 0)
			return 0;

		int v1 = houses[0];
		if (houses.length == 1)
			return v1;

		int v2 = Math.max(houses[0], houses[1]);
		if (houses.length == 2)
			return v2;
		int max_val = 0;
		for (int i = 2; i < houses.length; i++) {
			max_val = Math.max(houses[i] + v1, v2);
			v1 = v2;
			v2 = max_val;
		}
		return max_val;
	}

	public static void main(String[] args) throws IOException {
		int[] arr = takeInput();
        System.out.println(maxMoneyLooted(arr));
	}

}
