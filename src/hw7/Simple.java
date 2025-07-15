package hw7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Simple {
    public static void main(String[] args) {
        String fileName = "/Users/yinhsuan/Desktop/sample.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            
            int byteCount = 0; // 位元組數量
            int charCount = 0; // 字元數量
            int lineCount = 0; // 行數
            
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++; // 計算行數
                byteCount += line.getBytes().length; // 計算位元組
                charCount += line.length(); // 計算字元數
            }
            reader.close(); // 關閉檔案讀取器
            
            // 輸出檔案資訊
            System.out.println("Sample.txt檔案共有" + byteCount + "個位元組, " + charCount + "個字元, " + lineCount + "列資料");
        } catch (IOException e) {
            System.out.println("檔案讀取發生錯誤: " + e.getMessage());
        }
    }
}
