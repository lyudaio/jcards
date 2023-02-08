

import io.lyuda.jcards.UnicodeConstants;
import io.lyuda.jcards.Card.Rank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class provides test cases for the {@link UnicodeConstants} class.
 *
 * The tests ensure that the symbols for the {@link UnicodeConstants.Rank} and
 * {@link UnicodeConstants.Suit} enums are correctly returned by their respective
 * {@link UnicodeConstants.Rank#getSymbol()} and {@link UnicodeConstants.Suit#getSymbol()}
 * methods.
 *
 * @author lyudaio
 * @since 0.0.1
 */

class UnicodeConstantsTest {

    /**
     * Test the values of the {@link UnicodeConstants.Suit} enum.
     *
     * This test verifies the correctness of the symbols returned by the
     * {@link UnicodeConstants.Suit#getSymbol()} method for each suit.
     *
     * The symbols tested are:
     * <ul>
     *   <li>{@code "\u2665"} for the {@link UnicodeConstants.Suit#HEART} suit</li>
     *   <li>{@code "\u2666"} for the {@link UnicodeConstants.Suit#DIAMOND} suit</li>
     *   <li>{@code "\u2660"} for the {@link UnicodeConstants.Suit#SPADE} suit</li>
     *   <li>{@code "\u2663"} for the {@link UnicodeConstants.Suit#CLUB} suit</li>
     * </ul>
     */
    @Test
    void testSuitEnumValues() {
        assertEquals("\u2665", UnicodeConstants.Suit.HEART.getSymbol());
        assertEquals("\u2666", UnicodeConstants.Suit.DIAMOND.getSymbol());
        assertEquals("\u2660", UnicodeConstants.Suit.SPADE.getSymbol());
        assertEquals("\u2663", UnicodeConstants.Suit.CLUB.getSymbol());
    }

    /**
     * Tests the {@link Rank} enumeration constants.
     *
     * <p>The test verifies that the {@link Rank#getSymbol()} method of each constant in the {@code Rank}
     * enum returns the expected symbol in Unicode format.
     *
     * <p>The following symbols are tested:
     * <ul>
     *   <li>Expects {@code "\uD83C\uDCA1"} for {@link Rank#ACE}</li>
     *   <li>Expects {@code "\uD83C\uDCA2"} for {@link Rank#TWO}</li>
     *   <li>Expects {@code "\uD83C\uDCA3"} for {@link Rank#THREE}</li>
     *   <li>Expects {@code "\uD83C\uDCA4"} for {@link Rank#FOUR}</li>
     *   <li>Expects {@code "\uD83C\uDCA5"} for {@link Rank#FIVE}</li>
     *   <li>Expects {@code "\uD83C\uDCA6"} for {@link Rank#SIX}</li>
     *   <li>Expects {@code "\uD83C\uDCA7"} for {@link Rank#SEVEN}</li>
     *   <li>Expects {@code "\uD83C\uDCA8"} for {@link Rank#EIGHT}</li>
     *   <li>Expects {@code "\uD83C\uDCA9"} for {@link Rank#NINE}</li>
     *   <li>Expects {@code "\uD83C\uDCAA"} for {@link Rank#TEN}</li>
     *   <li>Expects {@code "\uD83C\uDCAB"} for {@link Rank#JACK}</li>
     *   <li>Expects {@code "\uD83C\uDCAD"} for {@link Rank#QUEEN}</li>
     *   <li>Expects {@code "\uD83C\uDCAE"} for {@link Rank#KING}</li>
     * </ul>
     */
    @Test
    void testRankEnumValues() {
        assertEquals("\uD83C\uDCA1", UnicodeConstants.Rank.ACE.getSymbol());
        assertEquals("\uD83C\uDCA2", UnicodeConstants.Rank.TWO.getSymbol());
        assertEquals("\uD83C\uDCA3", UnicodeConstants.Rank.THREE.getSymbol());
        assertEquals("\uD83C\uDCA4", UnicodeConstants.Rank.FOUR.getSymbol());
        assertEquals("\uD83C\uDCA5", UnicodeConstants.Rank.FIVE.getSymbol());
        assertEquals("\uD83C\uDCA6", UnicodeConstants.Rank.SIX.getSymbol());
        assertEquals("\uD83C\uDCA7", UnicodeConstants.Rank.SEVEN.getSymbol());
        assertEquals("\uD83C\uDCA8", UnicodeConstants.Rank.EIGHT.getSymbol());
        assertEquals("\uD83C\uDCA9", UnicodeConstants.Rank.NINE.getSymbol());
        assertEquals("\uD83C\uDCAA", UnicodeConstants.Rank.TEN.getSymbol());
        assertEquals("\uD83C\uDCAB", UnicodeConstants.Rank.JACK.getSymbol());
        assertEquals("\uD83C\uDCAD", UnicodeConstants.Rank.QUEEN.getSymbol());
        assertEquals("\uD83C\uDCAE", UnicodeConstants.Rank.KING.getSymbol());
    }
}
