public class Player{
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack){
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth(){
        return health;
    }

    public int getStrength(){    
        return strength;
    }

    public int getAttack(){    
        return attack;
    }

    public void reduceHealth(int damage){
        health -= damage;
        if (health < 0){
            health = 0;
        }
    }

    public boolean isAlive(){
        return health > 0;
    }    

    public int rollDie() {
        return (int)(Math.random() * 6) + 1; //6-sided die roll
    }

    public int calculateAttackDamage(int dieroll){
        return attack * dieroll;
    }

    public int calculateDefendDamage(int dieroll){
        return strength * dieroll;
    }
}