package p13.textbook.ex04;

public class Pair<K, V> {
	private K Key;
	private V value;
	
	public Pair(K key, V value) {
		this.Key = key;
		this.value = value;
	}
	
	public K getKey() {
		return Key;
	}
	
	public V getValue() {
		return value;
	}
}
