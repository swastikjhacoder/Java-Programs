package test5;
import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int option=s.nextInt();
         if(option==1)
         {
        	 int r1=s.nextInt();
        	 int c1=s.nextInt();
            int [][] m1=new int[r1][c1];
            for(int i=0;i<r1;i++)
	        {
	            for(int j=0;j<c1;j++)
	            {
	                m1[i][j]=s.nextInt();
	            }
	        }
            mat mat1=new mat(m1);
            int r2=s.nextInt();
        	 int c2=s.nextInt();
            int [][] m2=new int[r2][c2];
            for(int i=0;i<r2;i++)
	        {
	            for(int j=0;j<c2;j++)
	            {
	                m2[i][j]=s.nextInt();
	            }
	        }
            mat mat2=new mat(m2);
             mat ans=mat.add(mat1,mat2);
             ans.print();
         }
         else if (option==2)
         {
        	 int r1=s.nextInt();
        	 int c1=s.nextInt();
	            int [][] m1=new int[r1][c1];
	            for(int i=0;i<r1;i++)
		        {
		            for(int j=0;j<c1;j++)
		            {
		                m1[i][j]=s.nextInt();
		            }
		        }
	            mat mat1=new mat(m1);
	            int r2=s.nextInt();
	        	 int c2=s.nextInt();
	            int [][] m2=new int[r2][c2];
	            for(int i=0;i<r2;i++)
		        {
		            for(int j=0;j<c2;j++)
		            {
		                m2[i][j]=s.nextInt();
		            }
		        }
	            mat mat2=new mat(m2);
	         mat ans=mat.multiply(mat1,mat2);
	         ans.print();
         }
         else if(option==3)
         {
        	 int r1=s.nextInt();
        	 int c1=s.nextInt();
	            int [][] m1=new int[r1][c1];
	            for(int i=0;i<r1;i++)
		        {
		            for(int j=0;j<c1;j++)
		            {
		                m1[i][j]=s.nextInt();
		            }
		        }
	            mat mat1=new mat(m1);
        	 mat ans=mat.transpose(mat1);
        	 ans.print();
         }
         else
         {
        	 int r1=s.nextInt();
        	 int c1=s.nextInt();
	            int [][] m1=new int[r1][c1];
	            for(int i=0;i<r1;i++)
		        {
		            for(int j=0;j<c1;j++)
		            {
		                m1[i][j]=s.nextInt();
		            }
		        }
	            mat mat1=new mat(m1);
        	 mat ans=mat.rotate (mat1);
        	 ans.print();
         }
	}

}
