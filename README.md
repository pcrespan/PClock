## Description

PClock is a Pomodoro clock written in Java that you can configure session durations, break durations and amount of sessions. It consumes about 66MB of RAM (Fedora 36), runs on `bash` and adjusts itself depending on the terminal window size.

The clock accepts a maximum of 1 hour per session and/or break. The reason for that is that I made the clock for myself, and my study sessions do not go beyond that duration, so adding an hour loop on a code made to accept a maximum of 1 hour would make the code less clean. Feel free to change as many things as you want and give suggestions to make it better.

## Folder Structure

The project contains two folders, where:

- `src`: the folder to maintain source code
- `bin`: the folder to maintain compiled code (`.class`)

## Usage

In the directory of the project (inside `src`), use:

``java PClock (sessionDuration) (breakDuration) (numberOfSessions)``

> You can also change the alarm sound in the Alarm.java file, on line 19 inside of `getResource()` method

## Dependencies

> Figlet 2.2.5

> bash

> OpenJDK 17.0.4.1 and above
