package knowingtheplatform.workingwithexceptions.myexceptions;

public class OutOfBoundsValueException extends RuntimeException{

    public OutOfBoundsValueException(String message) {
        super(message);
    }
}
