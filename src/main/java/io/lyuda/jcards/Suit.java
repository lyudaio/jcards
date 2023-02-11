package io.lyuda.jcards;

/**
 * The {@code Suit} enum represents the suit of a playing card.
 * Each suit is associated with a unicode symbol.
 *
 * @author lyudaio
 * @since 0.0.4
 */
public enum Suit {

    /**
     * Represents the Hearts suit with a symbol of "\u2665".
     */
    HEARTS("\u2665"),

    /**
     * Represents the Diamonds suit with a symbol of "\u2666".
     */
    DIAMONDS("\u2666"),

    /**
     * Represents the Clubs suit with a symbol of "\u2663".
     */
    CLUBS("\u2663"),

    /**
     * Represents the Spades suit with a symbol of "\u2660".
     */
    SPADES("\u2660");

    /**
     * The unicode symbol representing the suit.
     */
    private final String symbol;

    /**
     * Constructs a {@code Suit} with a given symbol.
     *
     * @param symbol the unicode symbol of the suit.
     */
    Suit(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Returns the unicode symbol of the suit.
     *
     * @return the unicode symbol of the suit.
     */
    public String getSymbol() {
        return symbol;
    }

}
