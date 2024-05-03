public class MagicalArena {
    private Player PlayerA;
    private Player PlayerB;

    public MagicalArena(Player PlayerA, Player PlayerB) {
        this.PlayerA = PlayerA;
        this.PlayerB = PlayerB;
    }

    public void fight() {
        Player attacker = PlayerA.getHealth() < PlayerB.getHealth() ? PlayerA : PlayerB;
        Player defender = attacker == PlayerA ? PlayerB : PlayerA;

        while (attacker.isAlive() && defender.isAlive()) {
            int attackRoll = attacker.rollDie();
            int defendRoll = defender.rollDie();

            int attackDamage = attacker.calculateAttackDamage(attackRoll);

            int defendDamage = defender.calculateDefendDamage(defendRoll);

            int damageDealt = Math.max(0, attackDamage - defendDamage);

            defender.reduceHealth(damageDealt);

            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        String winner = PlayerA.isAlive() ? "Player A" : "Player B";
        System.out.println("The winner is " + winner+"!");
    }
}
