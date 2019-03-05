package Array;

public class TestBinarySearch {

	public static void main(String[] args) {
		//目标数组
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		//目标元素
		int target=9;
		//记录目标元素的位置
		int index=-1;
		//记录开始，结束位置
		int begin=0;
		int end=arr.length-1;
		//记录中间位置
		int mid=(begin+end)/2;
		//循环查找
		while(true) {
			//判断中间元素是不是要查找的元素
			if(arr[mid]==target) {
				index=mid;
				break;
				//如果中间元素不是要查找的元素
			}else {
				//判断中间元素是否比目标元素大
				if(arr[mid]>target) {
					//把结束位置调整到中间位置的前一个位置
					end=mid-1;
				}else {
					//如果中间元素比目标元素小，把开始位置调整到中间位置+1
					begin=mid+1;
				}
				//去除新的中间位置
				mid=(begin+end)/2;
			}
		}
		System.out.println(index);
	}

}
