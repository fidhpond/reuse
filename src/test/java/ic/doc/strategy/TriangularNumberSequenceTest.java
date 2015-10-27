package ic.doc.strategy;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

/**
 * Created by vw214 on 27/10/15.
 */
public class TriangularNumberSequenceTest {
    final Sequence sequence = new Sequence(new TriangularNumberFormatter());

    @Test
    public void definesFirstTermToBeOne() {
        assertThat(sequence.fTerm(0), is(1));
    }

    @Test
    public void definesSubsequentTermsToBeTheMeanOfProductOfTheNextTwo() {

        assertThat(sequence.fTerm(1), is(3));
        assertThat(sequence.fTerm(2), is(6));
        assertThat(sequence.fTerm(3), is(10));
        assertThat(sequence.fTerm(4), is(15));
    }

    @Test
    public void isUndefinedForNegativeIndices() {

        try {
            sequence.fTerm(-1);
            fail("should have thrown exception");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), containsString("Not defined for indices < 0"));
        }
    }

    /*
    @Test
    public void canBeIteratedThrough() {

        assertThat(sequence, hasItems(1, 1, 2, 3, 5));
    }
    */
}
