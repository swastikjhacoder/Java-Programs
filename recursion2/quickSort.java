package recursion2;
import java.util.*;
public class quickSort {

	public static void main(String[] args) {
		int[] input = { 23, 31, 1, 21, 36, 72};
        System.out.println("Before sorting : " + Arrays.toString(input));
        quickSortArray(input);
        System.out.println("After sorting : " + Arrays.toString(input));
        int[] withDuplicates = { 11, 14, 16, 12, 11, 15};
        System.out.println("Before sorting : " + Arrays.toString(withDuplicates));
        quickSortArray(withDuplicates);
        System.out.println("After sorting : " + Arrays.toString(withDuplicates));
    }
	public static void quickSortArray(int[] input) {
        recursiveQuickSort(input, 0, input.length - 1);
    }
	
	public static void recursiveQuickSort(int[] array, int startIdx, int endIdx) {
		int idx = partition(array, startIdx, endIdx);
		if (startIdx < idx - 1) {
			recursiveQuickSort(array, startIdx, idx - 1);
		}
		if (endIdx > idx) {
			recursiveQuickSort(array, idx, endIdx);
		}
	}
	
	public static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        while (left <= right) {
        	while (array[left] < pivot) {
                left++;
            }
        	while (array[right] > pivot) {
                right--;
            }
        	if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
}
