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