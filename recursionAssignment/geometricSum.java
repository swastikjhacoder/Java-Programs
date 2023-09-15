package recursionAssignment;
import java.util.*;
import java.text.*;
public class geometricSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
		s.close();
	}
	
	public static double findGeometricSum(int k){
		if (k == 0) {
            return 1;
		}
        double ans = 1 / (double)Math.pow(2, k) + findGeometricSum(k - 1);
        return ans;
	}
}
