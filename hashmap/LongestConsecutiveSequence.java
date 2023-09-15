package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class LongestConsecutiveSequence {

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

    public static void printArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
    	HashMap<Integer,Boolean> map = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],true);
        }
        int maxlength = 0;
        int start  = 0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])){
                int length = 0;
                int temp = arr[i];
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    temp = temp+1;
                }
                int starttemp = arr[i];
                temp = arr[i]-1;
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    starttemp = temp;
                    temp = temp-1;
                }
                if(length > maxlength){
                    maxlength = length;
                    start = starttemp;
                }else if(length == maxlength){
                    maxlength = length;
                    for(int j=0;j<arr.length;j++){
                        if(arr[j] == start){
                            start = start;
                            break;
                        }else if(arr[j] == starttemp){
                            start = starttemp;
                            break;
                        }
                    }
                }
            }
        }
        output.add(start);
        output.add(start + maxlength - 1);
        return output;
    }

	public static void main(String[] args) throws IOException {
		int[] arr = takeInput();
        ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
        printArray(ans);
	}
}
