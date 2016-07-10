
public class Base<K, V> {
	private Base<K, V> next;
	private final K key;
	private V value;

	public Base(K key, V value) {
		this.key = key;
		this.setValue(value);
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void setNext(Base<K, V> next) {
		this.next = next;
	}

	public Base<K, V> getNext() {
		return next;
	}

	public static void main(String[] args) {

	}

}
