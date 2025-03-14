package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		請建立一個TestNineNine.java程式，可輸出九九乘法表
//		一：使用for迴圈 + while迴圈
		int sum;
		int i, j;
		for(i = 1; i <= 9; i++) {
			j = 1;
			while(j <= 9)
			{
				sum = i * j;
				System.out.println(i + " x " + j + " = " + sum);
				j++;
			}
			System.out.println();
		}
//		二：使用for迴圈 + do while迴圈
		for(i = 1; i <= 9; i++) {
			j = 1;
			do {
				sum = i * j;
				System.out.println(i + " x " + j + " = " + sum);
				j++;
			} while (j <= 9);
		System.out.println();

		}
//		三：使用while迴圈 + do while迴圈
		i = 1;
		while(i <= 9) {
			j = 1;
			do {
				sum = i * j;
				System.out.println(i + " x " + j + " = " + sum);
				j++;
			} while (j <= 9);
			System.out.println();
			i++;
		}


	}


}
