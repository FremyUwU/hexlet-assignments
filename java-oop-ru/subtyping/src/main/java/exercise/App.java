package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> st = storage.toMap();
        Set<Entry<String, String>> entrySet = st.entrySet();
        entrySet.forEach(entry -> storage.unset(entry.getKey()));
        entrySet.forEach(entry -> storage.set(entry.getValue(), entry.getKey()));
    }
}
// END
