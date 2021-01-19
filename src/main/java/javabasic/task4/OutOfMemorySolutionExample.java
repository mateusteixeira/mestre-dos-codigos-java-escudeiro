package javabasic.task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OutOfMemorySolutionExample {

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return Objects.equals(id, key.id);
        }
    }
}
