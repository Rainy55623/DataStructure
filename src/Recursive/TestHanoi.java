package Recursive;

public class TestHanoi {

	public static void main(String[] args) {
		hanoi(3,'a','b','c');

	}
	
	/**
	 * �����ж��ٸ����ӣ�����Ϊֻ��2�����ֱ��ǣ�������������Ӻ��������һ��
	 * @param n  ����n������
	 * @param from   ��ʼ������
	 * @param in    �м������
	 * @param to   Ŀ������
	 */
	public static void hanoi(int n,char from, char in, char to) {
		if(n==1) {
			System.out.println("��1�����Ӵ�"+from+"�Ƶ�"+to);
		}else {
			//�ƶ��������е����ӵ��м�λ�ú�
			hanoi(n-1,from,to,in);
			//�ƶ����������
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ�"+to);
			//�������������Ӵ��м�λ���Ƶ�Ŀ��λ��
			hanoi(n-1,in,from,to);
			
		}
	}

}
