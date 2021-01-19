package knowingtheplatform.workingwithdatatypes.workingwithstrings;

public class CreateAStringExamples {


    public static void main(String[] args) {
        String aStringFromQuotes = "some String";
        System.out.println("Declaring a String with double quotes: " +aStringFromQuotes);

        String subStringFromAString = aStringFromQuotes.substring(0, 4);
        System.out.println("Using a method from String class: " +subStringFromAString);

        //redundante
        String aStringFromNewOperator = new String("another String");
        System.out.println("Declaring another String with new operator: " +aStringFromNewOperator);
    }
}
