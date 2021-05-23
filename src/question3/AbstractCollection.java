package question3;

import java.util.Iterator;

public abstract class AbstractCollection<E> implements Collection<E> {
    @Override
    public int size() {
        int count = 0;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    @Override
    public boolean retirer(E e) {
        boolean changed = false;
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals(e)) {
                iterator.remove();
                changed = true;
            }
        }
        return changed;
    }

    @Override
    public boolean add(Collection<E> e) {
        boolean changed = false;
        Iterator<E> iterator = e.iterator();
        while(iterator.hasNext()) {
            changed = add(iterator.next());
        }
        return changed;
    }

    @Override
    public abstract boolean add(E e); // can't change that here

    @Override
    public abstract Iterator<E> iterator(); // can't change that here
}
