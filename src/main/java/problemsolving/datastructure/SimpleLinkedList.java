package problemsolving.datastructure;

/**
 * Created by sungyeon on 2018. 10. 26..
 */
public class SimpleLinkedList<E> {
    private static class Element<E> {
        E value;
        Element<E> next;
    }
    private Element<E> head;

}
