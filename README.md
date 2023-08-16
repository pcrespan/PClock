Written by Pedro Crespan, licensed under GNU GPL v2

Alarm: soundbible.com

## Description

PClock is a Pomodoro clock written in Java that you can configure session durations, break durations and amount of sessions. It consumes about 66MB of RAM (Fedora 36), runs on `bash` and adjusts itself depending on the terminal window size. 

The clock accepts a maximum of 1 hour per session and/or break. The reason for that is that I made the clock for myself, and my study sessions do not go beyond that duration, so adding an hour loop on a code made to accept a maximum of 1 hour would make the code less clean. Feel free to change as many things as you want and give suggestions to make it better.

## Pre-usage

Compile all the `.java` files:

```
javac (directory)/(file).java
```
to compile one at a time or

```
javac (directory)/*.java
```

to compile every `.java` file on that directory.

## Usage

Inside the directory of the project (`src`), use:

```
java PClock (sessionDuration) (breakDuration) (numberOfSessions)
```

## Dependencies

>- Figlet 2.2.5

>- bash

>- OpenJDK 17 JRE (not headless)

>- OpenJDK 17 JDK (not headless)


