package Tree;

public class TreeWithArray <T> implements TreeInterface <T>{

    private int G;
    private int h, counter;
    private T[] array;

    public TreeWithArray(int G, int h) {
        this.G = G;
        this.h = h;
        this.array = (T[]) new Object[qtMaxChildren()];
        this.counter = 0;
    }

    @Override
    public int qtMaxChildren() {
        int quantity = 0;
        for (int i = 0; i <= h; i++) {
            quantity += (G^i);
        }
        return quantity;

    }

    @Override
    public boolean inserirSequencial(T object) {
        if(!isFull()) {
            for (int i = 0; i < array.length; i++) {
                if(array[i] != null) {
                    array[i] = object;
                    counter++;
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean inserirComoFilho(T object, int number) {
        return false;
    }

    @Override
    public boolean isFull() {
        return counter == qtMaxChildren();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clean() {

    }

    @Override
    public boolean verificarSePertence(T object) {
        return false;
    }

    @Override
    public int verificarPosPai(T object) {
        return 0;
    }

    public String toString() {
        /*String s = "";
        for (int i = 0; i < h+1; i++) {
            for (int elem=i; elem < (G^i); elem++) {
                s = array[elem] + "\t";
            }
            s += "\n";
        }
        return s;*/
        return "";
    }


}
