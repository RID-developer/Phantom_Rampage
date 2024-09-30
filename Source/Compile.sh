#!/bin/bash
find . -name "*.class" -delete
find . -name "*.java" > sources.txt
javac @sources.txt
