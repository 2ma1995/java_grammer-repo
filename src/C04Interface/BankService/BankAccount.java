package C04Interface.BankService;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    //     생성자 추가
    public void updateBalance(int balance){
        this.balance = balance;
    }
//    getter
}
