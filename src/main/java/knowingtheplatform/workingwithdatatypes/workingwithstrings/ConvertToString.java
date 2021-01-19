package knowingtheplatform.workingwithdatatypes.workingwithstrings;

public class ConvertToString {

    public static void main(String[] args) {

        int intToConvert = 43;
        String intConverted = Integer.toString(intToConvert);
        System.out.println("A String from a int: " +intConverted);

        Long longToConvert = 420L;
        String longConverted = Long.toString(longToConvert);
        System.out.println("A String from a Wrapper: " +longConverted);
    }

}
