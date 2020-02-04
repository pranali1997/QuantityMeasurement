package quantityMeasurement;

public class QuantityMeasureException extends Exception  {
    public enum ExceptionType{
        NULL_VALUE;
    }
    public ExceptionType type;

    public QuantityMeasureException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

}
