package Array;

import java.util.Arrays;

public class MyArray {
	//���ڴ洢���ݵ�����
	private int[] elements;
	public MyArray() {
		elements=new int[0];
	}
	public int size() {
		return elements.length;
	}
	
	//������ĩβ���Ԫ��
	public void add (int element) {
		int[] newArr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i]=elements[i];
		}
		newArr[elements.length]=element;
		elements=newArr;
	}
	
	//��ӡȫ��Ԫ�ص�����̨
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	//ɾ�������е�Ԫ��
	public void delete(int index) {
		//�ж��±��Ƿ�Խ��
		if(index<0||index>elements.length-1) {
			throw new RuntimeException("�±�Խ��");
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
	
	//��ȡĳ���±��Ԫ��
	public int get(int index) {
		return elements[index];
	}
	
	//����һ��Ԫ�ص�ָ��λ��
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
	
	//�滻ָ��λ�õ�Ԫ��
	public void set(int index,int element) {
		if(index<0||index>elements.length-1) {
			throw new RuntimeException("�±�Խ��");
		}
		elements[index]=element;
	}
	
	//���Բ���
	public int search(int target) {
		for(int i=0;i<elements.length;i++) {
			if(elements[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	//���ַ�����
	public int binarySearch(int target) {
		int begin=0;
		int end=elements.length-1;
		int mid=(begin+end)/2;
		while(true) {
			//�����ʼ�ڽ���λ��֮���غϣ����ʾû�����Ԫ�أ�����-1��ʾû��Ԫ��
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
