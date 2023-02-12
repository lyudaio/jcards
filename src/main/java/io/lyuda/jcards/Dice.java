package io.lyuda.jcards;

import java.security.SecureRandom;

/**
 * The {@code Dice} class represents a dice with an arbitrary amount of sides, defined in the constructor.
 * This class contains methods to access the number of sides, as well as rolling the dice to generate a random number.
 *
 * @author KonnosBaz
*/
public class Dice {

    /**
     * The amount of sides on the dice.
     */
    private int sides;

    /**
     * Constructs a new {@code Dice} with a specified number of sides.
     * 
     * @throws IllegalArgumentException if sides are non-possitive.
     * @param sides the number of sides.
     */
    public Dice(int sides)
    {
        if (sides <= 0) {
            throw new IllegalArgumentException("Sides can only be positive");
        }
        this.sides = sides;
    }

    /**
     * Returns the number of sides on the dice.
     * 
     * @return the number of sides on the dice.
     */
    public int getSides() {
        return sides;
    }

    /**
     * Returns a random number between 1 and the number of {@code sides} on the dice,
     * using a cryptographically secure random number generator.
     * 
     * @return random number between 1 and the number of {@code sides} on the dice.
     */
    public int roll() {
        SecureRandom secureRandom = new SecureRandom();
        return 1 + secureRandom.nextInt(sides);
    }
    
}