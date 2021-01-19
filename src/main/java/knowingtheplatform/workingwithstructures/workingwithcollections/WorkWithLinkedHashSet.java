package knowingtheplatform.workingwithstructures.workingwithcollections;


import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class WorkWithLinkedHashSet {

    protected void addAndRunLinkedHashSet(List<String> namesToSimulate) {
        Set<String> aLinkedHashSet = new LinkedHashSet<>();

        long initTime = System.currentTimeMillis();
        for (String name : namesToSimulate) {
            aLinkedHashSet.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k String in LinkedHashSet: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();

        for (Iterator<String> it = aLinkedHashSet.iterator(); it.hasNext(); ) {
            if (it.next().equals("Mateus")) {
                break;
            }
        }

        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in LinkedHashSet: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        aLinkedHashSet.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in LinkedHashSet: " + (finalTime - initTime));

    }


    protected void workWithLinkedHashSet() {

        Set<String> aLinkedHashSet = new LinkedHashSet<>();

        WorkWithStructuresHelper.addToSet("Mateus", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("João", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("Claudia", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("Igor", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("Carol", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("Bela", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("Mateus", aLinkedHashSet);
        WorkWithStructuresHelper.addToSet("Igor", aLinkedHashSet);

        System.out.println("\nLinkedHashSet the insertion order and guarantee non-repeated elements:");
        for (String aNameTreeSet : aLinkedHashSet) {
            System.out.println(aNameTreeSet);
        }
    }

}
