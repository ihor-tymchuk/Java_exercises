@echo off
title 1.Hello friend
md \out2
set /p Name=Enter your Class Name?:
javac -d out2 .\src\com\blinov\itymchuk\one\HelloFriend.java
java -cp out2\ com.blinov.itymchuk.one.HelloFriend %Name%
pause