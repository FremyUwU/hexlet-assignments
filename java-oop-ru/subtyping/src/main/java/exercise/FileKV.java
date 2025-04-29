package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String path;


    public FileKV(String path, Map<String, String> map) {
        this.path = path;
        Utils.writeFile(path, Utils.serialize(map));
    }

    @Override
    public void set(String key, String value) {
        String content = Utils.readFile(path);
        Map<String, String> map = Utils.deserialize(content);
        map.put(key, value);
        Utils.writeFile(path, Utils.serialize(map));

    }

    @Override
    public void unset(String key) {
        String content = Utils.readFile(path);
        Map<String, String> map = Utils.deserialize(content);
        map.remove(key);
        Utils.writeFile(path, Utils.serialize(map));
    }

    @Override
    public String get(String key, String defaultValue) {
        String content = Utils.readFile(path);
        Map<String, String> map = Utils.deserialize(content);
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        String content = Utils.readFile(path);
        Map<String, String> map = Utils.deserialize(content);
        return map;
    }
}
// END
