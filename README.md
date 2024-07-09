# Magical Arena

## Description
1. Magical Arena is a simple Java-based game where two players engage in combat in a magical arena. 
2. Each player is characterized by three attributes: health, strength, and attack. 
3. Players take turns attacking and defending until one player's health reaches zero. The player with the remaining health is declared the winner.

## Game Rules

1. Each player has the following attributes:
    - **Health**: Positive integer representing the player's health.
    - **Strength**: Positive integer representing the player's defensive capability.
    - **Attack**: Positive integer representing the player's attacking power.

2. Players attack and defend in turns:
    - Both the attacking and defending players roll a die.
    - The attack damage is calculated as `attack value * outcome of the die roll of attacker`.
    - The defense strength is calculated as `strength value * outcome of the die roll of defender`.
    - The defender's health is reduced by the excess damage if attack damage exceeds defense strength.

3. The game ends when a player's health reaches zero.gradle test

## Project Structure

- `src/main/java/com/magicalarena/`: has the main Java source files and contains.
  - Arena.java
  - Die.java
  - Main.java
  - Player.java
- `src/test/java/com/magicalarena/`: contains the following unit tests :
  - ArenaTest.java
  - DieTest.java
  - PlayerTest.java


## Setup Instructions

1. **Go into the repository**:
   ```bash
   cd magical-arena
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