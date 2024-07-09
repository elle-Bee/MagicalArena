# Magical Arena

## Description

Magical Arena is a simple Java-based game where two players engage in combat in an arena setting. Each player is defined by their health, strength, and attack attributes. Players take turns attacking and defending until one player's health drops to zero, determining the winner.

## Game Rules

1. Each player has:
    - **Health**: Represents the player's remaining health points.
    - **Strength**: Determines the player's defense capability.
    - **Attack**: Indicates the player's offensive power.

2. Combat mechanics:
    - Players take turns attacking and defending.
    - Attack and defense effectiveness are determined by rolling a die.
    - Damage inflicted = Attack value * Die roll outcome.
    - Defense strength = Strength value * Die roll outcome.
    - A player's health is reduced by the excess damage if the attack exceeds defense.

3. Game ends when:
    - One player's health drops to zero or below.

## Project Structure

- `src/main/java/com/magicalarena/`: Contains main Java source files.
    - Arena.java
    - Die.java
    - Main.java
    - Player.java
- `src/test/java/com/magicalarena/`: Contains unit tests.
    - ArenaTest.java
    - DieTest.java
    - PlayerTest.java

## Setup Instructions

1. **Go into the repository**:
   ```bash
   cd MagicalArena
   ```
2. **Make the Scripts Executable**:
   ```bash
   chmod +x run_game.sh
   chmod +x run_tests.sh
   ```
3. **Running the scripts**:
    - To run the game:
        ```bash
        ./run_game.sh
        ```
    - To run tests:
        ```bash
        ./run_tests.sh
        ```

## Class Description

### Player
- **Attributes** : health, strength, attack
- **Methods** :
  - `getHealth()` : Returns the player's health.
  - `getStrength()` : Returns the player's strength.
  - `getAttack()` : Returns the player's attack value.
  - `takeDamage(int damage)` : Reduces the player's health by the specified damage.
  - `calculateAttackDamage(int dieRoll)` : Calculates the attack damage based on the die roll.
  - `calculateDefenseStrength(int dieRoll)` : Calculates the defense strength based on the die roll.
  - `isAlive()` : Returns whether the player is still alive.

### Die
- **Methods** : 
  - `roll()`: Simulates rolling a six-sided die and returns the result.

### Arena
- **Attributes** : player1, player2, die, round
- **Methods** :
  - `fight()` : Starts the combat between the two players until one dies.
  - `playRound(Player attacker, Player defender)` : Simulates a round of combat between the attacker and defender.

### Main
- **Methods** :
  - main(String[] args): Entry point for the game. Initializes players and starts the game.

## Test Classes

### PlayerTest
Contains unit tests for the `Player` class, testing various functionalities like taking damage and attribute retrieval.

### DieTest
Contains unit tests for the `Die` class, testing the randomness of the die rolls and that the number returned belongs to the range specified.

### ArenaTest
Contains unit tests for the `Arena` class, testing the combat logic and round execution.