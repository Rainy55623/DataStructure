package Stack;

public class MyStack {
	//ջ�ײ�ʹ������������
	int[] elements;
	public MyStack() {
		elements=new int[0];
	}
	
	//ѹ��Ԫ��=������β�����һ��Ԫ��
	public void push(int element) {
		int[] newArr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i]=elements[i];
		}
		newArr[elements.length]=element;
		elements=newArr;
	}
	
	//ȡ��ջ��Ԫ��
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("the stack is empty");
		}
		//ȡ����������һ��Ԫ��
		int element=elements[elements.length-1];
		//ɾ����Ԫ��
		int[] newArr=new int[elements.length-1];
		for(int i=0;i<newArr.length;i++) {
			newArr[i]=elements[i];
		}
		elements=newArr;
		return element;
	}
	
	//�鿴ջ��Ԫ��
	public int peek() {
		return elements[elements.length-1];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty() {
		return elements.length==0;
	}
	


}
