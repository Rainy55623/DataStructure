package Recursive;

public class TestFebonacci {

	public static void main(String[] args) {
		//斐波那契数列：1 1 2 3 5 8（前两项是1，第三项开始均是前两项数之和）
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
