package Stack;

public class TestStack {

	public static void main(String[] args) {
		MyStack ms=new MyStack();
//		int pop=ms.pop();
//		System.out.println(pop);
		System.out.println(ms.isEmpty());
		ms.push(9);
		ms.push(8);
		ms.push(7);
		System.out.println(ms.peek());
		System.out.println(ms.pop());
		System.out.println(ms.pop());
		System.out.println(ms.peek());
		System.out.println(ms.peek());
		System.out.println(ms.isEmpty());
		System.out.println(ms.pop());
//		System.out.println(ms.peek());
		System.out.println(ms.isEmpty());


	}

}
