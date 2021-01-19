package knowingtheplatform.workingwithstructures.workingwithmaps;


import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkWithLinkedHashMap {

    protected void addAndRunInALinkedHashMap(List<String> names) {
        Map<Integer, String> linkedHashMapNames = new LinkedHashMap<>();

        long initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            linkedHashMapNames.put(i, names.get(i));
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in LinkedHashMap: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        Set<Integer> keys = linkedHashMapNames.keySet();
        for (Integer key : keys) {
            if (linkedHashMapNames.get(key).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in LinkedHashMap: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        linkedHashMapNames.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in LinkedHashMap: " + (finalTime - initTime));
    }

    protected void workWithLinkedHashMap() {

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        WorkWithStructuresHelper.addToMap(1, "João", linkedHashMap);
        WorkWithStructuresHelper.addToMap(2, "Claudia", linkedHashMap);
        WorkWithStructuresHelper.addToMap(3, "Mateus", linkedHashMap);
        WorkWithStructuresHelper.addToMap(4, "Carol", linkedHashMap);
        WorkWithStructuresHelper.addToMap(5 ,"Igor", linkedHashMap);
        WorkWithStructuresHelper.addToMap(6, "Bela", linkedHashMap);
        WorkWithStructuresHelper.addToMap(4, "Mateus", linkedHashMap);
        WorkWithStructuresHelper.addToMap(2, "Igor", linkedHashMap);
        WorkWithStructuresHelper.addToMap(null, "keyNull", linkedHashMap);

        System.out.println("\nLinkedHashMap does guarantee ordination in insertion:");
        Set<Integer> keys = linkedHashMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " - " + linkedHashMap.get(key));
        }

        System.out.println("\nLinkedHashMap allows null key? " + linkedHashMap.containsKey(null));
    }
}
