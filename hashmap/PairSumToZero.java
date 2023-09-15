package hashmap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PairSumToZero {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
		String[] strNums;
		strNums = br.readLine().split("\\s");
		
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
	
	public static int PairSum(int[] input, int size) {
		int totPair = 0;
		if(size==0)
            return totPair;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0; i < size; i++) {   
            if(h.containsKey(-input[i]) && h.get(-input[i]) != 0) {
                int count = h.get(-input[i]);
                while(count != 0) {
                	if(input[i] > 0)
                		totPair++;
                	else
                		totPair++;
                	count--;
                }
                if(h.containsKey(input[i]))
                    h.put(input[i],h.get(input[i]) + 1);
                else
                    h.put(input[i], 1);
            }else {
            	if(h.containsKey(input[i])) {
                    h.put(input[i], h.get(input[i]) + 1);
                }else {
                    h.put(input[i], 1);
                }
            }
        }
        return totPair;
	}

	public static void main(String[] args) throws IOException {
		int[] arr = takeInput();
//		PairSum(arr,arr.length);
        System.out.print(PairSum(arr,arr.length));
	}

}
