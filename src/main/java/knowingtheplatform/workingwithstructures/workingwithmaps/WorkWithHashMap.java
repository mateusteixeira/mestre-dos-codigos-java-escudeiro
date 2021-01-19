package knowingtheplatform.workingwithstructures.workingwithmaps;


import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkWithHashMap {

    protected void addAndRunInAHashMap(List<String> names) {
        Map<Integer, String> hashMapNames = new HashMap<>();

        long initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            hashMapNames.put(i, names.get(i));
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in HashMap: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        Set<Integer> keys = hashMapNames.keySet();
        for (Integer key : keys) {
            if (hashMapNames.get(key).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in HashMap: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        hashMapNames.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in HashMap: " + (finalTime - initTime));
    }

    protected void workWithHashMap() {

        Map<Integer, String> hashMap = new HashMap<>();

        WorkWithStructuresHelper.addToMap(1, "João", hashMap);
        WorkWithStructuresHelper.addToMap(2, "Claudia", hashMap);
        WorkWithStructuresHelper.addToMap(3, "Mateus", hashMap);
        WorkWithStructuresHelper.addToMap(4, "Carol", hashMap);
        WorkWithStructuresHelper.addToMap(5 ,"Igor", hashMap);
        WorkWithStructuresHelper.addToMap(6, "Bela", hashMap);
        WorkWithStructuresHelper.addToMap(4, "Mateus", hashMap);
        WorkWithStructuresHelper.addToMap(2, "Igor", hashMap);
        WorkWithStructuresHelper.addToMap(null, "keyNull", hashMap);

        System.out.println("\nHashMap does not guarantee ordination in insertion:");
        Set<Integer> keys = hashMap.keySet();
        for (Integer key : keys) {
            System.out.println(key + " - " + hashMap.get(key));
        }

        System.out.println("\nHashMap allows null key? " + hashMap.containsKey(null));
    }
}
