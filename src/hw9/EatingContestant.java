package hw9;

import java.util.Random;

class EatingContestant implements Runnable {
    private String name;

    public EatingContestant(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int actionCount = 5; // 每個競賽者執行5個動作

        for (int i = 1; i <= actionCount; i++) {
            try {
                // 隨機生成500到3000毫秒之間的延遲時間
                int sleepTime = rand.nextInt(2501) + 500;
                System.out.println(name + " 執行動作 " + i + "，等待 " + sleepTime + " 毫秒");
                Thread.sleep(sleepTime); // 模擬執行動作
            } catch (InterruptedException e) {
                System.out.println(name + " 在執行過程中被中斷");
            }
        }
        System.out.println(name + " 競賽結束!");
    }

    public static void main(String[] args) {
        // 建立兩個競賽者
        EatingContestant mantouRen = new EatingContestant("饅頭人");
        EatingContestant james = new EatingContestant("詹姆士");

        // 創建執行緒
        Thread thread1 = new Thread(mantouRen);
        Thread thread2 = new Thread(james);

        // 啟動執行緒
        thread1.start();
        thread2.start();

        try {
            // 等待兩個執行緒執行完畢
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("主執行緒被中斷");
        }

        System.out.println("比賽結束！");
    }
}
