package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static InMemoryKV swapKeyValue(KeyValueStorage storage) {
        var st = storage.toMap().entrySet();
        HashMap<String, String> result = new HashMap<>();
        for (var entry : st) {
            result.put(entry.getValue(), entry.getKey());
        }
        return new InMemoryKV(result);
    }
}
// END
