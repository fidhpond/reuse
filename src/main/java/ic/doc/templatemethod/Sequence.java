package ic.doc.templatemethod;

import java.util.Iterator;

/**
 * Created by vw214 on 27/10/15.
 */
public abstract class Sequence implements Iterable<Integer> {
    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }
    public abstract int term(int i);

    private class SequenceIterator implements Iterator<Integer> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return term(i++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
