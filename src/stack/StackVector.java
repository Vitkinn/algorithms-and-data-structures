package stack;

public class StackVector<T> implements Stack<T> {

    private int counter = 0;
    private int size;
    private T[] array;

    public StackVector(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    @Override
    public void push(T obj) {
        if (!isFull()) {
            this.array[counter] = obj;
            counter++;
        }
    }

    @Override
    public void pop() {
        if (!isEmpty()) {
            counter--;
            this.array[counter] = null;
        }
    }

    @Override
    public T top() {
        if (isEmpty())
            return null;
        return this.array[counter - 1];
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public boolean isFull() {
        return counter == size;
    }

    @Override
    public int length() {
        return counter - 1;
    }

    @Override
    public void clear() {
        this.array = (T[]) new Object[this.size];
        counter = 0;
    }
}
