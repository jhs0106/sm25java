package bank;
//0707
public class NotEnoughBalanceException extends Exception {
    public NotEnoughBalanceException() {}
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
