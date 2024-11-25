#!/bin/bash
javac $1."java"
if [ ! -d "CompiledClasses" ];then
    mkdir CompiledClasses
fi
mv $1."class" ./CompiledClasses
java -cp CompiledClasses $1