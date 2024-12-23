package C04Interface.BankService;

public class BankCardService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        int current  = ba.getBalance();
        int balance = current + money;
        ba.updateBalance(balance);
        System.out.println(money+"원 카드로 입금");
        System.out.println("현재잔액은"+balance+"원입니다.");
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        int current  = ba.getBalance();
        if (current<money){
            System.out.println("잔액부족");
            return;
        }else {
            int balance = current - money;
            ba.updateBalance(balance);
            System.out.println(money+"원 카드로 출금");
            System.out.println("현재잔액은"+balance+"원입니다.");
        }

//        입금시
//        xx원 카드로 입금되었습니다.
//        현재잔액은 yy원 입니다.

//        출금
//        xx원 카드로 출금되었스빈다.
//        현재 잔액은 yy원 입니다.




    }
}
