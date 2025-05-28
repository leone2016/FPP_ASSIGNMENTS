package Assignment2_6;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestProg6 {

    @Test
    public void testRemoveDups() {
        String[] input = {"horse", "dog", "cat", "horse", "dog"};
        String[] expected = {"horse", "dog", "cat"};
        assertArrayEquals(expected, Prog6.removeDups(input));;
    }
}
