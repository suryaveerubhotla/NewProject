import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void add_shouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    void subtract_shouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 3);
        assertEquals(4, result);
    }

    @Test
    void multiply_shouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 6);
        assertEquals(30, result);
    }

    @Test
    void divide_shouldReturnCorrectResult() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(15, 3);
        assertEquals(5, result);
    }

    @Test
    void divide_byZero_shouldThrowException() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
