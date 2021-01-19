package knowingtheplatform.workingwithstructures.workingwithcollections;

import knowingtheplatform.workingwithstructures.WorkWithStructuresHelper;
import java.util.List;

public class WorkWithCollections {

    public static void main(String[] args) {
        WorkWithArrayList workWithArrayList = new WorkWithArrayList();
        WorkWithLinkedList workWithLinkedList = new WorkWithLinkedList();
        WorkWithVector workWithVector = new WorkWithVector();
        WorkWithPriorityQueue workWithPriorityQueue = new WorkWithPriorityQueue();
        WorkWithHashSet workWithHashSet = new WorkWithHashSet();
        WorkWithTreeSet workWithTreeSet = new WorkWithTreeSet();
        WorkWithLinkedHashSet workWithLinkedHashSet = new WorkWithLinkedHashSet();

        WorkWithStructuresHelper workWithStructuresHelper = new WorkWithStructuresHelper();
        List<String> namesToSimulate = workWithStructuresHelper.generateRandomNames(200000);
        namesToSimulate.add("Mateus");

        System.out.println("Testing time properties of ArrayList, LinkedList, Vector and PriorityQueue");

        System.out.println("\nTesting ArrayList:");
        workWithArrayList.addAndRunInAnArrayList(namesToSimulate);

        System.out.println("\nTesting LinkedList:");
        workWithLinkedList.addAndRunInALinkedList(namesToSimulate);

        System.out.println("\nTesting Vector:");
        workWithVector.addAndRunInAVector(namesToSimulate);

        System.out.println("\nTesting PriorityQueue:");
        workWithPriorityQueue.addAndRunInAPriorityQueue(namesToSimulate);

        System.out.println("\nTesting time properties of HashSet, TreeSet and LinkedHashSet");

        System.out.println("\nTesting HashSet");
        workWithHashSet.addAndRunHashSet(namesToSimulate);

        System.out.println("\nTesting TreeSet");
        workWithTreeSet.addAndRunTreeSet(namesToSimulate);

        System.out.println("\nTesting LinkedHashSet");
        workWithLinkedHashSet.addAndRunLinkedHashSet(namesToSimulate);

        System.out.println("\nTesting ordination and non-repeated elements of HashSet, TreeSet and LinkedHashSet");

        System.out.println("\nTesting HashSet");
        workWithHashSet.workWithHashSet();

        System.out.println("\nTesting TreeSet");
        workWithTreeSet.workWithTreeSet();

        System.out.println("\nTesting LinkedHashSet");
        workWithLinkedHashSet.workWithLinkedHashSet();
    }

}



