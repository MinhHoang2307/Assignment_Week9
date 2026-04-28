import org.example.Calculator;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        assertEquals(5,result);
    }
    @Test
    void testOSSpecificPath() {
        // Dùng dấu gạch chéo ngược (Windows) để cố tình gây lỗi trên Linux/Mac
        String path = "target\\test-output\\result.txt";
        assertNotNull(path);
    }
}
