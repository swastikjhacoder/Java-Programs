package operator;

public class TestingCode {

	public static void main(String[] args) {
//		int a=10,b=50;
//	    a++;
//	    --b;
//	    int c=a--+b--;
//	    System.out.print(++c);
		
//		 int a=10,b=20;
//		    System.out.println(a+++--b);//line 1
//		    System.out.println(a--+++b);//line 2
//		    System.out.println(a++-++b);//line 3
//		    System.out.println(a+++++b);//line 4
		
//		 int a=10,b=20;
//		    int c=a&b;
//		    System.out.print(c);
//		    int d=a|b;
//		    System.out.print(d);
//		    int e=a^b;
//		    System.out.print(e);
//		    int f=c+d+e;
//		    System.out.print(~f);
		
//		int a=10,b=-20;
//	    System.out.print(a^b);
		
//		 int a = 42;
//	       int b = ~a; //(there is tilde sign before a)
//	       System.out.print(a + " " + b);    
		
//		int x , y = 1;
//        x = 10;
//        if (x != 10 && x / 0 == 0)
//            System.out.println(y);
//        else
//            System.out.println(++y);
		
//		 int x = 15;
//		    int y = x++;
//		    int  z = ++x;
//		    System.out.println(y +" " + z);
		
//		 int g = 3;
//         System.out.print(++g * 8);
		
//		int x =10;
//        int y = 20;
//        if(x++ > 10 && ++y > 20 ){
//        System.out.print("Inside if  ");
//        }else{
//        System.out.print("Inside else  ");
//        }
//        System.out.println(x +" "+y);
		
//		 int x = 10;
//         int y = 20;
//         if(x++ > 10 || ++y > 20 ){
//        System.out.print("Inside if  ");
//         }else{
//        System.out.print("Inside else  ");
//         }
//         System.out.println(x  + " " + y);
		
//		 int a=5;
//		    a+=5+(++a)+(a++);
//		    System.out.print(a);
		
//		 int a=10;
//		    a+=++a-5/3+6*a;
//		    System.out.print(a);
		
//		for(int i=1;i<10;i*=2)
//		{
//		     System.out.println(i);
//		} 
		
//		for(int i=483;i>0;i=i%3)
//	    {
//	        System.out.print("*");
//	    }
		
//		for(int i = 0; i < 5; i = i + 1){
//		    System.out.print(i + " ");
//		    i = i + 1;
//		}
		
//		for(int i = 1; i < 5; i = i + 1){
//		    System.out.print(i +" ");
//		    i = i - 1;
//		}
		
//		for(int i = 0; i < 2; i = i + 1) {
//		     for(int j = 0; j < 2; j = j + 1) {
//		          if (j == 1)
//		              break;
//		          System.out.print(j +" ");
//		      }
//		 } 
		
//		int i=0;
//	    for(;;)
//	    {
//	        if(i==5)
//	            break;
//	        System.out.print(i);
//	        i++;
//	    }
		
//		for(int i=7;i!=0;i--)
//	    {
//	        System.out.print(i--);
//	    }
		
//		for(int i=1;;i++)
//	    {   if(i==5)
//	            break;
//	        System.out.print(i);
//	    }
		
//		for(int i=1;;i++)
//	    {   if(i<5)
//	            System.out.print(i);
//	        else 
//	            break;
//	    }
		
//		for(int i=1;;i++)
//	    {   if(i>5)
//	        {
//	            break;
//	            System.out.print("break statement reached");
//	        }
//	        System.out.print(i);
//	    }
		
//		int i = 1;
//		while(i < 5) {
//		    if(i == 3) {
//		        break;
//		    }
//		    System.out.print(i + " ");
//		    i++;
//		}
		
//		int i = 1;
//		while(i < 5) {
//		    if(i == 3) {
//		        continue;
//		    }
//		    System.out.print(i + " ");
//		    i++;
//		}
		
//		int i = 1;
//		while(i < 3) {
//		    int j = 1;
//		    while(j < 5) {
//		        if(j == 3) {
//		            break;
//		        }
//		        System.out.print(j + " ");
//		        j++;
//		    }
//		    i++;
//		}
		
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}

	}

}
