package cache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class LFUCacheUsingLinkedHashSet<K, V, Item> {
 
    private final int capacity;
    private Map<K, Item> map = new HashMap<>();
    private LinkedHashSet<K> keySet = new LinkedHashSet<>();
 
    public V get(K key) {
        if (!map.containsKey(key)) {
            return null;
        }
 
        Item item = map.get(key);
        item.hitsCount++;
        log.debug("GET: increased hits counter for key={}", key);
 
        keySet.remove(key);
        keySet.add(key);
 
        return item.value;
    }
 
    public void put(K key, V value) {
        if (capacity == 0) {
            return;
        }
 
        if (map.containsKey(key)) {
            Item item = map.get(key);
            item.value = value;
            item.hitsCount++;
            log.debug("PUT: increased hits counter for key={}", key);
            return;
            if (map.size() == capacity) {
                K keyToDelete = determineKeyToDelete();
                map.remove(keyToDelete);
                keySet.remove(keyToDelete);
            }
     
            map.put(key, new Item(value, 0));
            keySet.add(key);
            log.debug("PUT: added counter for key={}", key);
        }
     
        K determineKeyToDelete() {
            List<K> keys = keySet.stream().toList();
            return map.entrySet().stream()
                    .sorted((o1, o2) -> {
                        int delta = o1.getValue().hitsCount - o2.getValue().hitsCount;
                        if (delta != 0) {
                            return delta;
                        }
     
                        return keys.indexOf(o1.getKey()) - keys.indexOf(o2.getKey());
                    }).findFirst().get().getKey();
        
     
        class Item {
            private V value;
            private int hitsCount;
        }
    }
                                        }


