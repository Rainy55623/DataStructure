package Stack;

public class MyStack {
	//栈底层使用数组存放数据
	int[] elements;
	public MyStack() {
		elements=new int[0];
	}
	
	//压入元素=向数组尾部添加一个元素
	public void push(int element) {
		int[] newArr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++) {
			newArr[i]=elements[i];
		}
		newArr[elements.length]=element;
		elements=newArr;
	}
	
	//取出栈顶元素
	public int pop() {
		if(elements.length==0) {
			throw new RuntimeException("the stack is empty");
		}
		//取出数组的最后一个元素
		int element=elements[elements.length-1];
		//删掉该元素
		int[] newArr=new int[elements.length-1];
		for(int i=0;i<newArr.length;i++) {
			newArr[i]=elements[i];
		}
		elements=newArr;
		return element;
	}
	
	//查看栈顶元素
	public int peek() {
		return elements[elements.length-1];
	}
	
	//判断栈是否为空
	public boolean isEmpty() {
		return elements.length==0;
	}
	


}
