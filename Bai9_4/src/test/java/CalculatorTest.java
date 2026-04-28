import org.example.Calculator;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2,3);
        assertEquals(5,result);
    }
    @Test
    void testOSSpecificPathFailure() {
        // 1. Định nghĩa một đường dẫn dùng cứng dấu gạch chéo ngược (chỉ Windows dùng)
        String pathWithWindowsSeparator = "target\\test-output\\result.txt";

        // 2. Lấy ký tự phân tách thực tế của hệ điều hành đang chạy test
        String currentOSSeparator = java.io.File.separator;

        System.out.println("Hệ điều hành đang chạy dùng dấu: " + currentOSSeparator);

        // 3. KIỂM TRA: Đường dẫn phải chứa ký tự phân tách đúng của OS đó
        // Trên Windows: path chứa '\' -> TRUE (Xanh)
        // Trên Linux/Mac: path chứa '\' nhưng OS cần '/' -> FALSE
        assertTrue(pathWithWindowsSeparator.contains(currentOSSeparator),
                "Lỗi: Đường dẫn không tương thích với hệ điều hành hiện tại!");
    }
}
