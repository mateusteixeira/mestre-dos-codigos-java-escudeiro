package knowingtheplatform.workingwithoop.workwithinterfaces;

public class Triangle implements Polygon{
    @Override
    public void calculateAndPrintArea(int length, int width) {
        System.out.println("The area of the triangle is " + ((length * width)/2));
    }
}
