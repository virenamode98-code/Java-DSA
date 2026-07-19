# Java Fundamentals

## Lesson 1: How Java Works

### Java Execution Flow

Java source code follows this process:

Source Code (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Program Output

### Important Commands

Compile:
javac Main.java

Run:
java Main

### Important Terms

- Source Code: Human-readable Java code.
- Compiler: Converts Java source code into bytecode.
- Bytecode: Code stored in .class files.
- JVM: Executes Java bytecode.



# how actually works java program 

You
│
│ write
▼
Main.java
│
│ javac
▼
Main.class
│
│ JVM
▼
Operating System
│
▼
Output

## JDK, JRE, and JVM

### JVM
Java Virtual Machine runs Java bytecode.

### JRE
JRE provides the environment required to run Java applications.

JRE = JVM + Runtime Libraries

### JDK
JDK provides tools required to develop Java applications.

JDK = JRE + Development Tools

Example:
javac = Java Compiler