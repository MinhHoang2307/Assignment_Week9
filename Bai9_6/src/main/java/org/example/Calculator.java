package org.example;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) { return a / b; }
    // Lần đầu mất tổng 39s
    // Lần hai mất tổng 17s
    // Bằng chứng Cache hoạt động: Mở log bước Set up JDK 17 ở lần push thứ 2, thấy ghi "Cache restored successfully. Cache restored from key: setup-java-Linux-x64-maven-585d8a254385c6d6069936bfca9d5c4641269d23738ab28201c0aad26316b982".
}
