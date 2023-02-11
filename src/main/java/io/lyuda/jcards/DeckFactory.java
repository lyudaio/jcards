package io.lyuda.jcards;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code DeckFactory} class is used to create and manage multiple decks of cards.
 * <p>
 * This class provides functionality for creating and keeping track of multiple {@link Deck} objects,
 * each of which can be shuffled, dealt from, and managed independently. The factory allows you to
 * easily create, shuffle, deal, and manage a collection of decks.
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
    private final List<Deck> decks;


    /**
     * Constructor for the DeckFactory class that creates a specified number of {@link Deck} objects.
     *
     * @param amount The number of decks to create.
     */
    public DeckFactory(int amount) {
        this.decks = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            createDeck();
        }
    }

    /**
     * Default constructor for the DeckFactory class.
     * This creates an empty list of {@link Deck} objects.
     */
    public DeckFactory() {
        this.decks = new ArrayList<>();
    }


    /**
     * Creates a new deck of cards and adds it to the list of decks managed by the factory.
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
     * Gets a specific deck by its index in the list of decks managed by the factory.
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

    /**
     * Removes a deck from the list of decks managed by the factory.
     *
     * @param index the index of the deck to remove
     * @return {@code true} if the deck was successfully removed, {@code false} otherwise
     */
    public boolean removeDeck(int index) {
        if (index < 0 || index >= decks.size()) {
            return false;
        }
        decks.remove(index);
        return true;
    }

    /**
     * Shuffles all the decks in the list of decks managed by the factory.
     *
     * @see Deck#shuffle()
     */
    public void shuffleAllDecks() {
        for (Deck deck : decks) {
            deck.shuffle();
        }
    }

    /**
     * Shuffles a specific deck by its index in the list of decks managed by the factory.
     *
     * @param index the index of the deck to shuffle
     * @return {@code true} if the deck was successfully shuffled, {@code false} otherwise
     */
    public boolean shuffleDeck(int index) {
        if (index < 0 || index >= decks.size()) {
            return false;
        }
        Deck deck = decks.get(index);
        deck.shuffle();
        return true;
    }

    /**
     * Removes all the decks from the list of decks managed by the factory.
     */
    public void clearDecks() {
        decks.clear();
    }

    /**
     * Sorts all the decks in the list of decks managed by the factory.
     */
    public void sortAllDecks() {
        for (Deck deck : decks) {
            deck.sort();
        }
    }

    /**
     * Adds a deck to the list of decks managed by the factory.
     *
     * @param deck the deck to add to the list of decks
     */
    public void addDeck(Deck deck) {
        decks.add(deck);
    }

    /**
     * Returns the number of decks in the list of decks.
     *
     * @return the number of decks in the list of decks
     */
    public int getDeckCount() {
        return decks.size();
    }
}
