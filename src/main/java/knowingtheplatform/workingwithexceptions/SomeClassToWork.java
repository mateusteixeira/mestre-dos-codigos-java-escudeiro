package knowingtheplatform.workingwithexceptions;

public class SomeClassToWork {

    private String someString;

    public SomeClassToWork(String someString) {
        this.someString = someString;
    }

    protected void isEqual(String anotherString) {
        try {
            System.out.println(someString + " is equal " + anotherString + " ? " + someString.equals(anotherString));
        } catch (Exception e) {
            System.out.println("Some error occurs: " + e.getMessage());
        } finally {
            System.out.println("Do something here independents the previous result.");
        }
    }

}
