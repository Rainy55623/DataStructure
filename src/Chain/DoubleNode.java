package Chain;

public class DoubleNode {
	//��һ���ڵ�
	DoubleNode pre=this;
	//��һ���ڵ�
	DoubleNode next=this;
	//�ڵ�����
	int data;
	
	public DoubleNode(int data) {
		this.data=data;
	}
	
	//���ӽڵ�
	public void after(DoubleNode node) {
		//��¼ԭ˫�����У�this����һ���ڵ�
		DoubleNode nextNext=next;
		//���½ڵ���Ϊ��ǰthis����һ���ڵ�
		this.next=node;
		//�ѵ�ǰthis�ڵ���Ϊ�½ڵ��ǰһ���ڵ�
		node.pre=this;
		//���½ڵ����һ���ڵ�ָ��ԭthis����һ���ڵ�
		node.next=nextNext;
		//��ԭthis����һ���ڵ���Ͻڵ�Ϊ�½ڵ�
		nextNext.pre=node;
	}
	
	//��ȡ��һ���ڵ�
	public DoubleNode next() {
		return this.next;
	}
	//��ȡ��һ���ڵ�
	public DoubleNode pre() {
		return this.pre;
	}
	
	public int getData() {
		return this.data;
	}

}
