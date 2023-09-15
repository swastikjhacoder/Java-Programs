package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KthLargestElement {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;
	
	public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (priorityQueue.peek() < input[i]) {
                priorityQueue.poll();
                priorityQueue.add(input[i]);
            }
        }
        return priorityQueue.poll();
	}

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		System.out.println(kthLargest(n, input, k));
	}

}
