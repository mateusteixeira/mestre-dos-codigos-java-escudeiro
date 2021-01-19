package knowingtheplatform.workingwithstructures.workingwithcollections;


import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WorkWithHashSet {

    protected void addAndRunHashSet(List<String> namesToSimulate) {
        Set<String> aHashSet = new HashSet<>();

        long initTime = System.currentTimeMillis();
        for (String name : namesToSimulate) {
            aHashSet.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k String in HashSet: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();

        for (Iterator<String> it = aHashSet.iterator(); it.hasNext(); ) {
            if (it.next().equals("Mateus")) {
                break;
            }
        }

        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in HashSet: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        aHashSet.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in HashSet: " + (finalTime - initTime));
    }

    protected void workWithHashSet() {

        Set<String> aHashSet = new HashSet<>();

        WorkWithStructuresHelper.addToSet("João", aHashSet);
        WorkWithStructuresHelper.addToSet("Claudia", aHashSet);
        WorkWithStructuresHelper.addToSet("Mateus", aHashSet);
        WorkWithStructuresHelper.addToSet("Carol", aHashSet);
        WorkWithStructuresHelper.addToSet("Igor", aHashSet);
        WorkWithStructuresHelper.addToSet("Bela", aHashSet);
        WorkWithStructuresHelper.addToSet("Mateus", aHashSet);
        WorkWithStructuresHelper.addToSet("Igor", aHashSet);

        System.out.println("\nHashSet does not guarantee ordination, but guarantee non-repeated elements:");
        for (String nameFromHashSet : aHashSet) {
            System.out.println(nameFromHashSet);
        }
    }
}
