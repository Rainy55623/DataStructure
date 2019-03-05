package Array;

import java.util.Arrays;

public class MyArray {
	//用于存储数据的数组
	private int[] elements;
	public MyArray() {
		elements=new int[0];
	}
	public int size() {
		return elements.length;
	}
	
	//往数组末尾添加元素
	public void add (int element) {
		int[] newArr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i]=elements[i];
		}
		newArr[elements.length]=element;
		elements=newArr;
	}
	
	//打印全部元素到控制台
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	//删除数组中的元素
	public void delete(int index) {
		//判断下标是否越界
		if(index<0||index>elements.length-1) {
			throw new RuntimeException("下标越界");
		}
		int[] newArr=new int[elements.length-1];
		for(int i=0;i<newArr.length;i++) {
			if(i<index) {
				newArr[i]=elements[i];
			}else {
				newArr[i]=elements[i+1];
			}
		}
		elements=newArr;
	}
	
	//获取某个下标的元素
	public int get(int index) {
		return elements[index];
	}
	
	//插入一个元素到指定位置
	public void insert(int index,int num) {
		int[] newArr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			if(i<index) {
				newArr[i]=elements[i];
			}else {
				newArr[i+1]=elements[i];
			}
		}
		newArr[index]=num;
		elements=newArr;
	}
	
	//替换指定位置的元素
	public void set(int index,int element) {
		if(index<0||index>elements.length-1) {
			throw new RuntimeException("下标越界");
		}
		elements[index]=element;
	}
	
	//线性查找
	public int search(int target) {
		for(int i=0;i<elements.length;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	//二分法查找
	public int binarySearch(int target) {
		int begin=0;
		int end=elements.length-1;
		int mid=(begin+end)/2;
		while(true) {
			//如果开始在结束位置之后重合，则表示没有这个元素，返回-1表示没有元素
			if(begin>=end) {
				return -1;
			}
			if(elements[mid]==target) {
				return mid;
			}else {
				if(elements[mid]>target) {
					end=mid-1;
				}else {
					begin=mid+1;
				}
			}
			mid=(begin+end)/2;
		}
	}

}
