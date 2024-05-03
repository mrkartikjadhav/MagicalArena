
## Manual Test Cases for Magical Arena

### 1. Basic Functionality
- **Test Case 1.1:** Initialize two players with different attribute values and verify that the game functions correctly.
  - Player A: Health 50, Strength 5, Attack 10
  - Player B: Health 100, Strength 10, Attack 5
  - Expected Outcome: Player A should win the game.

### 2. Edge Cases
- **Test Case 2.1:** Test with players having minimum attribute values.
  - Player A: Health 1, Strength 1, Attack 1
  - Player B: Health 1, Strength 1, Attack 1
  - Expected Outcome: Both players should survive multiple rounds due to low damage.
- **Test Case 2.2:** Test with players having maximum attribute values.
  - Player A: Health 999, Strength 100, Attack 50
  - Player B: Health 999, Strength 100, Attack 50
  - Expected Outcome: Game should handle large values without errors or overflow.

### 3. Multiple Rounds
- **Test Case 3.1:** Play multiple rounds of the game manually.
  - Initiate the game and allow players to attack and defend for at least 5 rounds.
  - Verify that game progress and health reduction are consistent across rounds.
- **Test Case 3.2:** Test scenarios where one player wins after several rounds.
  - Initialize players with balanced attributes and play until one player's health reaches zero.
  - Ensure that the game ends correctly and displays the winner.

### 4. Boundary Cases
- **Test Case 4.1:** Test scenarios where players have equal health or attack values.
  - Player A: Health 50, Strength 10, Attack 5
  - Player B: Health 50, Strength 5, Attack 10
  - Expected Outcome: Game should handle ties or close attribute values gracefully.
- **Test Case 4.2:** Test scenarios where one player has significantly higher strength.
  - Player A: Health 100, Strength 20, Attack 5
  - Player B: Health 100, Strength 5, Attack 10
  - Expected Outcome: Player B's higher attack compensates for lower strength, affecting game outcome.

### 5. Invalid Inputs
- **Test Case 5.1:** Input negative attribute values for players.
  - Player A: Health -50, Strength -5, Attack -10
  - Player B: Health -100, Strength -10, Attack -5
  - Expected Outcome: Verify that the game handles negative values or invalid inputs gracefully.
- **Test Case 5.2:** Input zero values for attributes.
  - Player A: Health 0, Strength 0, Attack 0
  - Player B: Health 0, Strength 0, Attack 0
  - Expected Outcome: Game should handle zero values without errors.

### 6. Randomized Tests
- **Test Case 6.1:** Simulate different dice roll outcomes for attack and defense.
  - Manually roll dice for attack and defense in multiple rounds to observe varied outcomes.
  - Verify that game results are consistent and realistic across different dice rolls.

### 7. Game End Conditions
- **Test Case 7.1:** Test scenarios where both players have low health and one wins.
  - Initiate the game with players having low health (e.g., 10 health each).
  - Play until one player's health reaches zero due to damage or defense effectiveness.
- **Test Case 7.2:** Experiment with different attack and defense strategies.
  - Modify player attributes or play styles to test various strategies (e.g., aggressive attack vs. defensive strategy).
  - Verify that the game ends correctly based on health reduction and damage calculations.

