package knowingtheplatform.workingwithstructures.workingwithmaps;

import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorkWithHashTable {

    protected void addAndRunInAHashTable(List<String> names) {
        Map<Integer, String> hashTableNames = new Hashtable<>();

        long initTime = System.currentTimeMillis();
        for (int i = 0; i < names.size(); i++) {
            hashTableNames.put(i, names.get(i));
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k Strings in Hashtable: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        Set<Integer> keys = hashTableNames.keySet();
        for (Integer key : keys) {
            if (hashTableNames.get(key).equals("Mateus")) {
                break;
            }
        }
        finalTime = System.currentTimeMillis();
        System.out.println("Time to find element Mateus in Hashtable: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        hashTableNames.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in Hashtable: " + (finalTime - initTime));
    }

    protected void workWithHashTable() {

        Map<Integer, String> hashtable = new Hashtable<>();

        WorkWithStructuresHelper.addToMap(1, "João", hashtable);
        WorkWithStructuresHelper.addToMap(2, "Claudia", hashtable);
        WorkWithStructuresHelper.addToMap(3, "Mateus", hashtable);
        WorkWithStructuresHelper.addToMap(4, "Carol", hashtable);
        WorkWithStructuresHelper.addToMap(5 ,"Igor", hashtable);
        WorkWithStructuresHelper.addToMap(6, "Bela", hashtable);
        WorkWithStructuresHelper.addToMap(4, "Mateus", hashtable);
        WorkWithStructuresHelper.addToMap(2, "Igor", hashtable);

        System.out.println("\nHashTable does not guarantee ordination in insertion:");
        Set<Integer> keys = hashtable.keySet();
        for (Integer key : keys) {
            System.out.println(key + " - " + hashtable.get(key));
        }
    }
}
