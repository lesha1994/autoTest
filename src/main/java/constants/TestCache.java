package constants;

import java.util.HashMap;
import java.util.Map;

public class TestCache {
    private static final Map<String, Object> testCashe = new HashMap<>();

    public static synchronized Map<String, Object> getMap() {
        return testCashe;
    }


    public static void putInTestCacheMap(String key, Object object) {
        testCashe.put(key, object);
    }


    public static Object getFromTestCacheMap(String key) {
        return testCashe.get(key);
    }


    public static void deleteFromTestCacheMap(String key) {
        testCashe.remove(key);
    }
}
