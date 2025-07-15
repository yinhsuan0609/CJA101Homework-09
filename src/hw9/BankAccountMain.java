package hw9;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); // 創建帳戶

        // 創建匯款與提款的執行緒
        MamaDeposit mamaDeposit = new MamaDeposit(account);
        XiongDaWithdraw xiongDaWithdraw = new XiongDaWithdraw(account);

        // 啟動兩個執行緒
        Thread mamaThread = new Thread(mamaDeposit);
        Thread xiongDaThread = new Thread(xiongDaWithdraw);

        mamaThread.start();
        xiongDaThread.start();

        try {
            mamaThread.join();
            xiongDaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("模擬結束，帳戶最終餘額: " + account.getBalance());
    }
}
