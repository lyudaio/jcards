import io.lyuda.jcards.Suit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for the {@code Suit} enum.
 *
 * @author lyudaio
 * @since 0.0.4
 */
class SuitTest {

    /**
     * Tests that each enum constant has the correct symbol.
     */
    @Test
    void testGetSymbol() {
        assertEquals("\u2665", Suit.HEARTS.getSymbol());
        assertEquals("\u2666", Suit.DIAMONDS.getSymbol());
        assertEquals("\u2663", Suit.CLUBS.getSymbol());
        assertEquals("\u2660", Suit.SPADES.getSymbol());
    }
}

