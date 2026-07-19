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


# Java Program Structure

public class ClassName {

    public static void main(String[] args) {

        // Program execution starts here

    }
}


# public -
public is an access modifier.

It means:

This thing can be accessed from anywhere where it is allowed.

# static --
static means the member belongs to the class itself rather than to a particular object.

# void -- 

void means this method does not return a value .

means this method performing an action but returns nothing.

# main -- 

this is special method where java execution begins  

# string[] args 

string[] args allows java programs to receive arguments from the command line.


basic flow of program -- 

public
↓
Accessible to JVM

static
↓
Can run without creating an object

void
↓
Returns nothing

main
↓
Starting point of program

String[] args
↓
Receives command-line arguments




conceptually :

JVM
 │
 └── calls
      ↓
 public static void main(String[] args)
      ↓
 program execution begins



 ## Scanner Input

Scanner is used to take input from the user.

import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

String text = scanner.nextLine();
int number = scanner.nextInt();
double decimal = scanner.nextDouble();

scanner.close();