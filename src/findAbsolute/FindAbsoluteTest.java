package findAbsolute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAbsoluteTest {

    @Test
    void findAbsolute() {
        int number = -1;
        int expected = 1;

        int result = FindAbsolute.findAbsolute(number);
        assertEquals(expected, result);
    }
}