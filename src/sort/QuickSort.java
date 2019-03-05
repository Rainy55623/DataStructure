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
			//�������еĵ�0��������Ϊ��׼��
			int stard=arr[start];
			//��¼��Ҫ������±�
			int low=start;
			int high=end;
			//ѭ���Ƚϣ����׼��stard�Ƚϣ���stard��ķ���high�࣬��stardС�ķ���low��
			while(low<high) {
				//�ұߵ����ֱȱ�׼�������ֲ������±���ǰŲһλ�����Ƚ�
				while(low<high&&stard<=arr[high]) {
					high--;
				}
				//ʹ���ұߵ������滻��ߵ���
				arr[low]=arr[high];
				//�����ߵ����ֱȱ�׼��С�������ֲ������±����Ųһλ�����Ƚ�
				while(low<high&&arr[low]<=stard) {
					low++;
				}
				//����ߵ������滻high�������
				arr[high]=arr[low];
			}
			//�ѱ�׼�������߻��ߵ͵��Ǹ�����
			arr[low]=stard;
			//��������С������
			quickSort(arr,start,low);
			//�������д������
			quickSort(arr,low+1,end);
		}
		
		
	}

}
