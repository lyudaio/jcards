import io.lyuda.jcards.Deck;
import io.lyuda.jcards.DeckFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeckFactoryTest {

    /**
     * Test case for the {@link DeckFactory#createDeck()} method.
     * This test ensures that the createDeck() method correctly creates a new non-null {@link Deck} object to be managed by
     * {@link DeckFactory}.
     *
     */
    @Test
    public void testCreateDeck() {
        DeckFactory factory = new DeckFactory();
        Deck deck = factory.createDeck();
        List<Deck> decks = factory.getDecks();

        assertNotNull(deck);
        assertEquals(1, decks.size());
        assertEquals(deck, decks.get(0));
    }


    /**
     * Test case for the {@link DeckFactory#getDecks()} method.
     * This test ensures that the getDecks method correctly returns a list {@link Deck} objects manged by the factory
     */
    @Test
    public void testGetDecks() {
        DeckFactory factory = new DeckFactory();
        Deck deck1 = factory.createDeck();
        Deck deck2 = factory.createDeck();
        List<Deck> decks = factory.getDecks();

        assertEquals(2, decks.size());
        assertEquals(deck1, decks.get(0));
        assertEquals(deck2, decks.get(1));
    }


    /**
     * Test case for the {@link DeckFactory#getDeck(int)} method.
     * This test ensures that the getDeck method correctly returns a {@link Deck} object at the specified index..
     */
    @Test
    public void testGetDeck() {
        DeckFactory factory = new DeckFactory();
        Deck deck1 = factory.createDeck();
        Deck deck2 = factory.createDeck();
        Deck deck3 = factory.createDeck();
        Deck returnedDeck1 = factory.getDeck(0);
        Deck returnedDeck2 = factory.getDeck(1);
        Deck returnedDeck3 = factory.getDeck(2);
        Deck returnedDeck4 = factory.getDeck(3);

        assertEquals(deck1, returnedDeck1);
        assertEquals(deck2, returnedDeck2);
        assertEquals(deck3, returnedDeck3);
        assertNull(returnedDeck4);
    }

    /**
     * Test case for the {@link DeckFactory#removeDeck(int)} method.
     * This test ensures that the removeDeck method correctly removes a Deck object from the list of Decks in DeckFactory.
     * It also verifies that the method returns the expected boolean value indicating success or failure of the removal operation.
     */
    @Test
    public void testRemoveDeck() {
        DeckFactory factory = new DeckFactory();
        Deck deck1 = factory.createDeck();
        Deck deck2 = factory.createDeck();
        Deck deck3 = factory.createDeck();
        List<Deck> decks = factory.getDecks();

        assertTrue(factory.removeDeck(1));
        assertEquals(2, decks.size());
        assertEquals(deck1, decks.get(0));
        assertEquals(deck3, decks.get(1));
        assertFalse(factory.removeDeck(3));
    }

    /**
     * Test case for the {@link DeckFactory#shuffleAllDecks()} method.
     * This test ensures that the shuffleAllDecks method correctly shuffles all the Deck objects in the list of Decks in DeckFactory.
     */
    @Test
    public void testShuffleAllDecks() {
        DeckFactory factory = new DeckFactory();
        Deck deck1 = factory.createDeck();
        Deck deck2 = factory.createDeck();
        List<Deck> decks = factory.getDecks();

        factory.shuffleAllDecks();
        assertNotEquals(deck1.getCards(), deck2.getCards());
        factory.shuffleAllDecks();
        assertNotEquals(deck1.getCards(), deck2.getCards());
    }

    /**
     * Test case for the {@link DeckFactory#shuffleDeck(int)} method.
     * This test ensures that the shuffleDeck method correctly shuffles the specified Deck object in the list of Decks in DeckFactory.
     */
    @Test
    public void testShuffleDeck() {
        DeckFactory factory = new DeckFactory();
        Deck deck1 = factory.createDeck();
        Deck deck2 = factory.createDeck();
        List<Deck> decks = factory.getDecks();

        for (Deck deck:decks) {
            deck.shuffle();
        }

        assertNotEquals(deck1.getCards(), deck2.getCards());
        factory.shuffleDeck(1);
        assertNotEquals(deck1.getCards(), deck2.getCards());
    }


}
