import io.lyuda.jcards.Rank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the {@code Rank} enum.
 *
 * @author lyudaio
 * @since 0.0.4
 */
class RankTest {

    /**
     * Tests the {@link Rank#getValue()} method.
     * Verifies that the returned value is correct for each rank.
     */
    @Test
    void testGetValue() {
        assertEquals(1, Rank.ACE.getValue());
        assertEquals(2, Rank.TWO.getValue());
        assertEquals(3, Rank.THREE.getValue());
        assertEquals(4, Rank.FOUR.getValue());
        assertEquals(5, Rank.FIVE.getValue());
        assertEquals(6, Rank.SIX.getValue());
        assertEquals(7, Rank.SEVEN.getValue());
        assertEquals(8, Rank.EIGHT.getValue());
        assertEquals(9, Rank.NINE.getValue());
        assertEquals(10, Rank.TEN.getValue());
        assertEquals(10, Rank.JACK.getValue());
        assertEquals(10, Rank.QUEEN.getValue());
        assertEquals(10, Rank.KING.getValue());
    }

    /**
     * Tests the {@link Rank#getSymbol()} method.
     * Verifies that the returned symbol is correct for each rank.
     */
    @Test
    void testGetSymbol() {
        assertEquals("\uD83C\uDCA1", Rank.ACE.getSymbol());
        assertEquals("\uD83C\uDCA2", Rank.TWO.getSymbol());
        assertEquals("\uD83C\uDCA3", Rank.THREE.getSymbol());
        assertEquals("\uD83C\uDCA4", Rank.FOUR.getSymbol());
        assertEquals("\uD83C\uDCA5", Rank.FIVE.getSymbol());
        assertEquals("\uD83C\uDCA6", Rank.SIX.getSymbol());
        assertEquals("\uD83C\uDCA7", Rank.SEVEN.getSymbol());
        assertEquals("\uD83C\uDCA8", Rank.EIGHT.getSymbol());
        assertEquals("\uD83C\uDCA9", Rank.NINE.getSymbol());
        assertEquals("\uD83C\uDCAA", Rank.TEN.getSymbol());
        assertEquals("\uD83C\uDCAB", Rank.JACK.getSymbol());
        assertEquals("\uD83C\uDCAD", Rank.QUEEN.getSymbol());
        assertEquals("\uD83C\uDCAE", Rank.KING.getSymbol());
    }
}

