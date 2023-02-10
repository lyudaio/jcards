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

}
