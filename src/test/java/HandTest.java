import io.lyuda.jcards.Card;
import io.lyuda.jcards.Hand;
import io.lyuda.jcards.Rank;
import io.lyuda.jcards.Suit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link Hand} class.
 *
 * @author lyudaio
 * @see Hand
 * @since 0.0.1
 */
@DisplayName("Hand Class Unit Tests")
class HandTest {

    /**
     * Represents a hand of playing cards.
     */
    private Hand hand;

    /**
     * Represents an Ace of Spades playing card.
     */
    private Card aceOfSpades;

    /**
     * Represents a King of Hearts playing card.
     */
    private Card kingOfHearts;

    /**
     * Represents a Queen of Diamonds playing card.
     */
    private Card queenOfDiamonds;


    /**
     * Initializes the hand and the cards before each test.
     */
    @BeforeEach
    void setUp() {
        hand = new Hand();
        aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
        kingOfHearts = new Card(Rank.KING, Suit.HEARTS);
        queenOfDiamonds = new Card(Rank.QUEEN, Suit.DIAMONDS);
    }

    /**
     * Test to ensure that a new hand is initially empty.
     */
    @Test
    @DisplayName("Test that the Hand is initially empty")
    void testHandIsInitiallyEmpty() {
        assertEquals(0, hand.size());
        assertTrue(hand.getCards().isEmpty());
    }


    /**
     * Tests the addCard method of the {@link Hand} class.
     * This method adds a card to the hand and tests that the hand's size is updated correctly,
     * and the card was indeed added to the hand's cards.
     */
    @Test
    @DisplayName("Test that the addCard method works correctly")
    void testAddCard() {
        hand.addCard(aceOfSpades);
        assertEquals(1, hand.size());
        assertFalse(hand.getCards().isEmpty());
        assertTrue(hand.getCards().contains(aceOfSpades));
    }

    /**
     * Tests the removeCard method of the {@link Hand} class.
     * This method adds two cards to the hand, tests the size of the hand to make sure it's not empty,
     * removes one of the cards, and tests that the size of the hand was updated correctly,
     * and the removed card is no longer in the hand's cards.
     */
    @Test
    @DisplayName("Test that the removeCard method works correctly")
    void testRemoveCard() {
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);
        assertEquals(2, hand.size());

        hand.removeCard(aceOfSpades);
        assertEquals(1, hand.size());
        assertFalse(hand.getCards().contains(aceOfSpades));
        assertTrue(hand.getCards().contains(kingOfHearts));
    }


    /**
     * Test that the size method works correctly.
     */
    @Test
    @DisplayName("Test that the size method works correctly")
    void testSize() {
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);
        hand.addCard(queenOfDiamonds);
        assertEquals(3, hand.size());
    }

    /**
     * Test that the getCards method works correctly.
     */
    @Test
    @DisplayName("Test that the getCards method works correctly")
    void testGetCards() {
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);
        hand.addCard(queenOfDiamonds);

        List<Card> cards = hand.getCards();
        assertEquals(3, cards.size());
        assertTrue(cards.contains(aceOfSpades));
        assertTrue(cards.contains(kingOfHearts));
        assertTrue(cards.contains(queenOfDiamonds));
    }

    /**
     * Tests the sort method of the {@link Hand} class.
     * Adds two cards, sorts the hand and then asserts that the cards are in the correct order.
     */
    @Test
    void testSort() {
        hand.addCard(kingOfHearts);
        hand.addCard(aceOfSpades);

        hand.sort();

        List<Card> expectedCards = new ArrayList<>();
        expectedCards.add(aceOfSpades);
        expectedCards.add(kingOfHearts);

        assertEquals(expectedCards, hand.getCards());
    }

    /**
     * Tests the findCard method of the {@link Hand} class.
     * Adds two cards and then asserts that the correct card is found and that a non-existent card returns an empty Optional.
     */
    @Test
    void testFindCard() {
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);

        Optional<Card> expectedCard = Optional.of(aceOfSpades);

        assertEquals(expectedCard, hand.findCard(Rank.ACE, Suit.SPADES));
        assertEquals(Optional.empty(), hand.findCard(Rank.QUEEN, Suit.DIAMONDS));
    }

    /**
     * Tests the toString method of the {@link Hand} class.
     * Adds two cards and then asserts that the string representation of the hand is correct.
     */
    @Test
    void testToString() {
        hand.addCard(aceOfSpades);
        hand.addCard(kingOfHearts);

        assertEquals("Hand: ACE of SPADES, KING of HEARTS", hand.toString());
    }


}
