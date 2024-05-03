
# Magical Arena

This is a Java implementation of a Magical Arena game where two players fight until one's health reaches zero.

## Prerequisites

- Java Development Kit (JDK) installed on your system
- Git installed for version control (optional but recommended)

## Running the Game

1. Clone or download the repository to your local machine:

   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:

   ```
   cd MagicalArena
   ```

3. Compile the Java files:

   ```
   javac *.java
   ```

4. Run the game:

   ```
   java MagicalArena
   ```

## Gameplay

- Two players are initialized with their health, strength, and attack attributes.
- Players take turns attacking each other using a 6-sided die for random outcomes.
- Attack damage is calculated based on the player's attack attribute and the die roll.
- Defense damage is calculated based on the defender's strength attribute and the defending die roll.
- The game ends when one player's health reaches zero.
- The winner is displayed at the end of the game.

## Unit Tests

Unit tests for the game logic are provided in the `MagicalArenaTest.java` file. You can run these tests.

## Notes

- The game logic is implemented in a clear and concise manner for easy understanding and modification.
- Make sure to modify the player attributes or dice configurations in the code if needed for different scenarios.

