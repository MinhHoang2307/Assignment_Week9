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
    void testOSCompatiblePath() {
        // Dùng File.separator để tự động thích ứng với mọi hệ điều hành
        String folder = "target";
        String subFolder = "test-output";
        String fileName = "result.txt";

        // Ghép chuỗi theo cách chuẩn Java
        String compatiblePath = folder + java.io.File.separator
                + subFolder + java.io.File.separator
                + fileName;

        System.out.println("Đường dẫn chuẩn trên OS này là: " + compatiblePath);

        // KIỂM TRA: Bây giờ đường dẫn chắc chắn chứa dấu phân tách đúng của OS đó
        assertTrue(compatiblePath.contains(java.io.File.separator),
                "Đường dẫn phải tương thích với hệ điều hành!");
    }
}
