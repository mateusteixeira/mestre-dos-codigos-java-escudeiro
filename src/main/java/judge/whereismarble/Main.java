package judge.whereismarble;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] abc) {

        Main main = new Main();
        main.resolve();

    }

    protected int resolve() {
        Scanner scanner = new Scanner(System.in);

        int testCase = 0;

        String entry = scanner.nextLine();

        while (!entry.equals("0 0")) {

            StringTokenizer st = new StringTokenizer(entry);
            int marbles = Integer.parseInt(st.nextToken());
            int queries = Integer.parseInt(st.nextToken());

            int[] marblesNumbers = new int[marbles];
            for (int i = 0; i < marbles; i++) {
                marblesNumbers[i] = Integer.parseInt(new StringTokenizer(scanner.nextLine()).nextToken());
            }

            Arrays.sort(marblesNumbers);
            System.out.println("CASE# " + ++testCase + ":");

            for (int i = 0; i < queries; i++) {
                int target = Integer.parseInt((new StringTokenizer(scanner.nextLine()).nextToken()));

                int index = searchInArray(marblesNumbers, target);

                if (index >= 0) {
                    System.out.println(target + " found at " + (index + 1));
                } else {
                    System.out.println(target + " not found");
                }
            }

            entry = scanner.nextLine();
        }

        return testCase;
    }

    protected int searchInArray(int[] marblesNumbers, int numberToFind) {
        for (int i = 0; i < marblesNumbers.length; i++) {
            if (marblesNumbers[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }
}



