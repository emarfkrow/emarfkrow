package jp.co.golorp.emarf.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import jp.co.golorp.emarf.lang.StringUtil;

/**
 * @param <K>
 * @param <V>
 */
public final class IgnoreCaseLinkedMap<K, V> implements Map<String, V> {

    /** 挿入順を保持するための実体 */
    private final Map<String, V> map = new LinkedHashMap<>();

    /**
     * @param key
     * @return String
     */
    private String convertKey(final Object key) {
        return (key == null) ? null : key.toString().toUpperCase(Locale.ENGLISH);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(final Object key) {
        return map.containsKey(convertKey(key));
    }

    @Override
    public boolean containsValue(final Object value) {
        return map.containsValue(value);
    }

    @Override
    public V get(final Object key) {
        return map.get(convertKey(key));
    }

    @Override
    public V put(final String key, final V value) {
        return map.put(convertKey(key), value);
    }

    @Override
    public V remove(final Object key) {
        return map.remove(convertKey(key));
    }

    @Override
    public void putAll(final Map<? extends String, ? extends V> m) {
        for (Map.Entry<? extends String, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<String> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<V> values() {
        return map.values();
    }

    @Override
    public Set<Entry<String, V>> entrySet() {
        return map.entrySet();
    }

    /**
     * @param map
     * @param k
     * @return Object
     */
    public static Object get(final java.util.Map<String, Object> map, final String k) {
        String u = StringUtil.toUpperCase(k);
        if (map.containsKey(u)) {
            return map.get(u);
        }
        String n = StringUtil.toSnakeCase(k);
        if (map.containsKey(n)) {
            return map.get(n);
        }
        String p = StringUtil.toPascalCase(k);
        if (map.containsKey(p)) {
            return map.get(p);
        }
        String c = StringUtil.toCamelCase(k);
        if (map.containsKey(c)) {
            return map.get(c);
        }
        return null;
    }
}
