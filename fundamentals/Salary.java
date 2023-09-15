package fundamentals;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		int basic;
		long ts;
		double da, hra, pf, totalSalary, allow = 0.0;
		char grade;
		Scanner s = new Scanner(System.in);
		basic = s.nextInt();
		grade = s.next().charAt(0);
		hra = basic * 0.2;
		da = basic * 0.5;
		if (grade == 'A') {
			allow = 1700;
		} else if (grade == 'B') {
			allow = 1500;
		} else if (grade == 'C') {
			allow = 1300;
		}
		pf = basic * 0.11;
		totalSalary =(double)((basic + hra + da + allow) - pf);
		ts=(long)(Math.round(totalSalary));
		System.out.println(ts);
	}

}
