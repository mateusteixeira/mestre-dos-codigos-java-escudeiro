package knowingtheplatform.workingwithstructures;

import java.util.*;

public class WorkWithStructuresHelper {

    private static final String LEXICON = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void addToSet(String name, Set<String> aSet) {
        System.out.println("\tAdding " + name + " to Set:");
        if (aSet.add(name)) {
            System.out.println("\tAdded with success");
        } else {
            System.out.println("\tName " + name + " already inserted");
        }
    }

    public static void addToMap(Integer key, String newValue, Map<Integer, String> aMap) {
        System.out.println("\tAdding key " + key + " and newValue " + newValue + " to Map:");

        String oldValue = aMap.put(key, newValue);

        if (Objects.isNull(oldValue)) {
            System.out.println("\tAdded with success");
        } else if (oldValue.equals(newValue)) {
            System.out.println("\tName " + newValue + " already inserted");
        } else {
            System.out.println("\tName old: " + oldValue + " replaced by: " + newValue);
        }

    }


    public List<String> generateRandomNames(int quantityOfNames) {

        Random rand = new Random();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < quantityOfNames; i++) {
            int length = rand.nextInt(5) + 5;
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < length; j++) {
                builder.append(LEXICON.charAt(rand.nextInt(LEXICON.length())));
            }
            names.add(builder.toString());
        }
        return names;
    }

}
