package dp2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Input {
	private int n;
	private int[] weights;
	private int[] values;
	private int maxWeight;

	public Input(int[] weights, int[] values, int n, int maxWeight) {
		this.n = n;
		this.weights = weights;
		this.values = values;
		this.maxWeight = maxWeight;
	}

	public int getSize() {
		return this.n;
	}

	public int[] getWeights() {
		return this.weights;
	}

	public int[] getValues() {
		return this.values;
	}

	public int getMaxWeight() {
		return this.maxWeight;
	}
}

public class Knapsack {
	
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 public static Input takeInput() throws NumberFormatException, IOException {
		 int n = Integer.parseInt(br.readLine().trim());
		 if (n == 0) {
			 return (new Input(new int[0], new int[0], 0, 0));
		 }
		 String[] strWeights = br.readLine().trim().split(" ");
		 String[] strValues = br.readLine().trim().split(" ");
		 int maxWeight = Integer.parseInt(br.readLine().trim());
		 int[] weights = new int[n];
		 int[] values = new int[n];
		 for (int i = 0; i < n; i++) {
			 weights[i] = Integer.parseInt(strWeights[i]);
			 values[i] = Integer.parseInt(strValues[i]);
		 }
		 return (new Input(weights, values, n, maxWeight));
	 }
	
	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		int dpPrev[] = new int[maxWeight+1];
        int dpCurrent[] = new int [maxWeight+1];
        for(int i = 1; i < values.length + 1; i++) {
            for(int w = 1; w < maxWeight + 1; w++) {
                if(weights[i-1] > w) {
                	dpCurrent[w] = dpPrev[w];
                }
                else { 
                	dpCurrent[w] = Math.max(dpPrev[w - weights[i-1]] + values[i-1], dpPrev[w]);
                }
            }
            dpPrev = dpCurrent;
            dpCurrent = new int[maxWeight+1];
        }
        return dpPrev[maxWeight];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		 Input input = takeInput();
		 int n = input.getSize();
	     int[] weights = input.getWeights();
	     int[] values = input.getValues();
	     int maxWeight = input.getMaxWeight();
	     System.out.println(knapsack(weights, values, n, maxWeight));
	}
}
