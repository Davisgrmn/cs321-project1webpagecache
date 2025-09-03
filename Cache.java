
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * TODO - complete the summary javadoc for the class here.
 * @author dgarman
 */

public class Cache<K, V extends KeyInterface<K>> implements CacheInterface<K, V> {

    private LinkedList<V> cache;
    private int size;

    public Cache(int size) {
        this.size = size;

    }

    @Override
    public V get(K key) {
        ListIterator<V> iterator = cache.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey() == key) {
                return iterator.next();
            }
            else {
                iterator.next();
            }
        }
        return null;
    }

    @Override
    public V add(V value) {
        if (cache.size() > size) {
            cache.addFirst(value);
            return cache.removeLast();
        }
        cache.addFirst(value);
        return null;
    }

    @Override
    public V remove(K key) {
        ListIterator<V> iterator = cache.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getKey() == key) {
                V elem = iterator.next();
                iterator.remove();
                return elem;
            }
            else {
                iterator.next();
            }
        }
        return null;
    }

    @Override
    public void clear() {
        cache = new LinkedList<>();
    }

    // K generic stands for Key and the V generic
    // stands for Value. V extends the provided
    // KeyInterface to guarantee that each V has a
    // method to get the Key.


}