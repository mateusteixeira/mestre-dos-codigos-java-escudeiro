package knowingtheplatform.workingwithoop.workwithinterfaces;

public class Rectangle implements Polygon{

    @Override
    public void calculateAndPrintArea(int length, int width) {
        System.out.println("The area of the rectangle is " + (length * width));
    }

    @Override
    public void getSides() {
        System.out.println("I have 4 sides");
    }
}
