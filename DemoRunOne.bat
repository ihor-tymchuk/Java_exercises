@echo off
title Demo run one block exercises
rd \out2
md \out2

javac -d out2 .\src\com\blinov\itymchuk\one\HelloFriend.java
javac -d out2 .\src\com\blinov\itymchuk\one\ReverseOrder.java
javac -d out2 .\src\com\blinov\itymchuk\one\RandomNumber.java
javac -d out2 .\src\com\blinov\itymchuk\one\CheckPassword.java
javac -d out2 .\src\com\blinov\itymchuk\one\Ariphmetics.java
javac -d out2 .\src\com\blinov\itymchuk\one\Info.java

set /p Name=Enter your name:
java -cp out2\ com.blinov.itymchuk.one.HelloFriend %Name%

set /p Arg=Enter your arguments:
java -cp out2\ com.blinov.itymchuk.one.ReverseOrder %Arg%

java -cp out2\ com.blinov.itymchuk.one.RandomNumber

set /p Pass=Input password:
java -cp out2\ com.blinov.itymchuk.one.CheckPassword %Pass%

set /p Numbers=Input numbers:
java -cp out2\ com.blinov.itymchuk.one.Ariphmetics %Numbers%

java -cp out2\ com.blinov.itymchuk.one.Info
pause
