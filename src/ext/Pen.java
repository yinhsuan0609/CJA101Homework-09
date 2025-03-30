package ext;

public abstract class Pen {
	private int price;
	private String brand;
	
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
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public abstract void write();
	
}
