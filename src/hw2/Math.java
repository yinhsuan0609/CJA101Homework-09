package hw2;

public class Math {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int k = 1;
		int sum = 0, productFor = 1, productWhile = 1;
		for(int i = 2; i <= 1000; i += 2) {
			sum = sum + i;
		}
		System.out.println(sum);
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		for(int j = 1; j <= 10; j++ ) {
			productFor = productFor * j;
		}
		System.out.println(productFor);

//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		while(k <= 10) {
			productWhile = productWhile * k;
			k++;
		}
		System.out.println(productWhile);
		
//		請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
		for(int l= 1; l <= 10; l++) {
			System.out.print(l * l + " ");
		}
		System.out.println();
//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		for(int m = 1; m <= 49; m++) {
			if (!String.valueOf(m).contains("4")){
				System.out.print(m + " ");
				count++;

			}			
		}
		System.out.println();
		System.out.println(count);	
//		請設計一隻Java程式,輸出結果為以下:
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2
//			1
		for(int n1 = 10; n1 >= 1; n1--) {
			for(int n2 = 1; n2 <= n1; n2++) {
				System.out.print(n2+ " ");
			}
			System.out.println(" ");
		}
		
//		請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		for(int p1 = 0;p1 < 6; p1++ ) {
			char Alphabet = (char)('A' + p1);
			for(int p2 = 0; p2 <= p1; p2++) {
				System.out.print(Alphabet);
			}
			System.out.println(" ");
		}

			
	
	}
}
