package Recursive;

public class TestFebonacci {

	public static void main(String[] args) {
		//쳲��������У�1 1 2 3 5 8��ǰ������1�������ʼ����ǰ������֮�ͣ�
		System.out.println(Febonacci(6));

	}
	
	public static int Febonacci(int i) {
		if(i==1 || i==2) {
			return 1;
		}else {
			return Febonacci(i-1)+Febonacci(i-2);
		}
	}

}
