package Array;

public class Search {

	public static void main(String[] args) {
		//Ŀ������
		int[] arr=new int[] {2,3,4,6,8,9,7};
		//Ŀ��Ԫ��
		int target=8;
		//Ŀ��Ԫ�ص��±�
		int index=-1;
		//��������
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
		}
		//��ӡĿ��Ԫ���±�
		System.out.println(index);

	}

}
