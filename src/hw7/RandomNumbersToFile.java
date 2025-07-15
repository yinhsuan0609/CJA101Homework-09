package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumbersToFile {
    public static void main(String[] args) {
    	String fileName = "/Users/yinhsuan/Desktop/sample.txt";  // 桌面路徑
        Random rand = new Random();    // 建立亂數產生器

        try {
            // 使用 FileWriter 的 append 模式將數字寫入檔案
            FileWriter writer = new FileWriter(fileName, true);

            // 產生 10 個 1 到 1000 之間的亂數整數
            for (int i = 0; i < 10; i++) {
                int randomNumber = rand.nextInt(1000) + 1;  // 亂數範圍是 1 到 1000
                writer.write(randomNumber + "\n");  // 寫入檔案並換行
            }

            writer.close();  // 關閉 FileWriter
            System.out.println("10個亂數已經成功寫入 Data.txt");
        } catch (IOException e) {
            System.out.println("檔案寫入發生錯誤: " + e.getMessage());
        }
    }
}
