package interviewDurgesh.comparable;

import java.util.HashMap;

class Employee {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.entrySet().removeIf(entry->entry.getValue().equalsIgnoreCase("banana"));
        System.out.println(map);

    }
}

