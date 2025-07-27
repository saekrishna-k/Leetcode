class LRUCache {
    private Map<Integer, Integer> cache;
    private List<Integer> list;
    private int capacity;

    public LRUCache(int capacity) {
        cache = new HashMap<>(capacity);
        list = new LinkedList<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        list.remove(Integer.valueOf(key));
        list.addFirst(key);
        return cache.get(key);
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            list.remove(Integer.valueOf(key));
        } else {
            if (cache.size() >= capacity) {
                int leastUsed = list.removeLast();
                cache.remove(leastUsed);
            }
            cache.put(key, value);
        }
        list.addFirst(key);
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
