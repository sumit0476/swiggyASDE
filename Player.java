public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Player opponent) {
        int attackRoll = (int) (Math.random() * 6) + 1; // Rolls a 6-sided die
        int attackDamage = this.attack * attackRoll;
        opponent.defend(attackDamage);
    }

    public void defend(int attackDamage) {
        int defenseRoll = (int) (Math.random() * 6) + 1; // Rolls a 6-sided die
        int defense = this.strength * defenseRoll;
        int damageTaken = Math.max(0, attackDamage - defense);
        this.health -= damageTaken;
    }
}
