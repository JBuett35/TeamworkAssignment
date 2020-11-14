/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Zombie extends Character {
    // Zombie types
    protected static final String COMMON_INFECTED = "CommonInfected";
    protected static final String TANK = "Tank";
    // Instance variables
    private String zType;
    /**
     * Parameterized constructor
     *
     * @param zType
     * - type of the Zombie
     * @param health
     * - initial health of the Zombie
     * @param attack
     * - points taken of the opponent's health when this Zombie
     * attacks it
     */
    public Zombie(String zType, int health, int attack) {
        super(Character.ZOMBIE, health, attack);
        // Set zombie type
        this.zType = zType;
    }
    /**
     * This method returns a string representation of this Zombie's vitals
     */
    @Override
    public String toString() {
        return zType;
    }
}