#!/bin/bash
echo "Dang dong goi san pham..."
./mvnw clean package
echo "Dang chay thu file .jar da dong goi..."
java -jar target/Bai9_8-1.0-SNAPSHOT.jar