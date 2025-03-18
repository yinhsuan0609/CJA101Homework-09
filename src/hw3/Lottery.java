package hw3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("阿文...請輸入你討厭哪個數字？");
        int hateNumber = sc.nextInt();
        while (hateNumber < 1 || hateNumber > 9) {
            System.out.println("輸入的數字無效，請輸入 1 到 9 之間的數字！");
            hateNumber = sc.nextInt();
        }
        int[] randomNumber = new int[48];
        int index = 0;
        for (int i = 1; i <= 49; i++) {
            if (i != hateNumber) {
                randomNumber[index] = i;
                index++;
            }
        }
        System.out.println("隨機選擇的數字（不包含你討厭的數字）為：");
        for (int num : randomNumber) {
            System.out.print(num + " ");
        }
    }
}
