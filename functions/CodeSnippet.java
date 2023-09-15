package functions;

public class CodeSnippet {
//	public static void demo(int a, int b){
//	    System.out.println(a + " " + b);
//	}
	
//	public static double add(int a,int b)
//	{
//	    float c=a+b;
//	    return c;
//	}
	
//	public static void func1(int a)
//	{
//	    System.out.print("a");
//	}
	
//	public static void func1(int a,int b)
//	{
//	    int ans=1;
//	    for(int i=0;i<b;i++)
//	    {
//	        ans*=a;
//	    }
//	    System.out.print(ans);
//	}
	
//	public static void doubleValue(int a ){
//	    a = a * 2;
//	}
	
//	public static int func(int a){
//	    a += 10;
//	    return a;
//	}
	
//	public static int square(int a){
//	    int ans = a * a;
//	    return ans;
//	}
	
//	 public static void func(int a) {
//	        int b = a;
//	        b = b + 10;
//	    }
	
//	public static void func(int a) {
//        int b = 10;
//        a = a + 10;
//        System.out.println(a);
//    }
	
//	public static boolean isPrime(int x)
//	{
//	    for(int i=2;i<x/2;i++)
//	    {
//	        if(x%i==0)
//	        return false;
//	    }
//	    return true;
//
//	}
	
//	public static int sum(int a,int b)
//	{
//	    System.out.print("int sum ");
//	    return a+b;
//	}
//	public static long sum(long a,long b)
//	{
//	    System.out.print("long sum ");
//	    return a+b;
//	}
	
	public static int sum(int a,int b)
	{
	    System.out.print("int sum ");
	    return a+b;
	}
	public static double sum(double a,double b)
	{
	    System.out.print("float sum ");
	    return a+b;
	}

	
	public static void main(String[] args) {
//		 int n=10,r=6;
//		    int factn=1,factr=1,factnr=1;
//		    for(int i=2;i<=n;i++)
//		    {
//		        factn*=i;
//		        if(i<=r)
//		            factr*=i;
//		        if(i<=n-r)
//		            factnr*=i;
//		    }
//		    int ncr=factn/(factr*factnr);
//		    System.out.print(ncr);
		

//		int a = 5;
//	    int b = 15; 
//	    demo(a);
		
//		System.out.print(add(10,3));
		
//		func1(2.5);
		
//		 func1(2,5);
		
//		 int a = 8;
//		    doubleValue(a);
//		    System.out.println(a);
		
//		int a = 5;
//	    func(a);
//	    System.out.println(a);
		
//		int a = 4;
//	    a = square(a);
//	    System.out.println(a);
		
//		  int a = 10;
//	        func(a);
//	        System.out.println(b);
		
//		 int a = 10;
//	        func(a);
//	        System.out.println(a);
		
//		System.out.print(isPrime(47));
		
//		int a=4;
//        int b=5;
//    System.out.print(sum(a,b));
		
		System.out.print(sum(5,4));
	    System.out.print(sum(5.0,4.0));
	}

}
