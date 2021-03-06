package graph;

import java.util.Objects;

public class Vertex<T> {
    T label;

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }

    public Vertex(T label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return (String) label;
    }
}
