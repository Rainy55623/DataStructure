package Array;

import java.util.Arrays;

public class ArrayDelElement {

	public static void main(String[] args) {
		//Ŀ������
		int[] arr=new int[] {3,4,5,6,7};
		//Ҫɾ��Ԫ���±�
		int dst=30;
		
		//ɾ��
		//����һ�������飬������ԭ���鳤��-1
		int[] newarr=new int[arr.length-1];
		//����ԭ�����г���Ҫɾ���Ǹ�Ԫ�����������Ԫ��
		for(int i=0;i<newarr.length;i++) {
			//Ҫɾ����Ԫ��֮ǰ��Ԫ��
			if(i<dst) {
				newarr[i]=arr[i];
			}else {
				newarr[i]=arr[i+1];
			}
		}
		System.out.println(Arrays.toString(newarr));
	}

}
