package definition;

import adt.ListADT;

/**
 * This is the definition class of a contact list  (ADT). We will declare the body of the methods
 * defined in the ADT here. This class will implement (inherit) the ADT Interface defined
 * earlier.
 */
public class Person<E> implements ListADT<E> {

    @Override
    public boolean add(E item) {
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
}
