package bank;
//0707
public class Atm {
    public static void main(String[] args){
        Account account = new Account(10000);
        System.out.println(account);
        try {
            account.withdraw(20000);
        } catch (NotEnoughBalanceException e) {
            System.out.println("잔액이 부족합니다.");
            System.out.println(e.getMessage());
        }
        System.out.println(account);
        try {
            account.deposit(-20000);
        } catch (NegativeValueException e) {
            System.out.println("이것은 마이너스 통장이 아닙니다.");
            System.out.println(e.getMessage());
        }
        System.out.println(account);
    }
}
