/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Survivor extends Character {
    // Survivor types
    protected static final String CHILD = "Child";
    protected static final String TEACHER = "Teacher";
    protected static final String SOLDIER = "Soldier";
    // Instance variables
    private String sType;
    /**
     * Parameterized constructor
     *
     * @param sType
     * - type of the Survivor
     * @param health
     * - initial health of the Survivor
     * @param attack
     * - points taken of the opponent's health when this Survivor
     * attacks it
     */
    public Survivor(String sType, int health, int attack) {
        super(Character.SURVIVOR, health, attack);
        // Set Survivor type
        this.sType = sType;
    }
    /**
     * This method returns a string representation of this Survivor's vitals
     */
    @Override
    public String toString() {
        return sType;
    }
}