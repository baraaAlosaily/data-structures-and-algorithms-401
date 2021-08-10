package stack.and.queue;

public class Dogs extends Animal{

    public Dogs(String dogName) {
        super(dogName);
    }

    @Override
    public String toString() {
        return "dog :"+getName();
    }
}
