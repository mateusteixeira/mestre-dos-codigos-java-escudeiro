package knowingtheplatform.workingwithoop.workwithinterfaces;

public class WorkWithInterfaces {

    public static void main(String[] args) {
        Polygon rectangle = new Rectangle();
        rectangle.calculateAndPrintArea(10, 30);
        rectangle.getSides();

        Polygon triangle = new Triangle();
        triangle.calculateAndPrintArea(4, 4);
        triangle.getSides();
    }
}
