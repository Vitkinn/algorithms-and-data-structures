package stack;

public interface StackInterface<T> {

    void push(T object);
    abstract void pop();
    T top();
    int length();
    boolean isEmpty();
    boolean isFull();
    void clear();
}
