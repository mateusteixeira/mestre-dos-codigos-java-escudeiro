package judge.encryption;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.encrypt(new ManipulateAndEncryptChar());
    }

    protected void encrypt(ManipulateAndEncryptChar manipulateAndEncryptedChar) {
        Scanner scanner = new Scanner(System.in);
        String entry = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(entry);

        int numberOfEntry = Integer.parseInt(st.nextToken());

        if (numberOfEntry < 1 || numberOfEntry > 10000) {
            return;
        }
        do {
            String stringToEncrypt = scanner.nextLine();
            char[] result = manipulateAndEncryptedChar.encryptAndReverse(stringToEncrypt);

            int halfLength = stringToEncrypt.length() / 2;
            result = manipulateAndEncryptedChar.encryptShiftLeft(result, stringToEncrypt.length(), halfLength);

            System.out.println(result);

            numberOfEntry--;
        } while (numberOfEntry > 0);
    }

    protected static class ManipulateAndEncryptChar {

        protected char[] encryptAndReverse(String stringToEncrypt) {
            char[] result = new char[stringToEncrypt.length()];
            int reverseCount = stringToEncrypt.length();
            for (int i = 0; i < stringToEncrypt.length(); i++) {
                char charToManipulate = stringToEncrypt.charAt(i);
                if ((charToManipulate >= 'A' && charToManipulate <= 'Z') || (charToManipulate >= 'a' && charToManipulate <= 'z')) {
                    result[--reverseCount] = (char) (charToManipulate + 3);
                } else {
                    result[--reverseCount] = charToManipulate;
                }
            }
            return  result;
        }

        protected char[] encryptShiftLeft(char[] toEncrypt, int length, int halfLength) {
            for (int i = halfLength; i < length; i++) {
                    toEncrypt[i] = (char) (toEncrypt[i] - 1);
            }
            return toEncrypt;
        }
    }

}
