import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        Object obj1 = null;
        assertNull(obj1);

        // Assert not null
        Object obj2 = new Object();
        assertNotNull(obj2);
    }
}
