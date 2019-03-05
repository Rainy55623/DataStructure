package sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr=new int[] {
				2,4,3,6,9,5,0,1,7,6,8
		};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	
	/**
	 * 每个数字都需要和下一个比较，一共需要比较length-1轮
	 * 2,4,3,6,9,5,0,1,7,6,8
	 * 
	 * 第一轮
	 * 第一次：指针在2，2<4,保持不动
	 * 2,4,3,6,9,5,0,1,7,6,8
	 * 第二次：指针在4；4>3，两者交换
	 * 2,3,4,6,9,5,0,1,7,6,8
	 * ......
	 * 最后一次：
	 * 2,3,4,6,5,0,1,7,6,8,9
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		//执行的轮数
		for(int i=0;i<arr.length-1;i++) {
			//比较的次数
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
