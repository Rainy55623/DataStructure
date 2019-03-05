package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr=new int[] {4,3,6,9,5,0,1,7,6,8};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void quickSort(int[] arr,int start,int end) {
		if(start<end) {
			//把数组中的第0个数字作为标准数
			int stard=arr[start];
			//记录需要排序的下标
			int low=start;
			int high=end;
			//循环比较，与标准数stard比较，比stard大的放在high侧，比stard小的放在low侧
			while(low<high) {
				//右边的数字比标准数大，数字不动，下标向前挪一位继续比较
				while(low<high&&stard<=arr[high]) {
					high--;
				}
				//使用右边的数字替换左边的数
				arr[low]=arr[high];
				//如果左边的数字比标准数小，则数字不动，下标向后挪一位继续比较
				while(low<high&&arr[low]<=stard) {
					low++;
				}
				//用左边的数字替换high侧的数字
				arr[high]=arr[low];
			}
			//把标准数赋给高或者低的那个数字
			arr[low]=stard;
			//处理所有小的数字
			quickSort(arr,start,low);
			//处理所有大的数字
			quickSort(arr,low+1,end);
		}
		
		
	}

}
