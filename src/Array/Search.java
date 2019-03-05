package Array;

public class Search {

	public static void main(String[] args) {
		//目标数组
		int[] arr=new int[] {2,3,4,6,8,9,7};
		//目标元素
		int target=8;
		//目标元素的下标
		int index=-1;
		//遍历数组
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		//打印目标元素下标
		System.out.println(index);

	}

}
