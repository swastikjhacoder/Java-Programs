package arrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1,50);
		arr.set(1, 80);
//		System.out.println(arr.size());
//		System.out.println(arr.get(1));
		
//		ArrayList<String> list = new ArrayList<String>() ;
//		list.add( "apple" );
//		list.add( "banana" );
//		list.add( "carrot" );
//		list.add( 0, "mango" );
//		System.out.println(list.get(2));
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		//Enhanced for loop
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
