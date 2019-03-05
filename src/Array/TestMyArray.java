package Array;

public class TestMyArray {

	public static void main(String[] args) {
		//创建一个可变的数组，并获取长度
		MyArray ma=new MyArray();
		int size=ma.size();
		System.out.println(size);
		ma.show();
		//往可变数组中添加一个元素
		ma.add(99);
		ma.add(98);
		ma.add(97);
		System.out.println(ma.size());
		ma.show();
		ma.insert(0, 44);
		ma.show();
		ma.delete(0);
		ma.show();
		System.out.println(ma.get(0));
		ma.set(0, 100);
		ma.show();
		System.out.println(ma.search(98));
		ma.insert(1, 99);
		ma.show();
		System.out.println(ma.binarySearch(100));
	}

}
