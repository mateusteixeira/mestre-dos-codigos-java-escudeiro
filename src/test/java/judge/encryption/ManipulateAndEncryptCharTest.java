package judge.encryption;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManipulateAndEncryptCharTest {

    private final Main.ManipulateAndEncryptChar manipulateAndEncryptChar = new Main.ManipulateAndEncryptChar();

    @Test
    public void should_shift_plus_3_when_between_A_and_Z_and_reverse() {
        String toShift = "BCD";
        char[] expectedResult = new char[] {'G', 'F', 'E'};
        char[] chars = manipulateAndEncryptChar.encryptAndReverse(toShift);
        assertNotNull(chars);
        assertArrayEquals(expectedResult, chars);
    }

    @Test
    public void should_shift_plus_3_when_between_a_and_z_and_reverse() {
        String toShift = "abc";
        char[] expectedResult = new char[] {'f', 'e', 'd'};
        char[] chars = manipulateAndEncryptChar.encryptAndReverse(toShift);
        assertNotNull(chars);
        assertArrayEquals(expectedResult, chars);
    }

    @Test
    public void should_not_shift_when_not_a_letter_just_reverse() {
        String toShift = "123456#@%";
        char[] expectedResult = new char[] {'%', '@', '#', '6', '5', '4', '3', '2', '1'};
        char[] chars = manipulateAndEncryptChar.encryptAndReverse(toShift);
        assertNotNull(chars);
        assertArrayEquals(expectedResult, chars);
    }

    @Test
    public void should_shift_plus_3_when_letters_not_shift_when_not_letters_and_reverse_all() {
        String toShift = "AG# 592ccd$!";
        char[] expectedResult = new char[] {'!', '$', 'g', 'f', 'f', '2', '9', '5', ' ', '#', 'J', 'D'};
        char[] chars = manipulateAndEncryptChar.encryptAndReverse(toShift);
        assertNotNull(chars);
        assertArrayEquals(expectedResult, chars);
    }

    @Test
    public void should_shift_minus_1_in_last_half() {
        char[] charsToShift = new char[] {'!', '$', 'g', 'f', 'f', '2', '9', '5', ' ', '#', 'J', 'D'};
        char[] expectedResult = new char[] {'!', '$', 'g', 'f', 'f', '2', '8', '4', 31, '"', 'I', 'C'};
        char[] chars = manipulateAndEncryptChar.encryptShiftLeft(charsToShift, 12, 6);
        assertNotNull(chars);
        assertArrayEquals(expectedResult, chars);
    }

}