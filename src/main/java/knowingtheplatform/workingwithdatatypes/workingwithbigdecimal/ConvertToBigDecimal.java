package knowingtheplatform.workingwithdatatypes.workingwithbigdecimal;

import java.math.BigDecimal;

public class ConvertToBigDecimal {

    public static void main(String[] args) {
        String aStringToConvert = "434";
        BigDecimal aBigDecimalFromStringWithOperatorNew = new BigDecimal(aStringToConvert);
        System.out.println("BigDecimal from String with new Operator: " +aBigDecimalFromStringWithOperatorNew);

        String anotherStringToConvert = "40323.42";
        System.out.println("Precision with BigDecimal when converted from String: " +new BigDecimal(anotherStringToConvert));

        double aDouble = 40323.42;
        System.out.println("Without precision when converted from a non String: " + new BigDecimal(aDouble));


    }
}
