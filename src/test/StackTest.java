package test;

import stack.StackInterfaceVector;

public class StackTest {

    public static void main(String[] args) {

        StackInterfaceVector<Integer> arrayTest = new StackInterfaceVector<>(4);

        arrayTest.push(4);
        arrayTest.push(8);
        arrayTest.push(5);
        arrayTest.push(1);
        arrayTest.push(2);
        arrayTest.push(3);

        arrayTest.pop();
        System.out.println("Está vazio: " + arrayTest.isEmpty());
        System.out.println("Último item da pilha: " + arrayTest.top());

        arrayTest.push(3);
        System.out.println("Está vazio: " + arrayTest.isEmpty());
        System.out.println("Está cheio: " + arrayTest.isFull());

        arrayTest.clear();
        System.out.println(arrayTest.top());

        System.out.println("Está vazio: " + arrayTest.isEmpty());
        System.out.println("Está cheio: " + arrayTest.isFull());
    }
}
