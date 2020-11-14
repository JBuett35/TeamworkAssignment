/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Character {
    // Character types
    protected static final String ZOMBIE = "Zombie";
    protected static final String SURVIVOR = "Survivor";
    // Instance variables
    private String cType;
    private int health;
    private int attack;
    /**
     * Parameterized constructor
     *
     * @param cType
     * - Type of this Character (Zombie or Survivor)
     * @param health
     * - initial health of the character
     * @param attack
     * - points taken of the opponent's health when this Character
     * attacks it
     */
    public Character(String cType, int health, int attack) {
        this.cType = cType;
        this.health = health;
        this.attack = attack;
    }
    /**
     * This method updates the health of the Character c when it is attacked by
     * this Character
     *
     * @param c
     * - Character which is attacked by this Character
     */
    public void attack(Character c) {
        // Update health of c
        c.health = c.health - this.attack;
    }
    /**
     * This method returns true if this Character is dead, false otherwise
     */
    public boolean isDead() {
        return (health <= 0);
    }
}
