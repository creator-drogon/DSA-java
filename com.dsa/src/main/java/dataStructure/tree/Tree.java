package dataStructure.tree;

public interface Tree<T> {

    public void insert(T data);
    public void remove(T data);
    public void traverse();
    // in-oder traversal , yield natural ordering
    public T getMax();
    public T getMin();

}
