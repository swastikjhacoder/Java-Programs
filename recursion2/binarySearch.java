package recursion2;

public class binarySearch {

	public static void main(String[] args) {
		int[] a={1,3,4,5,6,8};
        System.out.println(binarySearchElement(a,0,a.length-1,5));
	}
	public static int binarySearchElement(int a[],int si,int ei,int x){
        if(si>ei){
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }else if(a[midIndex]<x){
            return binarySearchElement(a,midIndex+1,ei,x);
        }else{
            return binarySearchElement(a,si,midIndex-1,x);
        }
    }
}
