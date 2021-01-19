package knowingtheplatform.workingwithexceptions.myexceptions;

public class NegativeValueException extends RuntimeException{

    public NegativeValueException (String message) {
        super(message);
    }

}
