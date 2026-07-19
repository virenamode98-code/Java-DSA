# Java Fundamentals

# Lesson 1 — How Java Works

## Java Execution Flow

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

## Important Commands

Compile:

javac Main.java

Run:

java Main

## Important Terms

- Source Code: Human-readable Java code.
- Compiler: Converts Java source code into bytecode.
- Bytecode: Code stored in .class files.
- JVM: Executes Java bytecode.

---

# How Java Program Actually Works

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

---

# JDK, JRE, and JVM

## JVM

Java Virtual Machine runs Java bytecode.

## JRE

JRE provides the environment required to run Java applications.

JRE = JVM + Runtime Libraries

## JDK

JDK provides tools required to develop Java applications.

JDK = JRE + Development Tools

Example:

javac = Java Compiler

---

# Lesson 2 — Variables and Data Types

## What is a Variable?

A variable is a named memory location used to store data.

Example:

int age = 21;

Here:

- int → data type
- age → variable name
- 21 → value
- = → assignment operator

---

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

---

## Most Commonly Used in DSA

- int
- long
- double
- char
- boolean

---

## Common Data Types

int     → whole numbers
double  → decimal numbers
char    → single character
boolean → true or false
String  → text

Example:

int age = 21;
double cgpa = 8.5;
char grade = 'A';
boolean learningDSA = true;
String name = "Virendra";

---

# Java Program Structure

public class ClassName {

    public static void main(String[] args) {

        // Program execution starts here

    }
}

---

## public

public is an access modifier.

It means:

This thing can be accessed from anywhere where it is allowed.

---

## static

static means the member belongs to the class itself rather than to a particular object.

The JVM can call the main method without creating an object of the class.

---

## void

void means this method does not return a value.

The method performs an action but returns nothing.

---

## main

main is the special method where Java program execution begins.

---

## String[] args

String[] args allows Java programs to receive arguments from the command line.

---

## Basic Flow of Program

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

---

## Conceptual Flow

JVM
 │
 └── calls
      ↓
public static void main(String[] args)
      ↓
Program execution begins

---

# Lesson 3 — User Input

## Scanner Input

Scanner is used to take input from the user.

Import Scanner:

import java.util.Scanner;

Create Scanner object:

Scanner scanner = new Scanner(System.in);

Read String:

String text = scanner.nextLine();

Read Integer:

int number = scanner.nextInt();

Read Decimal:

double decimal = scanner.nextDouble();

Close Scanner:

scanner.close();

---

## Example

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}

---

# Lesson 4 — Operators in Java

Operators are symbols used to perform operations on values and variables.

Example:

int a = 10;
int b = 3;

int result = a + b;

Here:

- a and b → operands
- + → operator
- a + b → expression

---

# 1. Arithmetic Operators

Arithmetic operators are used for mathematical calculations.

| Operator | Meaning | Example | Result |
|---|---|---|---|
| + | Addition | 10 + 3 | 13 |
| - | Subtraction | 10 - 3 | 7 |
| * | Multiplication | 10 * 3 | 30 |
| / | Division | 10 / 3 | 3 |
| % | Modulus/Remainder | 10 % 3 | 1 |

---

## Integer Division

int result = 10 / 3;

Output:

3

Because both numbers are integers.

For decimal division:

double result = 10.0 / 3;

Output:

3.3333333333333335

---

## Modulus Operator %

The modulus operator returns the remainder.

Example:

int remainder = 10 % 3;

Result:

1

The modulus operator is very important in DSA.

It is used for:

- Checking even/odd numbers
- Extracting digits
- Circular problems
- Hash calculations

Example:

int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

---

# 2. Assignment Operators

Assignment operators are used to assign or update values.

## Basic Assignment

int x = 10;

The = operator assigns the value on the right to the variable on the left.

---

## Compound Assignment Operators

x += 5;

Equivalent to:

x = x + 5;

| Operator | Equivalent To |
|---|---|
| = | x = value |
| += | x = x + value |
| -= | x = x - value |
| *= | x = x * value |
| /= | x = x / value |
| %= | x = x % value |

Example:

int x = 10;

x += 5;  // 15
x -= 3;  // 12
x *= 2;  // 24
x /= 4;  // 6
x %= 4;  // 2

---

# 3. Relational / Comparison Operators

These operators compare two values.

The result is always:

true

or:

false

| Operator | Meaning |
|---|---|
| == | Equal to |
| != | Not equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or equal to |
| <= | Less than or equal to |

Example:

int a = 10;
int b = 20;

System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a < b);   // true
System.out.println(a > b);   // false

---

## Important: = vs ==

x = 10;

Means:

Assign 10 to x.

---

x == 10;

Means:

Check whether x is equal to 10.

This is one of the most common beginner mistakes.

---

# 4. Logical Operators

Logical operators combine multiple conditions.

---

## AND &&

Returns true only when both conditions are true.

int age = 21;

System.out.println(age >= 18 && age <= 60);

Both conditions are true, so the result is:

true

Truth Table:

| A | B | A && B |
|---|---|---|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

---

## OR ||

Returns true if at least one condition is true.

boolean hasEmail = true;
boolean hasPhone = false;

System.out.println(hasEmail || hasPhone);

Output:

true

Truth Table:

| A | B | A || B |
|---|---|---|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

---

## NOT !

Reverses a boolean value.

boolean isJavaFun = true;

System.out.println(!isJavaFun);

Output:

false

---

# 5. Unary Operators

Unary operators work on only one operand.

---

## Increment ++

Increases a value by 1.

int x = 5;

x++;

Now:

x = 6

Equivalent to:

x = x + 1;

---

## Decrement --

Decreases a value by 1.

int x = 5;

x--;

Now:

x = 4

---

## Postfix

int x = 5;
int y = x++;

Execution:

y = 5
x = 6

First use the value, then increment.

---

## Prefix

int x = 5;
int y = ++x;

Execution:

x = 6
y = 6

First increment, then use the value.

---

## DSA Example

int i = 0;

while (i < 5) {
    System.out.println(i);
    i++;
}

The ++ and -- operators are used constantly in:

- Loops
- Arrays
- Two Pointers
- Sliding Window
- Recursion
- Tree Traversal

---

# 6. Ternary Operator

The ternary operator is a short form of if-else.

Syntax:

condition ? valueIfTrue : valueIfFalse;

Example:

int age = 21;

String result = age >= 18 ? "Adult" : "Minor";

System.out.println(result);

Output:

Adult

Equivalent to:

String result;

if (age >= 18) {
    result = "Adult";
} else {
    result = "Minor";
}

---

## DSA Example

int a = 10;
int b = 20;

int max = a > b ? a : b;

---

# 7. Bitwise Operators

Bitwise operators work at the binary/bit level.

| Operator | Meaning |
|---|---|
| & | Bitwise AND |
| | | Bitwise OR |
| ^ | Bitwise XOR |
| ~ | Bitwise NOT |
| << | Left Shift |
| >> | Right Shift |
| >>> | Unsigned Right Shift |

Example:

int a = 5;  // 101
int b = 3;  // 011

System.out.println(a & b);

Binary operation:

101
011
---
001

Result:

1

---

## Bitwise Operators in DSA

Bitwise operators are used in:

- Bit Manipulation
- XOR Problems
- Finding Unique Numbers
- Power of Two Problems
- Bit Masks
- Optimization Problems

Example:

int number = 5;

if ((number & 1) == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}

---

# 8. instanceof Operator

instanceof checks whether an object belongs to a particular class or type.

Example:

String name = "Virendra";

System.out.println(name instanceof String);

Output:

true

This will be studied in more detail during OOP.

---

# Operator Precedence

When multiple operators are used, Java follows a priority order.

Example:

int result = 10 + 5 * 2;

Result:

20

Multiplication happens before addition.

---

## Basic Priority

()
↓
Unary Operators
++ --
↓
* / %
↓
+ -
↓
< > <= >=
↓
== !=
↓
&&
↓
||
↓
?:
↓
= += -= *= /=

---

## Parentheses

Use parentheses to make expressions clear.

Example:

int result = (10 + 5) * 2;

Output:

30

---

# Important DSA Connection

Operators are constantly used in DSA.

## Arrays

index++;

## Loops

i < n

## Even/Odd

number % 2 == 0

## Two Pointers

left++;
right--;

## Conditions

if (x >= 0 && x < n)

## Bit Manipulation

a ^ b

## Maximum/Minimum

int max = a > b ? a : b;

---

# Lesson 4 Summary

Java operators can be grouped into:

1. Arithmetic → + - * / %
2. Assignment → = += -= *= /= %=
3. Relational → == != > < >= <=
4. Logical → && || !
5. Unary → ++ --
6. Ternary → ? :
7. Bitwise → & | ^ ~ << >> >>>
8. Type Checking → instanceof

---

# Most Important Operators for DSA

%

++

--

==

!=

<

>

<=

>=

&&

||

!

^
