package knowingtheplatform.workingwithstructures.workingwithcollections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class WorkWithPriorityQueue {

    protected void addAndRunInAPriorityQueue(List<String> names) {
        Queue<String> stringPriorityQueue = new PriorityQueue<>();

        long initTime = System.currentTimeMillis();
        for (String name : names) {
            stringPriorityQueue.add(name);
        }
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to add 200k String in PriorityQueue: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        stringPriorityQueue.remove(92032);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by index in PriorityQueue: " + (finalTime - initTime));

        initTime = System.currentTimeMillis();
        stringPriorityQueue.remove("Mateus");
        finalTime = System.currentTimeMillis();
        System.out.println("Time to remove by object in PriorityQueue: " + (finalTime - initTime));
    }
}
