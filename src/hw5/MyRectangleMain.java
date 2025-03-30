package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle rec1 = new MyRectangle();
		//無參數建構子使用set設定長寬並呼叫計算面積的方法得到結果
		rec1.setWidth(10);
		rec1.setDepth(20);
		System.out.println("無參數的建構子" + rec1.getArea());
		
		//有參數的建構子使用參數設定長寬並呼叫計算面積的方法得到結果
		MyRectangle rec2 = new MyRectangle(10, 20);
		System.out.println("有參數的建構子" + rec2.getArea());	
	}

}
