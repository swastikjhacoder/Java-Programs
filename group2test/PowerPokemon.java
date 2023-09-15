package group2test;

import java.util.TreeMap;
import java.util.Scanner;

public class PowerPokemon {
	static Scanner s = new Scanner(System.in);
	
	static int countPairs(int[] a, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], 1);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) < 1)
                continue;
            int cur = 1;
            while (cur <= a[i])
                cur <<= 1;
            if (map.containsKey(cur - a[i])) {
                if (cur - a[i] == a[i] && map.get(a[i]) == 1)
                    continue;
                count++;
                map.put(cur - a[i], map.get(cur - a[i]) - 1);
                map.put(a[i], map.get(a[i]) - 1);
            }
        }
        return count;
    }

	public static void main(String[] args) {
        int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
        System.out.println(countPairs(a, n));
        s.close();
	}
}
