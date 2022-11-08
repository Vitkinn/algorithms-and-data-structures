package stack;

public interface Stack<T> {

    void push(T object);
    void pop();
    T top();
    int length();
    boolean isEmpty();
    boolean isFull();
    void clear();
}
