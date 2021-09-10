package hash.table;

public class HashNode <K , V>{
    private K key ;
    private V value ;
    final int hashcode ;
    private HashNode<K , V> next ;

    public HashNode(K key , V value , int hashcode){
        this.key = key ;
        this.value = value ;
        this.hashcode = hashcode ;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public int getHashcode() {
        return hashcode;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }

//    public void setKey(K key) {
//        this.key = key;
//    }


    public void setValue(V value) {
        this.value = value;
    }
}
