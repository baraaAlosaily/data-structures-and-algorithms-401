package hash.table;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JoinHashTableImp<K , V> {
    private ArrayList<HashNode<K , V>> bucketArray ;
    private int numOfBuckets ;
    private int size ;

    public JoinHashTableImp(){
        this.bucketArray = new ArrayList<>();
        numOfBuckets = 10 ;
        size = 0 ;

        for (int i= 0 ; i < numOfBuckets ; i++)
            bucketArray.add(null);
    }

    public int hashCode(K key){
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key){
        int hashCode = hashCode(key);
        int index = hashCode % numOfBuckets ;

        index = index < 0 ? index*-1 : index ;
        return index ;
    }


    public void add(K key , V value){
        int bucketIndex = getBucketIndex(key) ;
        int hashCode = hashCode(key);

        HashNode<K , V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if (head.getKey().equals(key) && head.getHashcode() == hashCode){
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }

        size++ ;

        head = bucketArray.get(bucketIndex);
        HashNode<K , V> newNode = new HashNode<>(key , value , hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex , newNode);

        if((1.0 * size) / numOfBuckets >= 0.7){
            ArrayList<HashNode<K , V>> temp = bucketArray ;
            bucketArray = new ArrayList<>();
            numOfBuckets = 2 * numOfBuckets ;
            size = 0 ;

            for (int i = 0 ; i < numOfBuckets ; i++)
                bucketArray.add(null);

            for (HashNode<K , V> headNode : temp){
                while (headNode != null){
                    add(headNode.getKey() , headNode.getValue());
                    headNode = headNode.getNext() ;
                }
            }
        }
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K , V> head = bucketArray.get(bucketIndex);

        while (head != null){
            if(head.getKey().equals(key) && head.getHashcode() == hashCode)
                return head.getValue();
            head = head.getNext();
        }

        return null ;
    }

    public List<K> getKeys(){
        List<K> keys = new ArrayList<>();
        for (HashNode<K ,V> bucket : bucketArray)
            if (bucket != null) keys.add(bucket.getKey()) ;
        return keys ;
    }

}
