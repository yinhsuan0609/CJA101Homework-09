package hw4;

public class ArrayOpposite {
	public static void main(String[] avgs) {
		String slogan = "Hello World";
		char[] charSlogan = slogan.toCharArray();
		 for(int i = charSlogan.length - 1; i >= 0 ; i--) {
			 System.out.print(charSlogan[i]);
		 }
		
				
	}

}

//• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
//(提示:String方法,陣列)

