package Array;

import java.util.Arrays;

public class ArrayDelElement {

	public static void main(String[] args) {
		//目标数组
		int[] arr=new int[] {3,4,5,6,7};
		//要删除元素下标
		int dst=30;
		
		//删除
		//创建一个新数组，长度是原数组长度-1
		int[] newarr=new int[arr.length-1];
		//复制原数组中除了要删除那个元素以外的其他元素
		for(int i=0;i<newarr.length;i++) {
			//要删除的元素之前的元素
			if(i<dst) {
				newarr[i]=arr[i];
			}else {
				newarr[i]=arr[i+1];
			}
		}
		System.out.println(Arrays.toString(newarr));
	}

}
