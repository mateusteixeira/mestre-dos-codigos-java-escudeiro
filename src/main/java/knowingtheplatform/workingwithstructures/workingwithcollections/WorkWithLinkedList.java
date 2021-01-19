package knowingtheplatform.workingwithstructures.workingwithcollections;

import java.util.LinkedList;
import java.util.List;

public class WorkWithLinkedList {

    protected void addAndRunInALinkedList(List<String> names) {
        List<String> linkedListOfString = new LinkedList<>();

        long initTime = System.currentTimeMillis();
        for (String name : names) {
            linkedListOfString.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in LinkedList: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            if (linkedListOfString.get(i).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in LinkedList: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        linkedListOfString.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in LinkedList: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        linkedListOfString.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in LinkedList: " + (finalTime - initTime));
    }
}
