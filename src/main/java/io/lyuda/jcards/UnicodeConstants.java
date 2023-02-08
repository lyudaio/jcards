package io.lyuda.jcards;

/**
 * The `UnicodeConstants` class serves as a container for Unicode representations of playing card suits and ranks.
 * The class uses enumeration for suits and ranks to improve code readability and reduce the risk of typos.
 *
 * @author lyudaio
 * @since 0.0.1
 */
public final class UnicodeConstants {

    /**
     * An enumeration of the suits of a playing card deck. Each enumeration value has a corresponding Unicode symbol.
     */
    public enum Suit {
        /**
         * Heart suit represented by the Unicode symbol '\u2665'
         */
        HEART("\u2665"),
        /**
         * Diamond suit represented by the Unicode symbol '\u2666'
         */
        DIAMOND("\u2666"),
        /**
         * Spade suit represented by the Unicode symbol '\u2660'
         */
        SPADE("\u2660"),
        /**
         * Club suit represented by the Unicode symbol '\u2663'
         */
        CLUB("\u2663");

        private final String symbol;

        /**
         * Creates a new `Suit` enumeration value with the specified Unicode symbol.
         *
         * @param symbol the Unicode symbol for the suit
         */
        Suit(String symbol) {
            this.symbol = symbol;
        }

        /**
         * Returns the Unicode symbol for the suit.
         *
         * @return the Unicode symbol for the suit
         */
        public String getSymbol() {
            return symbol;
        }
    }

    /**
     * An enumeration of the ranks of a playing card deck. Each enumeration value has a corresponding Unicode symbol.
     */
    public enum Rank {
        /**
         * Ace rank represented by the Unicode symbol '\uD83C\uDCA1'
         */
        ACE("\uD83C\uDCA1"),
        /**
         * Two rank represented by the Unicode symbol '\uD83C\uDCA2'
         */
        TWO("\uD83C\uDCA2"),
        /**
         * Three rank represented by the Unicode symbol '\uD83C\uDCA3'
         */
        THREE("\uD83C\uDCA3"),
        /**
         * Four rank represented by the Unicode symbol '\uD83C\uDCA4'
         */
        FOUR("\uD83C\uDCA4"),
        /**
         * Five rank represented by the Unicode symbol '\uD83C\uDCA5'
         */
        FIVE("\uD83C\uDCA5"),
        /**
         * Six rank represented by the Unicode symbol '\uD83C\uDCA6'
         */
        SIX("\uD83C\uDCA6"),
        /**
         * Seven rank represented by the Unicode symbol '\uD83C\uDCA7'
         */
        SEVEN("\uD83C\uDCA7"),
        /**
         * Eight rank represented by the Unicode symbol '\uD83C\uDCA8'
         */
        EIGHT("\uD83C\uDCA8"),
        /**
         * Nine rank represented by the Unicode symbol '\uD83C\uDCA9'
         */
        NINE("\uD83C\uDCA9"),

        /**
         * Ten rank represented by the Unicode symbol '\uD83C\uDCAA'
         */
        TEN("\uD83C\uDCAA"),
        /**
         * Jack rank represented by the Unicode symbol '\uD83C\uDCAB'
         */
        JACK("\uD83C\uDCAB"),
        /**
         * Queen rank represented by the Unicode symbol '\uD83C\uDCAD'
         */
        QUEEN("\uD83C\uDCAD"),
        /**
         * King rank represented by the Unicode symbol '\uD83C\uDCAE'
         */
        KING("\uD83C\uDCAE");
        private final String symbol;

        /**
         * Creates a new `Rank` enumeration value with the specified Unicode symbol.
         *
         * @param symbol the Unicode symbol for the rank
         */
        Rank(String symbol) {
            this.symbol = symbol;
        }

        /**
         * Returns the Unicode symbol for the rank.
         *
         * @return the Unicode symbol for the rank
         */
        public String getSymbol() {
            return symbol;
        }
    }
}
