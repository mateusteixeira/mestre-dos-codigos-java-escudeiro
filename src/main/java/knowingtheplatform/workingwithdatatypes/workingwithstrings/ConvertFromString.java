package knowingtheplatform.workingwithdatatypes.workingwithstrings;

public class ConvertFromString {

    public static void main(String[] args) {

        String aNumberAsString = "10";
        int aIntFromString = Integer.parseInt(aNumberAsString);
        System.out.println("A int from String: " +aIntFromString);

        long aLongFromString = Long.parseLong(aNumberAsString);
        System.out.println("A long from String: " +aLongFromString);

        Long aLongWrapperFromString = Long.valueOf(aNumberAsString);
        System.out.println("A Long wrapper from a String: " +aLongWrapperFromString);

    }
}
