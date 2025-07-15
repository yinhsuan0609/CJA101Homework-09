package ext;

public abstract class Pen {
	private int price;
	private String brand;
	
	//建立有參數及無參數的建構子
	public Pen(){
		price = 0;
		brand = "";		
	}
	public Pen(int price, String brand) {
		this.price = price;
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//get/set方法建立
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	//抽象方法write建立
	public abstract void write();
	
}
