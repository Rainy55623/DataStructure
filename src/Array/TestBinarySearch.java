package Array;

public class TestBinarySearch {

	public static void main(String[] args) {
		//Ŀ������
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		//Ŀ��Ԫ��
		int target=9;
		//��¼Ŀ��Ԫ�ص�λ��
		int index=-1;
		//��¼��ʼ������λ��
		int begin=0;
		int end=arr.length-1;
		//��¼�м�λ��
		int mid=(begin+end)/2;
		//ѭ������
		while(true) {
			//�ж��м�Ԫ���ǲ���Ҫ���ҵ�Ԫ��
			if(arr[mid]==target) {
				index=mid;
				break;
				//����м�Ԫ�ز���Ҫ���ҵ�Ԫ��
			}else {
				//�ж��м�Ԫ���Ƿ��Ŀ��Ԫ�ش�
				if(arr[mid]>target) {
					//�ѽ���λ�õ������м�λ�õ�ǰһ��λ��
					end=mid-1;
				}else {
					//����м�Ԫ�ر�Ŀ��Ԫ��С���ѿ�ʼλ�õ������м�λ��+1
					begin=mid+1;
				}
				//ȥ���µ��м�λ��
				mid=(begin+end)/2;
			}
		}
		System.out.println(index);
	}

}
