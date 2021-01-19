package javabasic.task4;

import java.util.HashMap;
import java.util.Map;

public class OutOfMemoryExample {

    public static void main(String[] args) {

        Long availableMemory = Runtime.getRuntime().maxMemory();
        System.out.println(availableMemory);

        Map<Key, String> values = new HashMap();
        while (true) {
            for (int i = 0; i < 10000; i++) {
                if (!values.containsKey(new Key(i))) {
                    values.put(new Key(i), "Number:" + i);
                }
            }
        }
    }

    private static class Key {
        private Integer id;

        private Key(Integer id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }
}
