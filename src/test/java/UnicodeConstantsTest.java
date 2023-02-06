import io.lyuda.UnicodeConstants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link UnicodeConstants}
 *
 * @author NullRSJ
 * @since 0.0.1
 */
public class UnicodeConstantsTest {

    /**
     * Tests if the unicode representation of the hearts suit is correct
     */
    @Test
    public void testHeartSuit() {
        assertEquals("\u2665", UnicodeConstants.HEART);
    }

    /**
     * Tests if the unicode representation of the diamonds suit is correct
     */
    @Test
    public void testDiamondSuit() {
        assertEquals("\u2666", UnicodeConstants.DIAMOND);
    }

    /**
     * Tests if the unicode representation of the spades suit is correct
     */
    @Test
    public void testSpadeSuit() {
        assertEquals("\u2660", UnicodeConstants.SPADE);
    }

    /**
     * Tests if the unicode representation of the clubs suit is correct
     */
    @Test
    public void testClubSuit() {
        assertEquals("\u2663", UnicodeConstants.CLUB);
    }

    /**
     * Tests if the unicode representation of the ace rank is correct
     */
    @Test
    public void testAceRank() {
        assertEquals("\uD83C\uDCA1", UnicodeConstants.ACE);
    }

    /**
     * Tests if the unicode representation of the two rank is correct
     */
    @Test
    public void testTwoRank() {
        assertEquals("\uD83C\uDCA2", UnicodeConstants.TWO);
    }

    /**
     * Tests if the unicode representation of the three rank is correct
     */
    @Test
    public void testThreeRank() {
        assertEquals("\uD83C\uDCA3", UnicodeConstants.THREE);
    }

    /**
     * Tests if the unicode representation of the four rank is correct
     */
    @Test
    public void testFourRank() {
        assertEquals("\uD83C\uDCA4", UnicodeConstants.FOUR);
    }

    /**
     * Tests if the unicode representation of the five rank is correct
     */
    @Test
    public void testFiveRank() {
        assertEquals("\uD83C\uDCA5", UnicodeConstants.FIVE);
    }

    /**
     * Tests if the unicode representation of the six rank is correct
     */
    @Test
    public void testSixRank() {
        assertEquals("\uD83C\uDCA6", UnicodeConstants.SIX);
    }

    /**
     * Tests if the unicode representation of the seven rank is correct
     */
    @Test
    public void testSevenRank() {
        assertEquals("\uD83C\uDCA7", UnicodeConstants.SEVEN);
    }

    /**
     * Tests if the unicode representation of the eight rank is correct
     */
    @Test
    public void testEightRank() {
        assertEquals("\uD83C\uDCA8", UnicodeConstants.EIGHT);
    }

    /**
     * Tests if the unicode representation of the nine rank is correct
     */
    @Test
    public void testNineRank() {
        assertEquals("\uD83C\uDCA9", UnicodeConstants.NINE);
    }


    /**
     * Tests if the unicode representation of the jack rank is correct
     */
    @Test
    public void testJackRank() {
        assertEquals("\uD83C\uDCAB", UnicodeConstants.JACK);
    }

    /**
     * Tests if the unicode representation of the queen rank is correct
     */
    @Test
    public void testQueenRank() {
        assertEquals("\uD83C\uDCAD", UnicodeConstants.QUEEN);
    }

    /**
     * Tests if the unicode representation of the king rank is correct
     */
    @Test
    public void testKingRank() {
        assertEquals("\uD83C\uDCAE", UnicodeConstants.KING);
    }

}

