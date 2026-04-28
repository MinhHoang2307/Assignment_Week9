package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int add(int a, int b) {
        logger.info("Dang thuc hien phep cong giua {} va {}", a, b);
        return a + b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Loi: Khong the chia cho so 0!");
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        logger.info("Ung dung Calculator voi Logging da bat dau");
        calc.add(10, 20);
        try {
            calc.divide(10, 0);
        } catch (Exception e) {
            logger.error("Co loi xay ra trong qua trinh thuc thi", e);
        }
    }
}