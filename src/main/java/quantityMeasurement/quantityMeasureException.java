package quantityMeasurement;

public class quantityMeasureException extends Exception  {
    public enum ExceptionType{
        NULL_VALUE;
    }
    public ExceptionType type;

    public quantityMeasureException(String message, ExceptionType type) {

        super(message);
        this.type = type;
    }

}
