package sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] arr=new int[] {4,3,6,9,5,0,1,7,6,8};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insertSort(int[] arr) {
		//�������е����֣��ӵڶ�����ʼ����һ�������Լ�Ĭ�����������
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp=arr[i];
				int j;
				for(j=i-1;j>=0&&temp<arr[j];j--) {
					arr[j+1]=arr[j];
				}
				arr[j+1]=temp;
			}
		}
	}

}
