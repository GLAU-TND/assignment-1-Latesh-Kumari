package adt;
/**
 * This is the ADT (Abstract Data Type) of a contact list .
 * In Java, we declare the ADT with the help of an Interface.
 */
public interface ListADT<E> {
    /**
     * This method will add the contacts in the list.
     *
     * @param item the  contact number to be added in the list.
     * @return true when the contact number adds to the list.
     */

    boolean add(E item);

    /**
     * This method will remove an contact number from the contact  list.
     *
     * @return the "contact number " from  the contact list.
     */
    E remove();

    /**
     * This method will search an contact number  in the list.
     *
     * @param item the contact number  to be searched inside the contact list.
     * @return the assumed 'index' at which the contact number  was found in the contact  list.
     */
    int search(E item);

    /*
     * Developer's Note:
     * I am not making the print method here because the definition class will simply
     * override the Object class's toString() method and define the functionality there.
     * */
}

