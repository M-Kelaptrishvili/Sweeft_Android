public class ex6<K, V> {
    private static final int defaulCapacity = 10;

    private int capacity;
    private int logLen;
    private Pair[] data;

    public ex6() {
        this(defaulCapacity);
    }

    public ex6(int capacity) {
        this.capacity = capacity;
        logLen = 0;
        data = new Pair[capacity];
        for (int i = 0; i < data.length; i++) {
            data[i] = new Pair<K,V>(0, 0);
        }
    }

    public void put(K key, V value) {
        int index = key.hashCode() % capacity;
        ex6.Pair<K,V> sameIndex = data[index];
        if(!sameIndex.put) {
            data[index] = new Pair<K,V>(key, value, true);
        } else {
            while(sameIndex.next != null) {
                if((sameIndex.key).equals(key)) {
                    sameIndex.value = value;
                    return;
                }
                sameIndex = sameIndex.next;

            }
            sameIndex.next = new Pair<K,V>(key, value, true);
        }
        logLen++;
    }

    public V get(K key) {
        int index = key.hashCode() % capacity;
        ex6.Pair<K,V> sameIndex = data[index];
        if(!sameIndex.put) {
            data[index] = new Pair<K,V>(key, value, true);
            return null;
        } else {
            while(sameIndex.next != null) {
                if((sameIndex.key).equals(key)) {
                    return sameIndex.value;
                }
                sameIndex = sameIndex.next;

            }
        }
        return null;
    } 

    public int size() {
        return logLen;
    }

    public void remove(K key) {
        int index = key.hashCode() % capacity;
        ex6.Pair<K,V> sameIndex = data[index];
        if(!sameIndex.put) return;

        while(sameIndex.next!=null && ((sameIndex.next).key).equals(key)) {
            sameIndex = sameIndex.next;
        }
        if(sameIndex != null && (sameIndex.next!=null && ((sameIndex.next).key).equals(key))) {
            ex6.Pair<K,V> toBeNext = sameIndex.next.next;
            sameIndex.next = toBeNext;
        }
    }


    private class Pair<K, V> {
        private K key;
        private V value;
        private boolean put;
        private Pair next;

        Pair(K key, V value, boolean put, Pair next) {
            this.key = key;
            this.value = value;
            this.put = put;
            this.next = next;
        }

        Pair(K key, V value, boolean put) {
            this(key, value, put, null);
        }

        Pair(K key, V value) {
            this(key, value, false, null);
        }
    }
}