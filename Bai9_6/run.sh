#!/bin/bash
chmod +x mvnw
start_time=$(date +%s)
./mvnw clean package -DskipTests
end_time=$(date +%s)
duration=$((end_time - start_time))