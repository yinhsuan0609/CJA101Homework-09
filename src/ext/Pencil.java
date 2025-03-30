package ext;

public class Pencil extends Pen {
	public Pencil() {
		super();
	}
	public Pencil(int price, String brand) {
		super(price, brand);
	}
	public void write() {
		System.out.println("實際售價：" + getPrice() * 0.8 );
		System.out.println("削鉛筆再寫");
		
	}

}
