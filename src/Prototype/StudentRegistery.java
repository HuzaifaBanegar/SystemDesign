package Prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery {
    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student prototype) {
        map.put(key, prototype);
    }
    public Student get(String key) {
        return map.get(key);
    }

    // TODO: Add remove method

}
