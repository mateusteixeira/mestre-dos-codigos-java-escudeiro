package knowingtheplatform.workingwithstructures.workingwithmaps;

import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.*;

public class WorkWithTreeMap {

    protected void addAndRunInATreeMap(List<String> names) {
        SortedMap<Integer, String> treeMapNames = new TreeMap<>();

        long initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            treeMapNames.put(i, names.get(i));
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in TreeMap: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        Set<Integer> keys = treeMapNames.keySet();
        for (Integer key : keys) {
            if (treeMapNames.get(key).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in TreeMap: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        treeMapNames.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in TreeMap: " + (finalTime - initTime));
    }

    protected void workWithTreeMap() {

        NavigableMap<Integer, String> treeMap = new TreeMap<>();

        WorkWithStructuresHelper.addToMap(1, "João", treeMap);
        WorkWithStructuresHelper.addToMap(2, "Claudia", treeMap);
        WorkWithStructuresHelper.addToMap(3, "Mateus", treeMap);
        WorkWithStructuresHelper.addToMap(4, "Carol", treeMap);
        WorkWithStructuresHelper.addToMap(5 ,"Igor", treeMap);
        WorkWithStructuresHelper.addToMap(6, "Bela", treeMap);
        WorkWithStructuresHelper.addToMap(4, "Mateus", treeMap);
        WorkWithStructuresHelper.addToMap(2, "Igor", treeMap);

        System.out.println("\nTreeMap does guarantee ordination in insertion:");
        Set<Integer> keys = treeMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " - " + treeMap.get(key));
        }

        System.out.println("\nPropertie of NavigableMap, Reverse navigation:");
        NavigableSet<Integer> descendingKeySet = treeMap.descendingKeySet();
        for (Integer key : descendingKeySet) {
            System.out.println(key + " - " + treeMap.get(key));
        }
    }


}
