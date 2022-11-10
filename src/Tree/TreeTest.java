package Tree;

public class TreeTest {
    public static void main(String[] args) {

        TreeWithArray<Integer> myTree = new TreeWithArray<>(4, 7);

        myTree.inserirSequencial(7);
        myTree.inserirSequencial(5);
        myTree.inserirSequencial(11);
        myTree.inserirSequencial(2);
        myTree.inserirSequencial(null);
        myTree.inserirSequencial(10);
        myTree.inserirSequencial(17);
        myTree.inserirSequencial(1);
        myTree.inserirSequencial(3);
        myTree.inserirSequencial(9);
        myTree.inserirSequencial(-1);
        myTree.inserirSequencial(15);
        myTree.inserirSequencial(22);
        myTree.inserirSequencial(22);
        myTree.inserirSequencial(22);

    }
}
