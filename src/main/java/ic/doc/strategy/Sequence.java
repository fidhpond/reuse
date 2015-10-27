package ic.doc.strategy;

import java.util.Iterator;

/**
 * Created by vw214 on 27/10/15.
 */
public class Sequence implements Iterable<Integer> {
    private Formatter formatter;

    public Sequence(Formatter format){
        formatter = format;
    }

    public int fTerm(int i){
        return formatter.term(i);
    }

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return fTerm(i++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
