package string;
import java.util.*;
public class CodeSnippet {

	public static void main(String[] args) {
//		String a ="abcd";
//		String b="abcda";
//		System.out.println(a.compareTo(b));
		
//		String a="coding",b="ninjas";
//		if(a.contains("ing"))
//		{
//		    a+=b;
//		}
//		else
//		{
//		    b+="ing";
//		}
//		System.out.print(b+a);
		
//		String a="coding";
//		for(int i=2;i<4;i++)
//		{
//		    System.out.print(a.substring(i));
//		}
		
//		String a="coding";
//		for(int i=2;i<5;i++)
//		{
//		    System.out.print(a.substring(i-2,i+1));
//		}
		
//		Scanner s=new Scanner(System.in);
//		String str1=s.next();
//		String str2=s.nextLine();
//		String str3=str2+str1;
//		System.out.println(str3);
		
//		String str1="abc";
//		String str2=new String("abc");
//		System.out.println(str1==str2);
		
//		String str1="abc";
//		String str2=new String("abc");
//		System.out.println(str1.equals(str2));
		
//		String str1="abc";
//		String str2="bc";
//		String str3="ab"+str2;
//		System.out.println(str1==str3);
		
//		String str1="abc";
//		String str2=str1+" ";
//		System.out.println(str1==str2);
		
//		String str1="abc";
//		String str2="";
//		System.out.println(str1.contains(str2));
		
		StringBuffer str1=new StringBuffer("");
		for(int i=0;i<5;i++)
		{
		    str1.append((char)('a'+i));
		}
		System.out.println(str1);
	}

}
