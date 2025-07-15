package hw9;

class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 2500; // 假設初始帳戶餘額為2500
    }

    // 匯款方法
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("媽媽匯款 " + amount + " 元，當前帳戶餘額: " + balance);
        notify(); // 唤醒被挂起的提款執行緒
    }

    // 提款方法
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("帳戶餘額不足，等待媽媽匯款...");
                wait(); // 如果餘額不足，暫停提款
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("熊大提款 " + amount + " 元，當前帳戶餘額: " + balance);
    }

    // 取得帳戶餘額
    public synchronized int getBalance() {
        return balance;
    }
}

class MamaDeposit implements Runnable {
    private BankAccount account;

    public MamaDeposit(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (account.getBalance() > 3000) {
                System.out.println("帳戶餘額超過 3000 元，停止匯款！");
                break; // 如果餘額超過 3000，停止匯款
            }
            account.deposit(2000); // 媽媽匯款2000元
            try {
                Thread.sleep(1000); // 每次匯款間隔1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class XiongDaWithdraw implements Runnable {
    private BankAccount account;

    public XiongDaWithdraw(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (account.getBalance() < 2000) {
                System.out.println("帳戶餘額低於 2000 元，熊大要求媽媽匯款！");
                break; // 如果餘額低於2000，停止提款
            }
            account.withdraw(1000); // 熊大提款1000元
            try {
                Thread.sleep(1500); // 每次提款間隔1.5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



