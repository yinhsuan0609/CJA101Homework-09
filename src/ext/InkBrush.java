package ext;

public class InkBrush extends Pen {
	
	//繼承父類別Pen
	public InkBrush() {
		super();
	}
	public InkBrush(int price, String brand) {
		super(price, brand);
	}
	
	//override父類別的抽象方法
	@Override
	public void write() {
		System.out.println("實際售價：" + getPrice() * 0.9 );
		System.out.println("沾墨汁再寫");
	}

}

//• (1) 實作方法:Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//• (2) Pencil實際售價為定價8折，InkBrush為定價9折
//• (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額


