/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Child extends Survivor {
    private static final int HEALTH = 20;
    private static final int ATTACK = 2;
    /**
     * No-arg constructor
     */
    public Child() {
        super(Survivor.CHILD, HEALTH, ATTACK);
    }
}