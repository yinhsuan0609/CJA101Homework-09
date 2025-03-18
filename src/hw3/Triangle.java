package hw3;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三角形邊長(正整數)：");
		int a =  sc.nextInt();
		int b =  sc.nextInt();
		int c =  sc.nextInt();
		
		//三角形 = 兩邊長和大於第三邊
		if( a + b >= c && b + c >= a && c + a >= b && b > 0 && a > 0 && c > 0) {
			if ( a == b && b == c) {
				System.out.println("正三角形");
			}
			else if ((a == b && a != c) || (b == c && b !=a) || (c == a && a!= b)) {
				System.out.println("等腰三角形");
			}
            else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
				System.out.println("直角三角形");
            }
			else {
				System.out.println("其他三角形");
			}
		}
		else {
			System.out.println("不是三角形");
		}

	}

}
