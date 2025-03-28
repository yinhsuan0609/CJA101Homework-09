package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle rec1 = new MyRectangle();
		rec1.setWidth(10);
		rec1.setDepth(20);
		MyRectangle rec2 = new MyRectangle(10, 20);
		System.out.println("無參數的建構子" + rec1.getArea());
		System.out.println("有參數的建構子" + rec2.getArea());	
	}

}
