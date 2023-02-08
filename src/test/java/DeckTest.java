

import io.lyuda.jcards.Card;
import io.lyuda.jcards.Deck;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A JUnit test class for the {@link Deck} class.
 *
 * <p>The purpose of this class is to thoroughly test the functionality of the {@link Deck} class.
 * All methods are tested to ensure that they behave as expected, and edge cases are also considered.
 *
 * @author lyudaio
 * @since 0.0.1
 */
public class DeckTest {
    private Deck deck;

    /**
     * Initializes a new deck of cards for each test.
     */
    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }

    /**
     * Test the creation of a new Deck of cards.
     * This test verifies that the deck is correctly initialized with 52 cards, each with a unique rank and suit.
     *
     * @author lyudaio
     * @since 0.0.1
     */
    @Test
    public void testCreation() {
        Deck deck = new Deck();
        assertEquals(52, deck.getSize(), "The deck should have 52 cards after creation");

        Set<Card> uniqueCards = new HashSet<>();
        for (int i = 0; i < 52; i++) {
            Card card = deck.getCardAtIndex(i);
            assertFalse(uniqueCards.contains(card), "Each card in the deck should be unique");
            uniqueCards.add(card);
        }
    }


    /**
     * Tests shuffling the deck of cards.
     *
     * <p>This test verifies that shuffling the deck of cards changes the order of the cards, and
     * that the order is different each time the deck is shuffled.
     */
    @Test
    public void testShuffle() {
        Deck deck1 = new Deck();
        deck1.shuffle();

        Deck deck2 = new Deck();
        deck2.shuffle();

        assertNotEquals(deck1.toString(), deck2.toString());
    }

    /**
     * Tests dealing a card from the deck.
     *
     * <p>This test verifies that dealing a card from the deck removes the card from the deck and
     * reduces the number of cards remaining. An exception is also thrown if an attempt is made to
     * deal from an empty deck.
     */
    @Test
    public void testDeal() {
        int size1 = deck.cardsRemaining();
        deck.deal();
        int size2 = deck.cardsRemaining();

        assertEquals(size1 - 1, size2);

        deck = new Deck();
        for (int i = 0; i < 52; i++) {
            deck.deal();
        }
        try {
            deck.deal();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("No more cards in the deck", e.getMessage());
        }
    }

    /**
     * Test method to check the `findCard` method of the `Deck` class. This test verifies that the `findCard` method is
     * able to locate a card with rank SEVEN and suit SPADES in the shuffled deck.
     */
    @Test
    public void testFindCard() {
        Deck deck = new Deck();
        deck.shuffle();
        int indexOfSevenOfSpades = deck.findCard(Card.Rank.SEVEN, Card.Suit.SPADES);
        assertTrue(indexOfSevenOfSpades >= 0 && indexOfSevenOfSpades <= 51, "The index of the 7 of Spades should be between 0 and 51, inclusive");
    }

    /**
     * Test the findCardsByRank() method to verify that it correctly returns a list of the indices
     * of the cards in the deck with the specified rank.
     */
    @Test
    public void testFindCardsByRank() {
        Deck deck = new Deck();

        List<Integer> indices = deck.findCardsByRank(Card.Rank.ACE);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.FIVE);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.KING);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.JACK);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.QUEEN);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.TEN);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.NINE);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.EIGHT);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.SEVEN);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.SIX);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.FOUR);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.THREE);
        assertEquals(4, indices.size());

        indices = deck.findCardsByRank(Card.Rank.TWO);
        assertEquals(4, indices.size());
    }

    /**
     * Test the findCardsBySuit() method to verify that it correctly returns a list of the indices
     * of the cards in the deck with the specified suit.
     */
    @Test
    public void testFindCardsBySuit() {
        Deck deck = new Deck();

        List<Integer> indices = deck.findCardsBySuit(Card.Suit.HEARTS);
        assertEquals(13, indices.size());

        indices = deck.findCardsBySuit(Card.Suit.DIAMONDS);
        assertEquals(13, indices.size());

        indices = deck.findCardsBySuit(Card.Suit.CLUBS);
        assertEquals(13, indices.size());

        indices = deck.findCardsBySuit(Card.Suit.SPADES);
        assertEquals(13, indices.size());
    }

}