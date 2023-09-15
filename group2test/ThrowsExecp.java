package group2test;

public class ThrowsExecp {
	static int fun(int n) throws Exception  
	{   if(n==2)
	    throw new Exception();
	    else 
	    return 5;
	} 
	public static void main(String args[]) 
	{   
	    try { 
	        System.out.print(fun(10)); 
	    } 
	    catch (Exception e) { 
	        System.out.print("hello"); 
	    }
	    System.out.print("world"); 
	} 
}
