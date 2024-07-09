#!/bin/bash

# Compile the main Java files
javac -d out/ src/main/java/com/magicalarena/*.java

# Run the main program
java -cp out com.magicalarena.Main