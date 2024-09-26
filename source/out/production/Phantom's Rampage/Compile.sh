#!/bin/bash
cd ~/Games/"Phantom's Rampage" || exit
find . -name "*.class" -delete
find . -name "*.java" > sources.txt
javac @sources.txt
java -cp . Game
