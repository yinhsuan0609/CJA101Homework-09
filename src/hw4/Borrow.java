package hw4;

import java.util.Scanner;

public class Borrow {
	public static void main(String[] args) {
		int employee[][]= {{25, 32, 8, 19, 27}, {2500, 800, 500, 1000, 1200}};
	    Scanner sc = new Scanner(System.in);
	    int money = 0;
	    int count = 0;
        System.out.print("請輸入想要借款的金額：");
        money = sc.nextInt();  
        System.out.print("有錢可借的員工編號：");
	    for(int i = 0; i < employee[1].length; i++ ) {
	    	if(money < employee[1][i]) {
	            System.out.print(employee[0][i]+" ");
	            count++;
	    	}
	    }
        System.out.print("共" + count + "人");
	    
	}

}
