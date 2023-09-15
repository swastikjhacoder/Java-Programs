package group2test;
import java.util.ArrayList;
import java.util.Scanner;
public class Binary {
	static Scanner s = new Scanner(System.in);
	
//	public static String toString(char[] a) {
//        String string = new String(a);
//        return string;
//    }
// 
//    static void generate(int k, char[] ch, int n) {
//        if (n == k) {
//            System.out.print(toString(ch)+" ");
//            return;
//        }
//        if (ch[n - 1] == '0') {
//            ch[n] = '0';
//            generate(k, ch, n + 1);
//            ch[n] = '1';
//            generate(k, ch, n + 1);
//        }
//        if (ch[n - 1] == '1') {
//            ch[n] = '0';
//            generate(k, ch, n + 1); 
//        }
//    }
// 
//    static void fun(int k) {
//        if (k <= 0) {
//            return;
//        }
//        char[] ch = new char[k];
//        ch[0] = '0';
//        generate(k, ch, 1);
//        ch[0] = '1';
//        generate(k, ch, 1);
// 
//    }
 
    public static void main(String args[]) {
//        int k = s.nextInt();
//        fun(k);
        int t = s.nextInt();

		while (t-- > 0) {
			int n = s.nextInt();

			ArrayList<String> res = generateString(n);
			for (String i : res) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
    }
    
    static void generate(int k, char[] ch, int n,ArrayList<String> arrayList) {
        if (n == k) {
            arrayList.add(new String(ch));
            return;
        }
        if (ch[n - 1] == '0') {
            ch[n] = '0';
            generate(k, ch, n + 1,arrayList);
            ch[n] = '1';
            generate(k, ch, n + 1,arrayList);
        }
        if (ch[n - 1] == '1') {
            ch[n] = '0';
            generate(k, ch, n + 1,arrayList);
        }
    }

	private static ArrayList<String> generateString(int n) {
		ArrayList<String> arrayList = new ArrayList<>();
        if (n==0) return arrayList;
        char[] ch = new char[n];
        ch[0] = '0';
        generate(n, ch, 1,arrayList);
        ch[0] = '1';
        generate(n, ch, 1,arrayList);
        return arrayList;
	}
}
