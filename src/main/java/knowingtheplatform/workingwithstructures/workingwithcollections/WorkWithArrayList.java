package knowingtheplatform.workingwithstructures.workingwithcollections;

import java.util.ArrayList;
import java.util.List;

public class WorkWithArrayList {

    protected void addAndRunInAnArrayList(List<String> names) {
        List<String> arrayOfStrings = new ArrayList<>();

        long initTime = System.currentTimeMillis();
        for (String name : names) {
            arrayOfStrings.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in ArrayList: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            if (arrayOfStrings.get(i).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in ArrayList: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        arrayOfStrings.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in ArrayList: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        arrayOfStrings.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in ArrayList: " + (finalTime - initTime));
    }


}
