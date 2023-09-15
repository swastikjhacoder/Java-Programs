package hashmap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Intersection {

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
    
    public static void printIntersection(int[] arr1, int[] arr2) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i =0; i< arr1.length; i++) {
    		if(map.containsKey(arr1[i])) {
    			int value = map.get(arr1[i]);
    			map.put(arr1[i], value + 1);
    		}else {
    			map.put(arr1[i], 1);
    		}
    	}
    	for(int i = 0; i < arr2.length; i++) {
    		if(map.containsKey(arr2[i])) {
    			int freq = map.get(arr2[i]);
    			if(freq > 0) {
    				System.out.print(arr2[i] + " ");
    				map.put(arr2[i], freq-1);
    			}
    		}
    	}
    }
    
	public static void intersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        merge(arr1,arr2);
	}
	
	private static void merge(int arr1[] ,int arr2[]){
        int i=0,j=0;
        
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        
     }

	public static void main(String[] args) throws IOException {
		int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            intersection(arr1, arr2);
//            printIntersection(arr1, arr2);
            System.out.println();

            t -= 1;
        }
	}

}
