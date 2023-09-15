package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BuyTickets {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;
	
	public static int buyTicket(int input[], int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> queue = new LinkedList<>();
        for (int i : input) priorityQueue.add(i);
        for (int i = 0; i < input.length; i++) queue.add(i);
        int time = 1;
        for (int i = 0; i < input.length; i++) {
            while (input[queue.peek()] != priorityQueue.peek()) {
                queue.add(queue.poll());
            }
            if (queue.peek()==k)return time;
            queue.poll();
            priorityQueue.poll();
            time++;
        }
        return time;
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
		System.out.println(buyTicket(input, k));
	}

}
