package knowingtheplatform.workingwithloops;

public class WorkWithDoWhile {

    public static void main(String[] args) {
        System.out.println("To reach 100 was need " + getTimesInLoopToReachANumberTwoByTwoFromZero(100) + " loops");
        System.out.println("Doing at least 1 time de loop, passing 0: " + getTimesInLoopToReachANumberTwoByTwoFromZero(0));
    }

    private static int getTimesInLoopToReachANumberTwoByTwoFromZero(int maxToReach) {
        int loopCount = 0;
        int increment = 0;
        do {
            increment += 2;
            loopCount++;
        } while (increment < maxToReach);
        return loopCount;
    }
}
