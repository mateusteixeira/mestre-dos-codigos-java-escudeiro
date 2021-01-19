package judge.encryption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Mock
    private Main.ManipulateAndEncryptChar manipulateAndEncryptChar;

    @InjectMocks
    private Main main;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void after() {
        System.setOut(standardOut);
    }

    @Test
    public void should_not_encrypt_when_cases_is_less_than_one() {
        InputStream in = new ByteArrayInputStream("-1".getBytes());
        System.setIn(in);

        main.encrypt(manipulateAndEncryptChar);
        assertEquals("", outputStreamCaptor.toString().trim());

        verify(manipulateAndEncryptChar, never()).encryptAndReverse(any());
        verify(manipulateAndEncryptChar, never()).encryptShiftLeft(any(char[].class), any(int.class), any(int.class));
    }

    @Test
    public void should_not_encrypt_when_cases_is_less_than_one_by_main_method() {
        InputStream in = new ByteArrayInputStream("-1".getBytes());
        System.setIn(in);

        Main.main(new String[]{});
        assertEquals("", outputStreamCaptor.toString().trim());

        verify(manipulateAndEncryptChar, never()).encryptAndReverse(any());
        verify(manipulateAndEncryptChar, never()).encryptShiftLeft(any(char[].class), any(int.class), any(int.class));
    }

    @Test
    public void should_not_encrypt_when_cases_is_greater_than_10000() {
        InputStream in = new ByteArrayInputStream("10001".getBytes());
        System.setIn(in);

        main.encrypt(manipulateAndEncryptChar);
        assertEquals("", outputStreamCaptor.toString().trim());

        verify(manipulateAndEncryptChar, never()).encryptAndReverse(any());
        verify(manipulateAndEncryptChar, never()).encryptShiftLeft(any(char[].class), any(int.class), any(int.class));
    }

    @Test
    public void should_assert_how_many_times_is_encrypted_by_number_of_words() {
        String entry = "2\n" + "Texto #3\n" + "abcABC1";
        InputStream in = new ByteArrayInputStream(entry.getBytes());
        System.setIn(in);

        char[] reversedAndEncrypted = new char[] {'3', '#', ' ', 'r', 'w', '{', 'h', 'W'};
        char[] encryptedAndHalfShiftedLeft = new char[] {'3', '#', ' ', 'r', 'v', 'z' , 'g', 'V'};
        when(manipulateAndEncryptChar.encryptAndReverse("Texto #3")).thenReturn(reversedAndEncrypted);
        when(manipulateAndEncryptChar.encryptShiftLeft(reversedAndEncrypted, "Texto #3".length(), "Texto #3".length()/2)).thenReturn(encryptedAndHalfShiftedLeft);

        char[] reversedAndEncryptedSecondWord = new char[] {'1', 'F', 'E', 'D', 'f', 'e', 'd'};
        char[] encryptedAndHalfShiftedLeftSecondWord = new char[] {'1', 'F', 'E', 'C', 'e', 'd', 'c'};
        when(manipulateAndEncryptChar.encryptAndReverse("abcABC1")).thenReturn(reversedAndEncryptedSecondWord);
        when(manipulateAndEncryptChar.encryptShiftLeft(reversedAndEncryptedSecondWord, "abcABC1".length(), "abcABC1".length()/2)).thenReturn(encryptedAndHalfShiftedLeftSecondWord);


        main.encrypt(manipulateAndEncryptChar);
        assertEquals(getStringReplaced("3# rvzgV\n" + "1FECedc"), getStringReplaced(outputStreamCaptor.toString()));
        verify(manipulateAndEncryptChar, times(2)).encryptAndReverse(any());
        verify(manipulateAndEncryptChar, times(2)).encryptShiftLeft(any(char[].class), any(int.class), any(int.class));
    }

    private String getStringReplaced(String stringToReplace) {
        return stringToReplace.replaceAll("\n", "").replaceAll("\r", "");
    }
}
