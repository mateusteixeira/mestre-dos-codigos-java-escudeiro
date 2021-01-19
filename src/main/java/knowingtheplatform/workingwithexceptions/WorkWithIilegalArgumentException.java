package knowingtheplatform.workingwithexceptions;

import java.util.Objects;

public class WorkWithIilegalArgumentException {


    protected static void doSomeThingNiceWith(String thisObject) {
        if (Objects.isNull(thisObject)) {
            throw new IllegalArgumentException("I can't do nothing with null object");
        }
    }

}
