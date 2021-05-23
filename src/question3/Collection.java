package question3;

public interface Collection<E> extends Iterable<E> {
    boolean add(E e);
    boolean add(Collection<E> e);
    int size();
    boolean retirer(E e);
}
