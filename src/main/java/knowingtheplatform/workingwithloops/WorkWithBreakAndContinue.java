package knowingtheplatform.workingwithloops;

public class WorkWithBreakAndContinue {

    public static void main(String[] args) {

        System.out.println("Using break to stop a loop that goes from 1 to 10 when index is 5: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Time to stop because index is 5");
                break;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println("Some code after for");

        System.out.println("Using continue to print all number from 1 to 10 except 5: ");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
