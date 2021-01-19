package judge.whereismarble;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private final Main main = new Main();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void should_not_evaluate_scenarios_when_first_input_is_zero_zero_call_main_method() {
        InputStream in = new ByteArrayInputStream("0 0".getBytes());
        System.setIn(in);

        Main.main(new String[] {});
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_not_evaluate_scenarios_when_first_input_is_zero_zero() {
        InputStream in = new ByteArrayInputStream("0 0".getBytes());
        System.setIn(in);

        int casesTested = main.resolve();
        assertEquals(0, casesTested);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    public void should_evaluate_and_found_a_case() {
        String input = "4 1\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "1\n" +
                "5\n" +
                "0 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int casesTested = main.resolve();
        assertEquals(1, casesTested);
        assertEquals(getStringReplaced("CASE# 1:\n" +"5 found at 4"), getStringReplaced(outputStreamCaptor.toString()));
    }

    @Test
    public void should_evaluate_two_cases_and_found_one_and_not_found_other() {
        String input = "4 1\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "1\n" +
                "5\n" +
                "5 2\n" +
                "1\n" +
                "3\n" +
                "3\n" +
                "3\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "0 0";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        int casesTested = main.resolve();
        assertEquals(2, casesTested);
        assertEquals(getStringReplaced("CASE# 1:\n" +"5 found at 4\n" +"CASE# 2:\n" +"2 not found\n" +"3 found at 3"), getStringReplaced(outputStreamCaptor.toString()));
    }

    @Test
    public void should_return_index_of_element_in_array_when_it_found() {
        int[] array = new int[] {3, 6, 4, 2, 6};
        int expectedResult = 2;
        int index = main.searchInArray(array, 4);
        assertEquals(expectedResult, index);
    }

    @Test
    public void should_return_minus_one_when_element_not_found() {
        int[] array = new int[] {3, 6, 4, 2, 6};
        int expectedResult = -1;
        int index = main.searchInArray(array, 10);
        assertEquals(expectedResult, index);
    }

    private String getStringReplaced(String stringToReplace) {
        return stringToReplace.replaceAll("\n", "").replaceAll("\r", "");
    }

}