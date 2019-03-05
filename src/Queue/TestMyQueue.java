package Queue;

public class TestMyQueue {

	public static void main(String[] args) {
		MyQueue mq=new MyQueue();
		mq.add(9);
		mq.add(8);
		mq.add(7);
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		mq.add(6);
		System.out.println(mq.isEmpty());

	}

}
