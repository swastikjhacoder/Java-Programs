package group2test;
import java.io.*;
import java.util.*;
public class DistinctPower {
	
	public static boolean calculate(int[] power, int idx, int SumSoFar, int target) {
		if (idx == power.length) {
			if (SumSoFar == target)
				return true;
			return false;
		}
		boolean notselect = calculate(power, idx + 1, SumSoFar, target);
		boolean select = calculate(power, idx + 1, SumSoFar + power[idx], target);
		return (select || notselect);
	}
	
	public static boolean checkPowersOfThree(int N) {
		int[] power = new int[16];
		power[0] = 1;
		for (int i = 1; i < 16; i++)
		power[i] = 3 * power[i - 1];
		boolean found = calculate(power, 0, 0, N);
		return found;
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        int t = Integer.parseInt(br.readLine().trim());
        while (t != 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(checkPowersOfThree(n));
            t--;
        }

    }

}
