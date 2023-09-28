

import java.util.Iterator;

public class Groep<T> implements GroepInterface<T>, Iterable<T> {

    private int index = 0;
    private Object[] groep;

    public Groep(int size) {
        groep = new Object[size];
    }

    public Groep() {
        this(1);
    }

    public void add(T nieuw) {
        
        if (index == groep.length) {
            Object[] temp = new Object[2*index];

            for(int i = 0; i < index; i++) {
                temp[i] = groep[i];
            }
            groep = temp;
        }

        groep[index] = nieuw;
        index++;

    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        return (T) groep[i];
    }

    public int getIndex() {
        return index;
    }

    public int getCapaciteit() {
        return groep.length;
    }

    public boolean isLeeg() {
        return index == 0;
    }

    public void maakLeeg() {

        Object[] leeg = new Object[getCapaciteit()];
        groep = leeg;
        index = 0;

    }


    public Iterator<T> iterator() {
        return this.new GroepIterator();
    }

    private class GroepIterator implements Iterator<T> {
        int teller = 0;

        public T next() {
            return get(teller++);
        }
        public boolean hasNext() {
            return teller < index;
        }
    }
}

class VasteGrootteGroep<T> extends Groep<T> {

    public VasteGrootteGroep(int size) {
        super(size);
    }

    public void add(T nieuw) {

        if (getIndex() == getCapaciteit()) {
            throw new GroepVolException("De groep is vol");
        }

        super.add(nieuw);
    }
}

class GroepVolException extends RuntimeException {

    public GroepVolException(String message) {
        super(message);
    }
}
