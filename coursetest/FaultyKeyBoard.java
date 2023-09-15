package coursetest;
import java.lang.Math;
import java.util.Scanner;
public class FaultyKeyBoard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
	
	public static String[] keypad(int n){
      if(n<=1){
    	  String s[]={""};
    	  return s;
      }
      
      String prev[]=keypad(n/10);
      String actual[]=new String[(int)Math.pow(4.00,count(n))];
      String helper=setOfCharacter(n%10);
      int k=0;
      for(int j=0;j<helper.length();j++){
          for(int i=0;i<prev.length;i++){
              actual[k]=prev[i]+helper.charAt(j);
              k++;
            }
      }
      
      int count=0;
      for(int i=0;i<actual.length;i++){
        if(actual[i]==null){
          count++;
        }
      }
      
      String newString[]=new String[actual.length-count];
      for(int i=0;i<actual.length;i++){
        if(actual[i]!=null){
	        newString[i]=actual[i];
      	}
      }
      return newString;
    } 

  	public static double count(int n){
      double count=0;
	   while(n>0){
	       count++;
	       n=n/10;
	   }
      return count;
    }

  	public static String setOfCharacter(int n){
     switch(n){
        case 2:	return "abc";
         		
        case 3:	return "def";
         		
        case 4:	return "ghi";
         	
        case 5:	return "jkl";
         	
        case 6:	return "mno";
         	
        case 7:	return "pqrs";
         	
        case 8:	return "tuv";
			
        case 9:	return "wxyz";
        
       default:break;
     }
     return ""; 
    }
}
