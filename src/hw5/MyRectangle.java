package hw5;

public class MyRectangle {
	private double width; 
	private double depth;
	
	//有參數&無參數建構子建立
	public MyRectangle() {
		
	}
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
		
	}
	//get/set方法建立
	public void setWidth(double width) {
		this.width = width;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	//建立計算面積的方法
	public double getArea() {
		return width * depth;
		
	}

}
