package io.lyuda.jcards;

import java.util.List;

/**
 * The {@code DeckFactory} class is used to create and manage multiple decks of cards.
 *
 * This class allows you to create and keep track of multiple decks, each of which
 * can be shuffled and dealt from independently.
 *
 * @author lyudaio
 * @since 0.0.3
 */
public class DeckFactory {

    /**
     * The `decks` member variable represents a collection of all the decks created by the factory.
     * It is used to store and manage all the decks created by the factory.
     * This variable is private and is only accessible within the class.
     */
    private List<Deck> decks;

    /**
     * Creates a new deck of cards and adds it to the list of decks.
     *
     * @return the created deck of cards
     */
    public Deck createDeck() {
        Deck deck = new Deck();
        decks.add(deck);
        return deck;
    }

    /**
     * Gets a list of all the decks created by the factory.
     *
     * @return a list of all the decks created by the factory
     */
    public List<Deck> getDecks() {
        return decks;
    }

    /**
     * Gets a specific deck by its index in the list of decks.
     *
     * @param index the index of the deck to get
     * @return the deck at the specified index, or {@code null} if the index is invalid
     */
    public Deck getDeck(int index) {
        if (index < 0 || index >= decks.size()) {
            return null;
        }
        return decks.get(index);
    }
}
