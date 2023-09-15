package hashmap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
public class MaximumFrequencyNumber {

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

	public static int maxFrequencyNumber(int[] arr){ 
		int maxf = 1;
		int pos = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else {
				map.put(arr[i], map.get(arr[i]) + 1);
				if (maxf <= map.get(arr[i])) {
					pos = i;
					maxf = map.get(arr[i]);
				}
			}
		}
		return arr[pos];
	}
	
	public static void main(String[] args) throws IOException {
		int[] arr = takeInput();
        System.out.println(maxFrequencyNumber(arr));
	}

}
