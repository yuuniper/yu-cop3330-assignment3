# COP3330 Assignment 3: Programming Exercises 41-46

A set of small command-line Java programs written for **COP3330 (Object-Oriented Programming), Summer 2021, at UCF**. This is archived coursework, kept for reference and not maintained.

## What it is

Six standalone exercises (numbered 41 through 46). Each is a console program that reads or writes files under `resources/`:

| Exercise | Topic |
| --- | --- |
| 41 | Read a list of names from a file, sort them, and write the result |
| 42 | Parse comma-separated records and write them out as a formatted table |
| 43 | Generate a basic website folder skeleton (`index.html`, optional JS and CSS folders) |
| 44 | Search a JSON product list by name |
| 45 | Read a text file, replace the word "utilize" with "use", and write the result |
| 46 | Count word frequencies in a file and print a star histogram |

Each exercise lives in its own package, `oop.assignment3.exNN.base`, with a `SolutionNN` class holding `main`, helper classes, a PlantUML design sketch (`.puml`), and JUnit tests under `src/test`. Sample input and output files are in `resources/input` and `resources/output`.

## Tools

- Java 16 or newer (the POM targets 16; tested compiling on JDK 21)
- Maven
- JUnit 4 and JUnit 5 (jupiter-params), Hamcrest
- Gson (JSON parsing for exercise 44)

## Known limitation: Windows only

The programs build file paths with hard-coded Windows separators (for example `"\\resources\\input\\exercise41_input.txt"`). On Linux and macOS the files are not found, so the programs print empty results and **12 of the 22 tests fail**. The code compiles on any platform. This was left as-is to preserve the original coursework; the fix would be to build paths with `java.nio.file.Path` or `File.separator`, and the tests that assert on path strings would need to change too.

## Build

```bash
mvn package -DskipTests
```

## Test and run (Windows)

Run everything from the project root, because input and output paths are resolved relative to the working directory.

```bash
mvn test
mvn -q compile
java -cp target/classes oop.assignment3.ex41.base.Solution41
```

Exercise 44 also needs Gson on the classpath:

```bash
java -cp "target/classes;%USERPROFILE%\.m2\repository\com\google\code\gson\gson\2.8.7\gson-2.8.7.jar" oop.assignment3.ex44.base.Solution44
```
