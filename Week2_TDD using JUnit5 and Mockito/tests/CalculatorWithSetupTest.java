import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorWithSetupTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        // Setup phase: runs before each test
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance...");
    }

    @AfterEach
    void tearDown() {
        // Teardown phase: runs after each test
        calculator = null;
        System.out.println("Tearing down Calculator instance...");
    }

    @Test
    void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
}
