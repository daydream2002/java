package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author wjh
 * @date 2023/12/13 8:19
 */

class no_146 extends LinkedHashMap {
    private int cap;

    public no_146(int capacity) {
        super(capacity , 0.75F,true);
        this.cap = capacity;
    }


    public int get(int key) {
        return (int) super.getOrDefault(key, -1);
    }


    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > cap;
    }
}