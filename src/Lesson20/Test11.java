package Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(77, "Ivanov Ivan");
        map.put(78, "Petrov Igor");
        map.put(79, "Sidorov Ivan");
        map.put(79, "Volkov Sergey");
        map.remove(77);
        System.out.println(map);
    }
}
