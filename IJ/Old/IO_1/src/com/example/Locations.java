package com.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Object> {
    private static Map<Integer, Object> myMap = new HashMap<>();
    @Override
    public int size() {
        return myMap.size();
    }

    @Override
    public boolean isEmpty() {
        return myMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return myMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return myMap.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return myMap.get(key);
    }

    @Override
    public Object put(Integer key, Object value) {
        return myMap.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return myMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ?> m) {

    }

    @Override
    public void clear() {
        myMap.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return myMap.keySet();
    }

    @Override
    public Collection<Object> values() {
        return myMap.values();
    }

    @Override
    public Set<Entry<Integer, Object>> entrySet() {
        return myMap.entrySet();
    }
}
