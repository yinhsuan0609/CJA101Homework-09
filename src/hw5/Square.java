package hw5;

import java.util.Scanner;

public class Square {
	private int width, height;
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高：");
	    int enterWidth = sc.nextInt();
	    int enterHeight = sc.nextInt();
	    
	    //呼叫列印的方法並使用sc輸入的數值帶入方法的參數
	    StarSquare(enterWidth, enterHeight);

	}
	private static void StarSquare(int width, int height) {
		//雙層回圈個別計算橫排和直排數量並印出
		for(int i = 1; i <=height ; i++) {
			for(int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

