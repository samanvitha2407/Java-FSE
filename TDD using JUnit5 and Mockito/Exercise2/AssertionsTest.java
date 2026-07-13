package Exercise2;



import org.junit.Test;

// Static imports bring in the assertion methods directly so they compile cleanly
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        System.out.println("Running JUnit Assertions Validation...");

        // Assert equals: Verifies that the expected value matches the actual value
        assertEquals(5, 2 + 3);

        // Assert true: Verifies that the condition evaluates to true
        assertTrue(5 > 3);

        // Assert false: Verifies that the condition evaluates to false
        assertFalse(5 < 3);

        // Assert null: Verifies that an object reference is null
        assertNull(null);

        // Assert not null: Verifies that an object reference is instantiated
        assertNotNull(new Object());

        System.out.println("All assertions executed and passed successfully!");
    }
}