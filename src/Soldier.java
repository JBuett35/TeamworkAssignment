/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Soldier extends Survivor {
    private static final int HEALTH = 100;
    private static final int ATTACK = 10;
    /**
     * No-arg constructor
     */
    public Soldier() {
        super(Survivor.SOLDIER, HEALTH, ATTACK);
    }
}