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
	 * ÿ�����ֶ���Ҫ����һ���Ƚϣ�һ����Ҫ�Ƚ�length-1��
	 * 2,4,3,6,9,5,0,1,7,6,8
	 * 
	 * ��һ��
	 * ��һ�Σ�ָ����2��2<4,���ֲ���
	 * 2,4,3,6,9,5,0,1,7,6,8
	 * �ڶ��Σ�ָ����4��4>3�����߽���
	 * 2,3,4,6,9,5,0,1,7,6,8
	 * ......
	 * ���һ�Σ�
	 * 2,3,4,6,5,0,1,7,6,8,9
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		//ִ�е�����
		for(int i=0;i<arr.length-1;i++) {
			//�ȽϵĴ���
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
