package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage{
    private Map<String, String> map = new HashMap<>();

    public InMemoryKV(Map<String, String> map) {
        var entrySet = map.entrySet();
        for (var entry : entrySet) {
            this.map.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void set(String key, String value) {
        map.put(key, value);
    }

    @Override
    public void unset(String key) {
        map.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        var entrySet = map.entrySet();
        Map<String, String> result = new HashMap<>();
        for (var entry : entrySet) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
// END
