package knowingtheplatform.workingwithexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WorkWithExceptions {

    public static void main(String[] args) {

        try {
            System.out.println("Divide 10 by 0, please: ");
            WorkWithArithmeticException.divideByZero();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("\nCatch a ArithmeticException: " + arithmeticException.getClass());
        }

        try {
            System.out.println("\nGet index -1 from array: ");
            WorkWithArrayIndexOutOfBoundsException.getByIndex(-1);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Catch a ArrayIndexOutOfBoundsException when index is negative: " +arrayIndexOutOfBoundsException.getClass());
        }

        try {
            System.out.println("\nGet index 10 from array: ");
            WorkWithArrayIndexOutOfBoundsException.getByIndex(10);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("\nCatch a ArrayIndexOutOfBoundsException when index is greater then size-1: " +arrayIndexOutOfBoundsException.getClass());
        }

        try {
            System.out.println("\nPlease, load the jdbc driver for me: ");
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println("Catch a ClassNotFoundException: " + classNotFoundException.getClass());
        }

        try {
            System.out.println("\nPlease, open a file to me: ");
            new FileInputStream("aNonExistentFile.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Catch a FileNotFoundException: " + fileNotFoundException.getClass());
        }

        try {
            System.out.println("\nTest a String and do something: ");
            WorkWithIilegalArgumentException.doSomeThingNiceWith(null);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Catch a IllegalArgumentException: " + illegalArgumentException.getClass() + " with message: " + illegalArgumentException.getMessage());
        }


        System.out.println("\nLet's cause a NullPointerException: ");
        String aStringToBeNull = null;
        String aStringToBeCompared = "Java!";

        try {
            System.out.println(aStringToBeNull + "is equals to " + aStringToBeCompared + " ?" + aStringToBeNull.equals(aStringToBeCompared));
        } catch (NullPointerException nullPointerException) {
            System.out.println("Catch a NullPointerException: " + nullPointerException.getCause());
        }

        System.out.println("\nLet's cause a InterruptedException:");
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
    }

}
