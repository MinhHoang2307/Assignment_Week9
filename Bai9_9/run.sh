#!/bin/bash
echo "Dang thuc thi ung dung voi Logging chuyên nghiệp..."
./mvnw clean compile exec:java -Dexec.mainClass="org.example.Calculator"
echo "----------------------------------------------------"
echo "Kiem tra file log tai: Bai9_9/logs/app.log"
cat logs/app.log