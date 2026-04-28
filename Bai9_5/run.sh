#!/bin/bash

# Cấp quyền thực thi cho Maven Wrapper (nếu cần)
chmod +x mvnw

echo "--- Đang chạy kiểm tra độ bao phủ mã nguồn (JaCoCo) ---"

# Chạy lệnh verify để kích hoạt jacoco:check
./mvnw clean verify
