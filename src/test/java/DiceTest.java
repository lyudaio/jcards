import io.lyuda.jcards.Dice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Test class for the {@link Card} class.
 *
 * @author KonnosBaz
 */
public class DiceTest {
    /**
     * Tests constructor for valid (possitive) sides.
     */
    @Test 
    public void testDice_validInput() {
        Dice dice = new Dice(6);

        assertNotNull(dice);
    }

    /**
     * Test if constructor throws exception for invalid (negative) sides.
     */
    @Test
    public void testDice_invalidInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Dice(-6);
        });
    }

    /**
     * Tests getSides.
     */
    @Test
    public void testDice_getSides() {
        Dice dice = new Dice(5);
        assertTrue(dice.getSides() == 5);
    }

    /**
     * Tests roll.
     */
    @Test
    public void testDice_roll() {
        Dice dice = new Dice(4);
        //Repeating the test here might be redundant, but I included it since the roll() function uses
        //a random number generator 
        for (int i = 0; i < 10; i++) { 
            int result = dice.roll();
            assertTrue(result >= 1 & result <= dice.getSides());
    
        }
    }
}    