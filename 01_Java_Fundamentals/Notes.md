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


# Lesson 02 — Variables and Data Types

## What is a variable?

A variable is a named memory location used to store data.

Example:

int age = 21;

Here:

- int → data type
- age → variable name
- 21 → value
- = → assignment operator

## Primitive Data Types

Java has 8 primitive data types:

| Type | Example |
|---|---|
| byte | byte age = 21; |
| short | short year = 2026; |
| int | int marks = 85; |
| long | long population = 1000000L; |
| float | float price = 10.5f; |
| double | double pi = 3.14159; |
| char | char grade = 'A'; |
| boolean | boolean isJavaFun = true; |

## Most commonly used in DSA

int
long
double
char
boolean


## Lesson 2: Variables and Data Types

### Variable

A variable is a named location used to store a value.

Example:

int age = 21;

- int = data type
- age = variable name
- = = assignment operator
- 21 = value

### Common Data Types

int     → whole numbers
double  → decimal numbers
char    → single character
boolean → true or false
String  → text

### Example

int age = 21;
double cgpa = 8.5;
char grade = 'A';
boolean learningDSA = true;
String name = "Virendra";