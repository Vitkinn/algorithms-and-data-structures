package Tree;

public interface TreeInterface<T> {

    int qtMaxChildren();
    boolean inserirSequencial(T object);
    boolean inserirComoFilho(T object, int number);
    boolean isFull();
    boolean isEmpty();
    void clean();
    boolean verificarSePertence(T object);
    int verificarPosPai(T object);
}
