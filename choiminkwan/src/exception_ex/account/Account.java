package exception_ex.account;

public class Account {
    private long balance;

    public Account() {}
    public long getBalance() {
        // 참조변수.get필드
        return balance;
    }
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) throws BalanceEx {
        // throws 떠 넘기기
        if(balance < money) {
            throw new BalanceEx("잔고부족: " + (money - balance) + " 모자람");
        } // throw 예외 발생 시키기
        balance -= money;
    }
    
}
