package Chain;

public class TestNode {

	public static void main(String[] args) {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
//		n1.append(n2);
//		n1.append(n3);
		n1.append(n2).append(n3).append(new Node(4));
//		System.out.println(n1.next().next().next().getData());
//		System.out.println(n1.next().next().next().isLast());
		
		n1.show();
		
		//删除节点
//		n1.next().removeNext();
//		n1.show();
		
//		在2，3之间插入新节点
		Node node=new Node(5);
		n1.next().after(node);
		n1.show();

	}

}
