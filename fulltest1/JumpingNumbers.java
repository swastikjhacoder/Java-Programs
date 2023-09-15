package fulltest1;
import java.util.*;
public class JumpingNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
	    showJumpingNos(x);
	    s.close();
	}

	public static void showJumpingNos(int x) {
		System.out.print("0 ");
 
        for (int i = 1; i <= 9 && i <= x; i++) {
            bfs(x, i);
        }
	}
	
	public static void bfs(int x, int num)
    {
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(num);
 
        while (!q.isEmpty()) {
            num = q.peek();
            q.poll();
            if (num <= x) {
                System.out.print(num + " ");
                int last_digit = num % 10;
 
                if (last_digit == 0) {
                    q.add((num * 10) + (last_digit + 1));
                }
 
                else if (last_digit == 9) {
                    q.add((num * 10) + (last_digit - 1));
                }
 
                else {
                    q.add((num * 10) + (last_digit + 1));
                    q.add((num * 10) + (last_digit - 1));
                }
            }
        }
    }
}
