package hw3;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 101);  
        int number = -1;

        System.out.println("開始猜數字吧，範圍是 0 到 100");

        while (number != randomNumber) {
            System.out.print("請猜一個數字：");
            number = sc.nextInt();  

            if (number == randomNumber) {
                System.out.println("答對了！答案是 " + randomNumber);
            } else if (number < randomNumber) {
                System.out.println("猜錯囉！再往大一點猜");
            } else {
                System.out.println("猜錯囉！再往小一點猜");
            }
        }

    }
}
