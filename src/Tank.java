/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Tank extends Zombie {
    private static final int HEALTH = 150;
    private static final int ATTACK = 20;
    /**
     * No-arg constructor
     */
    public Tank() {
        super(Zombie.TANK, HEALTH, ATTACK);
    }
}