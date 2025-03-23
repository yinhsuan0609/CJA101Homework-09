package hw4;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//輸入日期
		System.out.print("請輸入日期：");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		//判斷月份是否有效
		if(month < 1 || month > 12 ) {
			System.out.print("輸入的日期無效，請重新輸入");
			return;
		}
		
		//不同年份的天數陣列宣告
		int leap[] = {31, 29 ,31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		int common[] = {31, 28 ,31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
		int sum = 0;
		
		//判斷閏年平年並使用對應陣列
		if(year % 4 == 0 && (year / 100 != 0 || year % 400 == 0)){
			for(int i = 0; i < month - 1; i++) {
				sum = sum + leap[i];
			}
		}
		else {
			for(int j = 0; j < month - 1; j++) {
				sum = sum + common[j];
				}
		}
		sum = sum + day;
		System.out.print("輸入的日期為該年的第"+ sum +"天");
	}
}	
