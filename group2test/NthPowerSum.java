package group2test;
import java.util.Scanner;
public class NthPowerSum {

	static Scanner s = new Scanner(System.in);
	
	public static int power(int num, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return power(num, n / 2) * power(num, n / 2);
        else
            return num * power(num, n / 2) * power(num, n / 2);
    }
	
	public static int checkRecursive(int x, int n, int curr_num, int curr_sum) {
        int results = 0;
        int p = power(curr_num, n);
        while (p + curr_sum < x) {
            results += checkRecursive(x, n, curr_num + 1, p + curr_sum);
            curr_num++;
            p = power(curr_num, n);
        }
        if (p + curr_sum == x)
            results++;
        return results;
    }
	
	public static int allWays(int x, int n) {
		return checkRecursive(x, n, 1, 0);
	}

    public static void main(String[] args) {
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(allWays(x, n));
    }
}

