package group2test;

import java.util.Scanner;

public class Power {
	static Scanner s=new Scanner(System.in);
	
    public static int[] takeInput(){
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }

	static long power(long x, long y, long p) {
		long res = 1;
		x = x % p;
		while (y > 0) {
			if ((y & 1) > 0) {
				res = (res * x) % p;
			}
			y = y >> 1; // y = y/2
			x = (x * x) % p;
		}
		return res;
	}
	
	public static int myPower(int x, int y, int z) {
		int a = x % z;
		int t = 1;
		while( y > 0 )
		{
			// Y is odd
			if( y % 2 == 1 )
			{
				t = (t * a) % z;
			}
			y >>= 1;
			a = (a * a) % z;
		}
		return(t);
	}
	
	public static void main (String[] args) {
		int a = s.nextInt();
		int[] arr = takeInput();
		int b = 0;
		for(int i = 0; i < arr.length; i++) {
			int dig = arr[i];
			b = b * 10 + dig;
		}
		
		int remainderB = 0;
		int MOD = 1337;
		remainderB = (remainderB * 10 + b) % (MOD - 1);
		System.out.println(myPower(a, remainderB, MOD));
	}
}
