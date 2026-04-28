#!/bin/bash
chmod +x mvnw
echo "[1/3] Kiem tra hieu luc cua pom.xml..."
./mvnw dependency:resolve
if [ $? -ne 0 ]; then
    echo "LOI: Khong the tai thu vien. Kiem tra lai version trong pom.xml!"
fi
echo -e "\n[2/3] Dang bien dich ma nguon..."
./mvnw compile
if [ $? -ne 0 ]; then
    echo "LOI: Bien dich that bai!"
fi
echo -e "\n[3/3] Dang chay Unit Test..."
./mvnw test
if [ $? -ne 0 ]; then
    echo "LOI: Unit Test bi fail. Kiem tra logic trong Calculator hoac Test case!"
else
    echo "SUCCESS: Moi thu da san sang de push!"
fi