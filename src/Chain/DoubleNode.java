package Chain;

public class DoubleNode {
	//上一个节点
	DoubleNode pre=this;
	//下一个节点
	DoubleNode next=this;
	//节点数据
	int data;
	
	public DoubleNode(int data) {
		this.data=data;
	}
	
	//增加节点
	public void after(DoubleNode node) {
		//记录原双链表中，this的下一个节点
		DoubleNode nextNext=next;
		//把新节点作为当前this的下一个节点
		this.next=node;
		//把当前this节点作为新节点的前一个节点
		node.pre=this;
		//将新节点的下一个节点指向原this的下一个节点
		node.next=nextNext;
		//将原this的下一个节点的上节点为新节点
		nextNext.pre=node;
	}
	
	//获取下一个节点
	public DoubleNode next() {
		return this.next;
	}
	//获取上一个节点
	public DoubleNode pre() {
		return this.pre;
	}
	
	public int getData() {
		return this.data;
	}

}
