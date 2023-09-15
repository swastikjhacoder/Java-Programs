package fulltest2;
import java.io.*;
import java.util.*;
public class RainbowArray {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		israinbow(a);
	}

	public static void israinbow(int [] arr) {
		int flag = 0;
	    for(int i = 0; i < arr.length; i++) {
	    	if(arr[i] != arr[arr.length - i - 1]) {
	    		flag = 0;
	    		break;
	    	}
	    }
	    if(flag == 0) {
	    	int k = 1;
	    	int b[] = {0,0,0,0,0,0,0};
	    	while(k <= 7) {
	    		for(int i = 0; i < arr.length; i++) {
	    			if(arr[i] == k)
	    				b[k-1]++;
	    		}
	    		k++;
	    		for(int i = 0; i < 7; i++) {
	    			if(b[i] == 0) {
	    				flag++;
	    				break;
	    			}
	    		}
	    	}
    		if(flag == 0)
    			System.out.println("Yes");
    		else
    			System.out.println("No");
	    }
	}
}
