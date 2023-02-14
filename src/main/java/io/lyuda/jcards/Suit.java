package io.lyuda.jcards;

/**
 * The {@code Suit} enum represents the suit of a playing card.
 * Each suit is associated with a unicode symbol, a color and a path.
 *
 * @author lyudaio, Narkoleptika (Creator of the Paths)
 * @since 0.0.4
 */
public enum Suit {


    /**
     * Represents the Hearts suit with a symbol of "\u2665", a color, and a path
     */
    HEARTS("\u2665", "#f00", "M12.038 24q-.593-2.257-1.702-4.226-1.09-1.99-4.245-6.158-2.314-3.06-2.85-3.882-.88-1.339-1.281-2.448-.383-1.128-.383-2.276 0-2.122 1.416-3.557Q4.408.02 6.493.02q2.103 0 3.652 1.492 1.166 1.109 1.893 3.308.631-2.161 1.778-3.29Q15.404 0 17.488 0q2.065 0 3.5 1.435 1.434 1.415 1.434 3.385 0 1.721-.841 3.595-.842 1.855-3.251 4.877-3.137 3.958-4.57 6.502Q12.63 21.8 12.037 24z"),

    /**
     * Represents the Diamonds suit with a symbol of "\u2666", a color, and a path
     */
    DIAMONDS("\u2666", "#f00", "M11.962 0q1.702 2.888 4.188 6.196 2.869 3.825 4.628 5.794-1.415 1.492-4.628 5.776-2.6 3.48-4.169 6.234-.516-.994-1.415-2.314-1.549-2.295-3.844-5.335-.497-.67-3.5-4.36 1.932-2.2 4.973-6.273Q10.45 2.696 11.962 0z"),

    /**
     * Represents the Clubs suit with a symbol of "\u2663", a color, and a path
     */
    CLUBS("\u2663", "#000", "M20.302 24H3.796l.156-.663q3.211-.682 4.263-1.345 1.576-.994 2.569-2.944 1.012-1.95 1.012-4.114 0-.312-.02-.897-1.187 2.418-2.9 3.53-1.693 1.11-3.464 1.11-2.258 0-3.835-1.579T0 13.218q0-2.261 1.44-3.801 1.441-1.56 3.271-1.56 1.168 0 3.173.994-.818-1.364-1.07-2.047-.234-.702-.234-1.5 0-2.223 1.537-3.764T11.952 0t3.854 1.54q1.576 1.54 1.576 3.666 0 1.735-1.343 3.645 1.635-.78 1.966-.877.526-.156 1.188-.156 1.946 0 3.367 1.54Q24 10.88 24 13.141q0 2.34-1.576 3.938-1.557 1.58-3.757 1.58-1.226 0-2.53-.586-1.285-.604-2.239-1.599-.681-.72-1.693-2.437.078 3.1.934 4.914.876 1.793 2.667 2.983 1.207.799 4.34 1.403z"),

    /**
     * Represents the Spades suit with a symbol of "\u2660", a color, and a path
     */
    SPADES("\u2660", "#000", "M12.019 0q.507 2.106 1.56 3.763 1.052 1.657 3.743 4.114 2.71 2.437 3.431 3.743t.722 2.651q0 1.872-1.248 3.12t-3.041 1.248q-1.521 0-2.769-.936-1.228-.956-2.184-2.769.02 2.866.741 4.562.741 1.677 2.34 2.652 1.618.955 4.29 1.13l.136.722H4.279l.156-.721q3.587 0 5.556-2.087 1.989-2.105 1.91-6.258-.877 1.852-2.183 2.788-1.287.917-2.924.917-1.755 0-3.022-1.268-1.248-1.267-1.248-3.041 0-1.423.643-2.574.878-1.598 2.847-3.217 1.969-1.618 2.905-2.67 1.423-1.619 2.066-2.886Q11.648 1.716 12.02 0z");


    public static final String WHITE = "#fff";
    /**
     * The unicode symbol representing the suit.
     */
    private final String symbol;

    /**
     * The color of the suit.
     */
    private final String color;

    /**
     * The path representing the suit.
     */
    private final String path;

    /**
     * Constructs a {@code Suit} with a given symbol, color and path.
     *
     * @param symbol the unicode symbol of the suit.
     * @param color  the color of the suit.
     * @param path   the path representing the suit.
     */
    Suit(String symbol, String color, String path) {
        this.symbol = symbol;
        this.color = color;
        this.path = path;
    }

    /**
     * Returns the unicode symbol of the suit.
     *
     * @return the unicode symbol of the suit.
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Returns the color of the suit.
     *
     * @return the color of the suit.
     */
    public String getColor() {
        return color;
    }

    /**
     * Returns the path of the suit.
     *
     * @return the path of the suit.
     */
    public String getPath() {
        return path;
    }
}
