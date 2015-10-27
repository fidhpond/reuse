package ic.doc.strategy;

/**
 * Created by vw214 on 27/10/15.
 */
public class TriangularNumberFormatter extends Formatter {

    @Override
    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        return ((i + 1) * (i + 2))/2;
    }
}
