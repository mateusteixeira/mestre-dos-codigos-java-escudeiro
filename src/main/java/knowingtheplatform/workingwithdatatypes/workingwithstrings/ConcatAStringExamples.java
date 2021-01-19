package knowingtheplatform.workingwithdatatypes.workingwithstrings;

public class ConcatAStringExamples {

    public static void main(String[] args) {
        String firstPart = "first part";
        String lastPart = "of a String";

        String anotherFirstPart = "using operator +";
        String anotherLastPart = "to concat Strings";

        ConcatAStringExamples concatAStringExamples = new ConcatAStringExamples();
        System.out.println("Concatenated String with method concat: " + concatAStringExamples.concatStringWithConcat(firstPart, lastPart));
        System.out.println("Concatenated String with operator '+': " + concatAStringExamples.concatStringWithOperator(anotherFirstPart, anotherLastPart));
    }

    protected String concatStringWithConcat(String firstPart, String lastPart) {
        return firstPart.concat(" ").concat(lastPart);
    }

    protected String concatStringWithOperator(String firstPart, String lastPart) {
        return firstPart + " " + lastPart;
    }

}
