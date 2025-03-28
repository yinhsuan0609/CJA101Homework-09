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

