package hw4;

public class ArrayOpposite {
	public static void main(String[] avgs) {
		String slogan = "Hello World";
		//將字串轉為char存入陣列
		char[] charSlogan = slogan.toCharArray();
		//將迴圈設定為索引值由大到小來印出反向字串
		 for(int i = charSlogan.length - 1; i >= 0 ; i--) {
			 System.out.print(charSlogan[i]);
		 }
					
	}

}

