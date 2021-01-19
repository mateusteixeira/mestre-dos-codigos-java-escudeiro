package knowingtheplatform.workingwithstructures.workingwithcollections;

import java.util.List;
import java.util.Vector;

public class WorkWithVector {

    protected void addAndRunInAVector(List<String> names) {
        List<String> vectorOfStrings = new Vector<>();

        long initTime = System.currentTimeMillis();
        for (String name : names) {
            vectorOfStrings.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in Vector: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            if (vectorOfStrings.get(i).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in Vector: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        vectorOfStrings.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in Vector: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        vectorOfStrings.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in Vector: " + (finalTime - initTime));
    }

}
