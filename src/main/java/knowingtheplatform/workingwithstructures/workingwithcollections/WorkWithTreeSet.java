package knowingtheplatform.workingwithstructures.workingwithcollections;

import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.*;

public class WorkWithTreeSet {

    protected void addAndRunTreeSet(List<String> namesToSimulate) {
        Set<String> aTreeSet = new TreeSet<>();

        long initTime = System.currentTimeMillis();
        for (String name : namesToSimulate) {
            aTreeSet.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k String in TreeSet: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();

        for (Iterator<String> it = aTreeSet.iterator(); it.hasNext(); ) {
            if (it.next().equals("Mateus")) {
                break;
            }
        }

        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in TreeSet: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        aTreeSet.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in TreeSet: " + (finalTime - initTime));
    }

    protected Set<String> workWithTreeSet() {

        NavigableSet<String> aTreeSet = new TreeSet<>();

        WorkWithStructuresHelper.addToSet("João", aTreeSet);
        WorkWithStructuresHelper.addToSet("Claudia", aTreeSet);
        WorkWithStructuresHelper.addToSet("Mateus", aTreeSet);
        WorkWithStructuresHelper.addToSet("Carol", aTreeSet);
        WorkWithStructuresHelper.addToSet("Igor", aTreeSet);
        WorkWithStructuresHelper.addToSet("Bela", aTreeSet);
        WorkWithStructuresHelper.addToSet("Mateus", aTreeSet);
        WorkWithStructuresHelper.addToSet("Igor", aTreeSet);

        System.out.println("\nTreeSet does guarantee ordination in insertion and guarantee non-repeated elements:");
        for (String aNameTreeSet : aTreeSet) {
            System.out.println(aNameTreeSet);
        }

        System.out.println("\nAnother property from NavigableSet Interface, reverse navigate: ");
        NavigableSet<String> reverseOrderedNames = aTreeSet.descendingSet();
        for (String aNameTreeSet : reverseOrderedNames) {
            System.out.println(aNameTreeSet);
        }

        return aTreeSet;
    }
}
