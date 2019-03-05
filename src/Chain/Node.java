package Chain;

//һ���ڵ�
public class Node {
	//�ڵ�����
	int data;
	//��һ���ڵ㣻
	Node next;
	
	public Node(int data) {
		this.data=data;
	}
	
	//Ϊ�ڵ�׷�ӽڵ�
	public Node append(Node node) {
		//��ǰ�ڵ�
		Node  currentNode=this;
		while(true) {
			//ȡ����һ���ڵ�
			Node nextNode=currentNode.next;
			//���û����һ���ڵ㣬Ϊnull����ǰ�ڵ��Ѿ������һ���ڵ�
			if(nextNode==null) {
				break;
			}
			//������ǰ�ڵ�
			currentNode=nextNode;
		}
		//����Ҫ׷�ӵĽڵ�׷�ӵ��ҵ��ĵ�ǰ�ڵ����һ���ڵ�
		currentNode.next=node;
		return this;
	}
	
	//��ȡ��һ���ڵ�
	public Node next() {
		return this.next;
	}
	
	//��ȡ�ڵ��е�����
	public int getData() {
		return this.data;
	}
	
	//��ǰ�ڵ��Ƿ������һ���ڵ�
	public boolean isLast() {
		return next==null;
	}
	
	//ɾ����һ���ڵ�
	public void removeNext() {
		//ȡ����һ���ڵ�
		Node newNext=next.next;
		//������һ���ڵ�����Ϊ��ǰ�ڵ����һ���ڵ�
		this.next=newNext;
	}
	
	
	//��ʾ���нڵ���Ϣ
	public void show() {
		Node currentNode=this;
		while(true) {
			System.out.print(currentNode.data+" ");
			//ȡ����һ���ڵ�
			currentNode=currentNode.next;
			//��������һ���ڵ�
			if(currentNode==null) {
				break;
			}
		}
		System.out.println();
	}
	
	//����һ���ڵ㣬��Ϊ��ǰ�ڵ����һ���ڵ�
	public void after(Node node) {
		//ȡ����һ���ڵ㣬��Ϊ����һ���ڵ�
		Node nextNext=next;
		//���½ڵ���Ϊ��ǰ�ڵ���һ���ڵ�
		this.next=node;
		//�����½ڵ�����Ϊ�½ڵ����һ���ڵ�
		node.next=nextNext;
	}
	
}
