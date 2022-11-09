package list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl<T> implements List<T> {

    private KnotList<T> first = new KnotList<>();
    private KnotList<T> last = new KnotList<>();
    private int counter;

    public LinkedListImpl() {
        clear();
    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T element) {
        KnotList<T> aux = new KnotList<>();
        aux.setObj(element);
        aux.setNext(null);

        if (isEmpty()) {
            //this.first = new KnotList<>(newObject, null);
            this.first = aux;
            this.last = aux;
        }
        else {
            //this.last = this.first;
            this.last.setNext(aux);
            this.last = aux;
            counter++;
        }
        counter++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        if (index <= 0 && index <= this.counter) {
            KnotList temp = first;
            for(int i = 0; i < (index -1); i++) {
                temp = temp.getNext();
            }
            KnotList<T> aux = new KnotList<>();
            aux.setObj(element);
            aux.setNext(temp.getNext());
            temp.setNext(aux);
            counter++;
        }
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
