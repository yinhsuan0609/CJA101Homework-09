package ext;

public class Pencil extends Pen {
	//繼承父類別pen
	public Pencil() {
		super();
	}
	public Pencil(int price, String brand) {
		super(price, brand);
	}
	//override父類別的抽象方法
	public void write() {
		System.out.println("實際售價：" + getPrice() * 0.8 );
		System.out.println("削鉛筆再寫");
		
	}

}
