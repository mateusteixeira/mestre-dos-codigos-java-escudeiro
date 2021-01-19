package knowingtheplatform.workingwithexceptions;

public class WorkWithTryCatchFinally {

    public static void main(String[] args) {

        SomeClassToWork someClassToWork = new SomeClassToWork("Here is a String!");
        someClassToWork.isEqual("here is another String");

        SomeClassToWork anotherClassWithNull = new SomeClassToWork(null);
        anotherClassWithNull.isEqual("I hope throws a NullPointer");

    }

}
