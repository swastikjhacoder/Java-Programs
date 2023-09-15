package fulltest2;

import java.util.*;
import java.lang.*;
import java.io.*;

public class SortingArray {
	
	public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        return arr;
    }
	
	static void sortByFreq(int arr[],int n)
    {
        //Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        ArrayList<Integer> al = new ArrayList<>(hm.keySet());
        Collections.sort(al,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(hm.get(a)==hm.get(b)){
                    return a-b;
                }else{
                    return hm.get(b)-hm.get(a);
                }
            }
        });
        for(int i=0;i<al.size();i++){
            int k = hm.get(al.get(i));
            while(k-->0){
                System.out.print(al.get(i)+" ");
            }
        }
        System.out.println();
    }
	public class SortByFreq {
	    public static void main(String[] args) {
	        int arr[] = {2, 5, 2, 8, 5, 6, 8, 8};
	        int n = arr.length;
	        sortByFreq(arr, n);
	    }

	    private static void sortByFreq(int[] arr, int n) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            if (map.containsKey(arr[i])) {
	                map.put(arr[i], map.get(arr[i]) + 1);
	            } else {
	                map.put(arr[i], 1);
	            }
	        }
	        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
	            @Override
	            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	                if (o1.getValue() != o2.getValue()) {
	                    return o2.getValue() - o1.getValue();
	                } else {
	                    return o1.getKey() - o2.getKey();
	                }
	            }
	        });
	        for (Map.Entry<Integer, Integer> entry : list) {
	            int j = entry.getValue();
	            while (j-- > 0) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	    }
	}
}
