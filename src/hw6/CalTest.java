package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		int x, y;

		while (true) {
			System.out.println("請輸入x的值:");
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				break;
			} else {
				System.out.println("輸入型別不正確!");
				sc.next();
			}
		}
		while (true) {
			System.out.println("請輸入y的值:");
			if (sc.hasNextInt()) {
				y = sc.nextInt();
				break;
			} else {
				System.out.println("輸入型別不正確!");
				sc.next();
			}

		}

		int result = cal.powerXY(x, y);
		System.out.println(x+"的"+y+"次方等於"+result);

	}

}