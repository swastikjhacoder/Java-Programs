package priorityqueue;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KSmallest {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;
	
	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (priorityQueue.peek() > input[i]) {
                priorityQueue.poll();
                priorityQueue.add(input[i]);
            }
        }
        for (int i = 0; i < k; i++) {
        	output.add(priorityQueue.poll());
        }
        return output;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		int k = Integer.parseInt(br.readLine());
		ArrayList<Integer> output = kSmallest(n, input, k);
		Collections.sort(output);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}

}
