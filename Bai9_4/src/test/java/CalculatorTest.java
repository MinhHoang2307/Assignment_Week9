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
    void testOSSpecificPathFailure() throws java.io.IOException {
        // Dấu \ chỉ có tác dụng phân tách thư mục trên Windows.
        // Trên Linux/Mac, nó sẽ coi nguyên cụm "target\test-output\result.txt" là 1 tên file duy nhất.
        String path = "target\\test-output\\result.txt";

        java.io.File file = new java.io.File(path);

        // Tạo thư mục cha nếu chưa có
        file.getParentFile().mkdirs();

        // Hành động này sẽ tạo ra sự khác biệt:
        boolean created = file.createNewFile();

        // Kiểm tra xem file có thực sự tồn tại ở đúng cấu trúc thư mục không
        // Trên Linux/Mac, nếu không dùng đúng dấu /, việc quản lý file sẽ bị sai lệch
        assertTrue(file.exists(), "File should exist at the specified path");

        // Cách gây lỗi mạnh hơn: Kiểm tra tính tuyệt đối của đường dẫn
        // Trên Linux, đường dẫn chứa \ sẽ không được coi là đường dẫn chuẩn (normalized)
        assertTrue(path.contains(java.io.File.separator), "Path should use the OS-specific separator");
    }
}
