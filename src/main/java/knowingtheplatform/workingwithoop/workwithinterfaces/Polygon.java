package knowingtheplatform.workingwithoop.workwithinterfaces;

public interface Polygon {

    void calculateAndPrintArea(int length, int width);

    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }

}
