/** Created by James Buettner and Colin Bowers on Saturday, November 14, 2020 for CSC 422. */

public class Teacher extends Survivor {
    private static final int HEALTH = 50;
    private static final int ATTACK = 5;
    /**
     * No-arg constructor
     */
    public Teacher() {
        super(Survivor.TEACHER, HEALTH, ATTACK);
    }
}
