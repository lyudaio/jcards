package io.lyuda.jcards;

import java.security.SecureRandom;

/**
 * The {@code Dice} class represents a dice with an arbitrary amount of sides, defined in the constructor (six by default).
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
     * A cryptographically secure random number generator used for rolling the dice.
     * Innitialized in the constructor.
     */
    private SecureRandom secureRandom;
    /**
     * A variable that holds the last result of the roll() method.
     */
    private int lastRoll;
    
    /**
     * Default constructor that Constructs a new {@code Dice} with six sides.
     */
    public Dice()
    {
        sides = 6;
        secureRandom = new SecureRandom();
    }

    /**
     * Constructs a new {@code Dice} with a specified number of sides.
     * 
     * @throws IllegalArgumentException if sides are non-possitive.
     * @param sides the number of sides.
     */
    public Dice(int sides)
    {
        if (sides <= 0) 
        {
            throw new IllegalArgumentException("Sides can only be positive");
        }
        this.sides = sides;
        secureRandom = new SecureRandom();
    }

    /**
     * Returns the number of sides on the dice.
     * 
     * @return the number of sides on the dice.
     */
    public int getSides() 
    {
        return sides;
    }

    /**
     * Returns a random number between 1 and the number of {@code sides} on the dice,
     * using a cryptographically secure random number generator.
     * The result of the roll is asigned to the lastRoll field before the method returns.
     * 
     * @return random number between 1 and the number of {@code sides} on the dice.
     */
    public int roll() 
    {
        lastRoll = 1 + secureRandom.nextInt(sides);
        return lastRoll;
    }
    
    /**
     * Returns the result of the last dice roll.
     * @return the result of the last dice roll.
     * @throws IllegalStateException if the dice has not been rolled yet.
     */
    public int getLastRoll() 
    {
        if (lastRoll == 0)
        {
            throw new IllegalStateException("This dice has not yet been  rolled");
        }
        return lastRoll;
    }
    
}