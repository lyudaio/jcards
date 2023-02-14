package io.lyuda.jcards;

/**
 * The {@code CardImage} class allows for construction of programmatically generated
 * playing cards. Constants are defined by invoking paths from the {@link Rank} and
 * {@link Suit} Enums.
 *
 * @author lyudaio, Narkoleptika (Creator of the Paths)
 * @since 0.0.5
 */
public class CardImage {


    /**
     * Enum serves as a blank template for a playing card with a white background.
     * All other {@link Suit}'s and {@link Rank}'s are layered on top.
     */
    public enum Card {
        CARD("M10 0h80c5.54 0 10 4.46 10 10v130c0 5.54-4.46 10-10 10H10c-5.54 0-10-4.46-10-10V10C0 4.46 4.46 0 10 0z", "#fff");

        /**
         * The path for the Blank Card Template.
         */
        private final String path;

        /**
         * The path for the rank.
         */
        private final String color;

        Card(String path, String color) {
            this.path = path;
            this.color = color;
        }

        /**
         * Returns the path for the Card background
         *
         * @return path for the Card background.
         */
        public String getPath() {
            return path;
        }

        /**
         * Returns the color for the Card Background
         *
         * @return color for the Card Background.
         */
        public String getColor() {
            return color;
        }
    }

    /**
     * @param suit  path of the {@link Suit} to be drawn on the card
     * @param rank  path of the {@link Rank} to be drawn on the card
     * @param card  path of the blank {@link Card} template
     * @param color String representation of the hex color injected into the SVG.
     *              This should be derived from the {@link Suit} and {@link Rank}
     *              {@code getColor()} values.
     * @return string representation of an SVG image to be saved to a file or injected
     * to a webpage or application.
     * @see Suit
     * @see Rank
     */
    public static String makeCard(String suit, String rank, String card, String color) {

        return String.format("""
                <?xml version="1.0" encoding="UTF-8"?>
                <svg version="1.1" viewBox="0 0 100 150" xmlns="http://www.w3.org/2000/svg">
                    <defs>
                        <symbol id="card" viewBox="0 0 100 150">
                            <path d="%s" />
                        </symbol>
                        <symbol id="suit" viewBox="0 0 24 24">
                            <path d="%s" />
                        </symbol>
                        <symbol id="rank" viewBox="0 0 24 24">
                            <path d="%s" />
                        </symbol>
                    </defs>
                    <use href="#card" x="0" y="0" fill="%s" />
                    <use href="#rank" x="5" y="-64" fill="%s" width="12" />
                    <use href="#suit" x="5" y="-48" fill="%s" width="12" />
                    <use href="#rank" x="5" y="-64" fill="%s" width="12" transform="rotate(180, 50, 75)" />
                    <use href="#suit" x="5" y="-48" fill="%s" width="12" transform="rotate(180, 50, 75)" />
                    <use href="#suit" x="26" y="0" fill="%s" width="48"/>
                </svg>""", card, suit, rank, Card.CARD.getColor(), color, color, color, color, color);

    }
}
