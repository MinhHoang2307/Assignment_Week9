import org.example.MathUtils;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtilsTest {
    private static final Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);
    @BeforeAll
    static void setUpAll() {
        logger.info("=== Bắt đầu chạy MathUtilsTest ===");
    }
    @AfterAll
    static void tearDownAll() {
        logger.info("=== Kết thúc ===");
    }
    @Test
    @DisplayName("Kiểm tra hàm max")
    void testMax() {
        assertAll(
                () -> assertEquals(10, MathUtils.max(10, 5), "Trường hợp a > b"),
                () -> assertEquals(8, MathUtils.max(3, 8), "Trường hợp a < b"),
                () -> assertEquals(7, MathUtils.max(7, 7), "Trường hợp a = b"),
                () -> assertEquals(0, MathUtils.max(Integer.MIN_VALUE, 0), "Biên MIN"),
                () -> assertEquals(Integer.MAX_VALUE, MathUtils.max(0, Integer.MAX_VALUE), "Biên MAX")
        );
    }
    @Test
    @DisplayName("Kiểm tra hàm divide")
    void testDivide() {
        assertAll(
                () -> assertEquals(5, MathUtils.divide(10, 2)),
                () -> assertEquals(-5, MathUtils.divide(10, -2)),
                () -> assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(5, 0))
        );
    }
}