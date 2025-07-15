package hw7;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        // 呼叫 copyFile 方法，並提供來源檔案路徑與目標檔案路徑
        copyFile("C:\\Users\\YourUsername\\Desktop\\source.txt", "C:\\Users\\YourUsername\\Desktop\\destination.txt");
    }

    public static void copyFile(String sourceFilePath, String destinationFilePath) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            // 建立 FileInputStream 來讀取來源檔案
            inputStream = new FileInputStream(sourceFilePath);
            
            // 建立 FileOutputStream 來寫入目標檔案
            outputStream = new FileOutputStream(destinationFilePath);

            // 定義緩衝區大小
            byte[] buffer = new byte[1024];
            int length;

            // 從來源檔案讀取資料並寫入目標檔案
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            System.out.println("檔案已成功複製到: " + destinationFilePath);
        } catch (IOException e) {
            System.out.println("檔案複製過程中發生錯誤: " + e.getMessage());
        } finally {
            // 關閉檔案流，避免資源浪費
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("關閉檔案流時發生錯誤: " + e.getMessage());
            }
        }
    }
}
