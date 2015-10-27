package ic.doc.templatemethod;

import java.util.Iterator;

/**
 * Created by vw214 on 27/10/15.
 */
public class TriangularNumberSequence extends Sequence {
    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        return ((i + 1) * (i + 2))/2;
    }

}
