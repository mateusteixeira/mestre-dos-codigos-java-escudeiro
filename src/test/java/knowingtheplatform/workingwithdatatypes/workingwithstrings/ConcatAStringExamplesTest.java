package knowingtheplatform.workingwithdatatypes.workingwithstrings;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatAStringExamplesTest {

    private ConcatAStringExamples concatAStringExamples = new ConcatAStringExamples();

    @Test
    public void should_assert_concatenation_using_method_concat() {
        String firstString = "rage";
        String secondString = "against";

        String resultString = concatAStringExamples.concatStringWithConcat(firstString, secondString);
        assertNotNull(resultString);
        assertEquals(firstString.concat(" ").concat(secondString), resultString);
    }

    @Test
    public void should_assert_concatenation_using_operator() {
        String firstString = "rage";
        String secondString = "against";

        String resultString = concatAStringExamples.concatStringWithConcat(firstString, secondString);
        assertNotNull(resultString);
        assertEquals(firstString + " " + secondString, resultString);
    }

}