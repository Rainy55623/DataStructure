package Array;

import java.util.Arrays;

public class ArrayAddElement {

	public static void main(String[] args) {
		int[] arr=new int[] {9,8,7};
		int dst=6;
		int[] newarr=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));
		
		newarr[arr.length]=dst;
		System.out.println(Arrays.toString(newarr));
		arr=newarr;
		System.out.println(Arrays.toString(arr));
		
	}

}
