package priorityqueue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElements {
	
	static Scanner s = new Scanner(System.in);
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<Integer> ();
		ArrayList<Integer> output = new ArrayList<>();
		
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }

        for(int i=k; i< input.length;i++){
            if(pq.peek()<input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
        while(!pq.isEmpty()){
            output.add(pq.poll());
        }
        return output;
	}

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int j = 0; j < n; j++) {
			input[j] = s.nextInt();
		}
		int k = s.nextInt();
		ArrayList<Integer> output = kLargest(input, k);
		for(int i : output) {
			System.out.println(i);
		}
	}

}
