package hw5;

import java.util.Scanner;

public class Square {
	private int width, height;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高：");
	    int enterWidth = sc.nextInt();
	    int enterHeight = sc.nextInt();
	    StarSquare(enterWidth, enterHeight);

	}
	private static void StarSquare(int width, int height) {
		for(int i = 1; i <=height ; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

