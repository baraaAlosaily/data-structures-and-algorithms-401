package hash.table;

public class Entery<T> {
    int key;
    T value;
    Entery next;

    public Entery(int key, T value) {
        this.key = key;
        this.value = value;
    }
    public Entery(){

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
