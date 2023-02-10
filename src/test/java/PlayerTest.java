import io.lyuda.jcards.Card;
import io.lyuda.jcards.Hand;
import io.lyuda.jcards.Rank;
import io.lyuda.jcards.game.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The PlayerTest class provides test cases for the Player class.
 *
 * @author lyudaio
 * @since 0.0.2
 */
public class PlayerTest {

    /**
     * Test case for the {@link Player#getName()} method.
     */
    @Test
    void testGetName() {
        Player player = new Player("John Doe");
        assertEquals("John Doe", player.getName());
    }

    /**
     * Test case for the {@link Player#getHand()} method.
     */
    @Test
    void testGetHand() {
        Player player = new Player("Jane Doe");
        Hand hand = player.getHand();
        assertEquals(Hand.class, hand.getClass());
    }

    /**
     * Test case for the {@link Player#addCard(Card)} method.
     */
    @Test
    void testAddCard() {
        Player player = new Player("Jim Doe");
        Card card = new Card(Rank.ACE, Card.Suit.CLUBS);
        player.addCard(card);
        assertEquals(1, player.getHand().getCards().size());
    }

    /**
     * Test case for the {@link Player#removeCard(Card)} method.
     */
    @Test
    void testRemoveCard() {
        Player player = new Player("Jack Doe");
        Card card = new Card(Rank.ACE, Card.Suit.CLUBS);
        player.addCard(card);
        player.removeCard(card);
        assertEquals(0, player.getHand().getCards().size());
    }
}
