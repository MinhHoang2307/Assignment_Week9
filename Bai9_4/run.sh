#!/bin/bash
chmod +x mvnw

./mvnw clean test
./mvnw clean package test