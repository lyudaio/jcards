package io.lyuda.jcards;

/**
 * The {@code Rank} enum represents the rank of a playing card.
 * Each rank is associated with a numerical value and a unicode symbol.
 *
 * @author lyudaio
 * @since 0.0.4
 */
public enum Rank {

    /**
     * Represents the Ace card with a value of 1 and symbol of "\uD83C\uDCA1".
     */
    ACE(1, "\uD83C\uDCA1"),

    /**
     * Represents the Two card with a value of 2 and symbol of "\uD83C\uDCA2".
     */
    TWO(2, "\uD83C\uDCA2"),

    /**
     * Represents the Three card with a value of 3 and symbol of "\uD83C\uDCA3".
     */
    THREE(3, "\uD83C\uDCA3"),

    /**
     * Represents the Four card with a value of 4 and symbol of "\uD83C\uDCA4".
     */
    FOUR(4, "\uD83C\uDCA4"),

    /**
     * Represents the Five card with a value of 5 and symbol of "\uD83C\uDCA5".
     */
    FIVE(5, "\uD83C\uDCA5"),

    /**
     * Represents the Six card with a value of 6 and symbol of "\uD83C\uDCA6".
     */
    SIX(6, "\uD83C\uDCA6"),

    /**
     * Represents the Seven card with a value of 7 and symbol of "\uD83C\uDCA7".
     */
    SEVEN(7, "\uD83C\uDCA7"),

    /**
     * Represents the Eight card with a value of 8 and symbol of "\uD83C\uDCA8".
     */
    EIGHT(8, "\uD83C\uDCA8"),

    /**
     * Represents the Nine card with a value of 9 and symbol of "\uD83C\uDCA9".
     */
    NINE(9, "\uD83C\uDCA9"),

    /**
     * Represents the Ten card with a value of 10 and symbol of "\uD83C\uDCAA".
     */
    TEN(10, "\uD83C\uDCAA"),

    /**
     * Represents the Jack card with a value of 11 and symbol of "\uD83C\uDCAB".
     */
    JACK(11, "\uD83C\uDCAB"),

    /**
     * Represents the Queen card with a value of 12 and symbol of "\uD83C\uDCAD".
     */
    QUEEN(12, "\uD83C\uDCAD"),

    /**
     * Represents the King card with a value of 13 and symbol of "\uD83C\uDCAE".
     */
    KING(13, "\uD83C\uDCAE");

    /**
     * The numerical value of the rank.
     */
    private final int value;

    /**
     * The unicode symbol representing the rank.
     */
    private final String symbol;

    /**
     * Constructs a {@code Rank} with a given value and symbol.
     *
     * @param value  the numerical value of the rank.
     * @param symbol the unicode symbol of the rank.
     */
    Rank(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    /**
     * Returns the numerical value of the rank.
     *
     * @return the numerical value of the rank.
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns the unicode symbol of the rank.
     *
     * @return the unicode symbol of the rank.
     */
    public String getSymbol() {
        return symbol;
    }

}

