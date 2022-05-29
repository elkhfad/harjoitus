package harjoitus2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumeroHarjoitusTest {

    @Test
    public void testValue() {

        NumeroHarjoitus numeroHarjoitus = new NumeroHarjoitus();
        List<Integer> list = Arrays.asList(1, 4, 10);
        List<Range> actual = numeroHarjoitus.hashMapValue(list);
        assertEquals(1, actual.size());

        Range range = new Range(2, 1, 4);
        assertEquals(range, actual.get(0));

    }

    @Test
    public void testMultipleValue() {
        NumeroHarjoitus numeroHarjoitus = new NumeroHarjoitus();
        List<Integer> list = Arrays.asList(1, 4, 10, 13);
        List<Range> actual = numeroHarjoitus.hashMapValue(list);
        assertEquals(2, actual.size());

        Range range = new Range(2, 1, 4);
        assertEquals(range, actual.get(0));

        Range cdRange = new Range(2, 10, 13);
        assertEquals(cdRange, actual.get(1));

    }

    @Test
    public void sameNumbersMultipleValue() {
        NumeroHarjoitus numeroHarjoitus = new NumeroHarjoitus();
        List<Integer> list = Arrays.asList(10, 10, 10, 10);
        List<Range> actual = numeroHarjoitus.hashMapValue(list);
        assertEquals(0, actual.size());
    }

    @Test
    public void sameNumbersMultipleValue2() {
        NumeroHarjoitus numeroHarjoitus = new NumeroHarjoitus();
        List<Integer> list = Arrays.asList(1, 10, 10, 15);
        List<Range> actual = numeroHarjoitus.hashMapValue(list);
        assertEquals(1, actual.size());

        Range range = new Range(4, 10, 15);
        assertEquals(range, actual.get(0));
    }

}
