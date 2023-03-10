package io.lyuda.jcards;

import java.security.SecureRandom;

/**
 * The {@code Dice} class represents a dice with an arbitrary amount of sides, defined in the constructor (six by default).
 * This class contains methods to access the number of sides, as well as rolling the dice to generate a random number.
 *
 * @author KonnosBaz, lyudaio
 * @see java.security.SecureRandom
 * @since 0.0.6
 */
public class Dice {

    /**
     * The amount of sides on the dice.
     */
    private final int sides;
    /**
     * A cryptographically secure random number generator used for rolling the dice.
     * Initialized in the constructor.
     */
    private final SecureRandom secureRandom;
    /**
     * A variable that holds the last result of the roll() method.
     */
    private int lastRoll;

    /**
     * Default constructor that Constructs a new {@code Dice} with six sides.
     * This constructor is called when no arguments are passed to the constructor.
     * It is equivalent to {@code Dice(6)}.
     * ‘this’ keyword is used to call another constructor from the same class.
     * @see #Dice(int)
     * @see #getSides()
     * @see #roll()
     */
    public Dice() {
        this(6);
    }

    /**
     * Constructs a new {@code Dice} with a specified number of sides.
     * The number of sides must be positive. If it is not, an {@code IllegalArgumentException} is thrown.
     * A cryptographically secure random number generator is used for rolling the dice. It is initialized in the constructor.
     * The lastRoll field is initialized to 0. It is assigned a value in the roll() method.
     *
     * @see #getSides()
     * @see #roll()
     * @see #getLastRoll()
     * @see java.security.SecureRandom
     * @see java.lang.IllegalArgumentException
     * @see java.lang.IllegalStateException
     *
     * @param sides the number of sides.
     * @throws IllegalArgumentException if sides are non-possitive.
     */
    public Dice(int sides) {
        if (sides <= 0) {
            throw new IllegalArgumentException("Sides can only be positive");
        }
        this.sides = sides;
        this.secureRandom = new SecureRandom();
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
     * The result of the roll is assigned to the lastRoll field before the method returns.
     *
     * @return random number between 1 and the number of {@code sides} on the dice.
     */
    public int roll() {
        lastRoll = 1 + secureRandom.nextInt(sides);
        return lastRoll;
    }

    /**
     * Returns the result of the last dice roll.
     *
     * @return the result of the last dice roll.
     * @throws IllegalStateException if the dice has not been rolled yet.
     */
    public int getLastRoll() {
        if (lastRoll == 0) {
            throw new IllegalStateException("This dice has not yet been rolled");
        }

        return lastRoll;
    }

}