package knowingtheplatform.workingwithstructures.workingwithmaps;

import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;

import java.util.List;

public class WorkWithMaps {

    public static void main(String[] args) {

        WorkWithHashTable workWithHashTable = new WorkWithHashTable();
        WorkWithHashMap workWithHashMap = new WorkWithHashMap();
        WorkWithLinkedHashMap workWithLinkedHashMap = new WorkWithLinkedHashMap();
        WorkWithTreeMap workWithTreeMap = new WorkWithTreeMap();

        WorkWithStructuresHelper workWithStructuresHelper = new WorkWithStructuresHelper();
        List<String> randomNames = workWithStructuresHelper.generateRandomNames(200000);
        randomNames.add("Mateus");

        System.out.println("Testing time properties of HashTable, HashMap, LinkedHashMap and TreeMap:");

        System.out.println("\nTesting HashTable:");
        workWithHashTable.addAndRunInAHashTable(randomNames);

        System.out.println("\nTesting HashMap:");
        workWithHashMap.addAndRunInAHashMap(randomNames);

        System.out.println("\nTesting LinkedHashMap:");
        workWithLinkedHashMap.addAndRunInALinkedHashMap(randomNames);

        System.out.println("\nTesting TreeMap:");
        workWithTreeMap.addAndRunInATreeMap(randomNames);

        System.out.println("\nTesting ordination and non-repeated elements of HashTable, HashMap, LinkedHashMap and TreeMap: ");

        System.out.println("\tTesting HashTable: ");
        workWithHashTable.workWithHashTable();

        System.out.println("\tTesting HashMap: ");
        workWithHashMap.workWithHashMap();

        System.out.println("\tTesting LinkedHashMap: ");
        workWithLinkedHashMap.workWithLinkedHashMap();

        System.out.println("\tTesting TreeMap: ");
        workWithTreeMap.workWithTreeMap();

    }
}
