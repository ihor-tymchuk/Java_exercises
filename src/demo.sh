#!/bin/bash
project_dir="/$HOME/one/Demo1"
cd $project_dir
echo "Compiling Test project.."
if [ javac -cp . Demo1.java ] ;
then
   echo "Compilation successful! Running project Test"
   java Demo1
else
   echo "Compilation failed. Cannot run Test project"
fi