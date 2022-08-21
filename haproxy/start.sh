#!/bin/bash

echo 'Build server'
cd ../server && ./gradlew clean build

echo 'Build client'
cd ../client && ./gradlew clean build

echo 'Start Docker compose'
cd ../haproxy && docker-compose up --build

echo 'Apps started'