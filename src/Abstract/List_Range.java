package Abstract;

import java.util.Arrays;

public class List_Range {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		
		System.out.println("arr6[] ==> " + Arrays.toString(arr6));
		
		int[] arr7 = Arrays.copyOfRange(arr, 0, 5);
		System.out.println(Arrays.toString(arr7));
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println(Arrays.toString(arr7));
		
	}
}
