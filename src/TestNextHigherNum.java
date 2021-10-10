import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestNextHigherNum {

    @Test
    public void whenValidInput_ThenDisplayHigherNumber3Digits() {
        int[] result = NextHigherNum.findNext(new int[] {2,1,3});
        int[] expected = new int[] {2,3,1};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAlreadyHighestInput_ThenReturnNull() {
        int[] result = NextHigherNum.findNext(new int[] {7,6,4});
        assertArrayEquals(null, result);
    }

    @Test
    public void whenAllSameInput_ThenReturnNull() {
        int[] result = NextHigherNum.findNext(new int[] {7,7,7});
        assertArrayEquals(null, result);
    }

    @Test
    public void whenValidInput_ThenDisplayHigherNumber2Digits() {
        int[] result = NextHigherNum.findNext(new int[] {6,7});
        int[] expected = new int[] {7,6};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAlreadyHighestInput_ThenReturnNull2Digit() {
        int[] result = NextHigherNum.findNext(new int[] {9,5});
        assertArrayEquals(null, result);
    }

    @Test
    public void whenValidInput_ThenDisplayHigherNumber5Digits() {
        int[] result = NextHigherNum.findNext(new int[] {3,1,3,4,5});
        int[] expected = new int[] {3,1,3,5,4};
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenAlreadyHighestInput_ThenReturnNull5Digit() {
        int[] result = NextHigherNum.findNext(new int[] {9,9,9,9,9});
        assertArrayEquals(null, result);
    }

}