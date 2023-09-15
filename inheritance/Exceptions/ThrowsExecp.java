package Exceptions;

public class ThrowsExecp {

	static void fun() throws Exception 
	{ 
	    throw new Exception(); 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try { 
		        fun(); 
		 }
		 catch (Exception e) { 
			 System.out.print("caught in main."); 
		 }
		 System.out.print("All is well"); 
	}
}
