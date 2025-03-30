package ext;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pencil(200,"鉛筆");
		Pen p2 = new InkBrush(100,"墨筆");
		p1.write();
		p2.write();
	}
}
