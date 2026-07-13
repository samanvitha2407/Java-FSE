package Exercise3;



import Exercise1.Calculator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FixtureTest {


    private Calculator calculator;


    @Before
    public void setUp() {
        System.out.println("[SETUP]: Initializing a fresh Calculator instance...");
        calculator = new Calculator();
    }


    @After
    public void tearDown() {
        System.out.println("[TEARDOWN]: Cleaning up test resources...");
        calculator = null;
    }


    @Test
    public void testAdditionWithAAA() {
        System.out.println("[TEST]: Executing testAdditionWithAAA");


        int inputA = 20;
        int inputB = 30;
        int expectedResult = 50;


        int actualResult = calculator.add(inputA, inputB);


        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtractionWithAAA() {
        System.out.println("[TEST]: Executing testSubtractionWithAAA");

        // STEP A: Arrange
        int inputA = 50;
        int inputB = 20;
        int expectedResult = 30;

        // STEP B: Act
        int actualResult = calculator.subtract(inputA, inputB);

        // STEP C: Assert
        assertEquals(expectedResult, actualResult);
    }
}
