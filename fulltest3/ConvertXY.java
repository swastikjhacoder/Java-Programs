package fulltest3;

import java.util.*;

class Operations {
    int val;
    int steps;
 
    public Operations(int val, int steps)
    {
        this.val = val;
        this.steps = steps;
    }
}

public class ConvertXY {
	
	private static int minOperations(int src, int target) {
        Set<Integer> visited = new HashSet<>(10000);
        LinkedList<Operations> queue = new LinkedList<Operations>();
        Operations node = new Operations(src, 0);
        queue.offer(node);
        while (!queue.isEmpty()) {
        	Operations temp = queue.poll();
            if(visited.contains(temp.val)) {
              continue;
            }
            visited.add(temp.val);
            if (temp.val == target) {
                return temp.steps;
            }
            int mul = temp.val * 2;
            int sub = temp.val - 1;
            if (mul > 0 && mul < 10000) {
            	Operations nodeMul = new Operations(mul, temp.steps + 1);
                queue.offer(nodeMul);
            }
            if (sub > 0 && sub < 10000) {
            	Operations nodeSub = new Operations(sub, temp.steps + 1);
                queue.offer(nodeSub);
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
        System.out.println(minOperations(x, y));
        s.close();
	}

}
