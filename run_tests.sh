#!/bin/bash

# Compile the main Java files
javac -d out/ src/main/java/com/magicalarena/*.java

# Compile the test Java files
javac -d out/ -cp src/main/java/ src/test/java/com/magicalarena/*.java

# Run the tests
java -cp out com.magicalarena.PlayerTest
java -cp out com.magicalarena.ArenaTest
java -cp out com.magicalarena.DieTest