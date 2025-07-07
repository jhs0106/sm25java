package bank;
//0707
public class NegativeValueException extends Exception {
    public NegativeValueException() {}
    public NegativeValueException(String message) {
        super(message);
    }
}
