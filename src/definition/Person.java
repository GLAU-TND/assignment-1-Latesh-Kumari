package definition;

import adt.ListADT;

/**
 * This is the definition class of a contact list  (ADT). We will declare the body of the methods
 * defined in the ADT here. This class will implement (inherit) the ADT Interface defined
 * earlier.
 */
public class Person<E> implements ListADT<E> {
    private Node first;
    private Node last;

    public Person() {
        first = last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean add(E item) {
        Node temp = new Node();

        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    private class Node<E> {


    }
}
