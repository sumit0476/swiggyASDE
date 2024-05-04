Project Description
The Magical Arena is a simple simulation where two players with attributes of health, strength, and attack engage in combat until one of them reaches zero health. The project is implemented in Java and designed to demonstrate basic object-oriented programming concepts and game mechanics.

Getting Started
These instructions will guide you on how to get a copy of the project up and running on your local machine for development and testing purposes.

Prerequisites
Java Development Kit (JDK) - Java 11 or above
JUnit 5 (for running unit tests) - Ensure it is configured in your IDE or build path
Any IDE that supports Java (Optional, but recommended) such as IntelliJ IDEA, Eclipse, or VSCode

Installation
Clone or download the project to your local machine.
If using an IDE, import the project as a Java or Maven project depending on your setup.
Ensure that the JUnit library is added to the project's build path.

File Structure
Main.java - Main class with the entry point.
Player.java - Defines the player properties and methods.
GameArena.java - Handles the game logic.
PlayerTest.java - Tests for the Player class.
GameArenaTest.java - Tests for the GameArena class.

Compiling and Running the Application
Compile the code: javac src/*.java -d bin
Run the application: java -cp bin Main
Running Tests: java -cp bin:lib/* org.junit.runner.JUnitCore PlayerTest GameArenaTest

