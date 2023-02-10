package io.lyuda.jcards;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * The {@code Deck} class represents a deck of cards. It is used to create and manage a collection of cards.
 *
 * <p>A deck of cards is created with all the possible combinations of suits and ranks, and can
 * be shuffled and dealt from. The deck keeps track of the number of cards remaining and throws
 * an exception if an attempt is made to deal from an empty deck.
 *
 * @author lyudaio
 * @since 0.0.1
 */
public class Deck implements Comparable<Deck> {

    /**
     * The `cards` member variable represents a collection of cards in a deck.
     * It is used to store and manage all the cards in the deck.
     * This variable is private and is only accessible within the class.
     */
    private List<Card> cards;

    /**
     * Creates a new deck of cards with all the possible combinations of suits and ranks.
     */
    public Deck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * Shuffles the deck of cards using a cryptographically secure random number generator.
     *
     * @see java.util.Collections#shuffle(List, Random)
     * @see java.security.SecureRandom
     */
    public void shuffle() {
        SecureRandom secureRandom = new SecureRandom();
        long seed = secureRandom.nextLong();
        Collections.shuffle(cards, new Random(seed));
    }

    /**
     * Deals the next card from the deck.
     *
     * @return the next card in the deck
     * @throws IllegalStateException if the deck is empty
     */
    public Card deal() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No more cards in the deck");
        }
        return cards.remove(0);
    }

    /**
     * Searches the deck for a specific card based on its rank and suit.
     *
     * @param rank the rank of the card to search for
     * @param suit the suit of the card to search for
     * @return the index of the card in the deck, or -1 if the card is not found
     */
    public int findCard(Card.Rank rank, Card.Suit suit) {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No more cards in the deck");
        }

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            if (card.getRank() == rank && card.getSuit() == suit) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Searches the deck for a specific rank.
     *
     * @param rank the rank to search for
     * @return a list of the indices of the cards in the deck with the specified rank
     */
    public List<Integer> findCardsByRank(Card.Rank rank) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getRank() == rank) {
                indices.add(i);
            }
        }
        return indices;
    }

    /**
     * Searches the deck for a specific suit.
     *
     * @param suit the suit to search for
     * @return a list of the indices of the cards in the deck with the specified suit
     */
    public List<Integer> findCardsBySuit(Card.Suit suit) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i).getSuit() == suit) {
                indices.add(i);
            }
        }
        return indices;
    }

    /**
     * Gets the number of cards in the deck.
     *
     * @return the number of cards in the deck
     */
    public int getSize() {
        return cards.size();
    }

    /**
     * Gets the card at the specified index in the deck.
     *
     * @param index the index of the desired card
     * @return the card at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range (index (less than) 0 || index >= deck size)
     */
    public Card getCardAtIndex(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("The specified index is out of range: " + index);
        }
        return cards.get(index);
    }

    /**
     * Compares two deck of cards based on their size.
     *
     * @param o the deck to compare to
     * @return a negative integer if this deck has less cards than `o`,
     * zero if this deck has the same number of cards as `o`,
     * or a positive integer if this deck has more cards than `o`.
     */
    @Override
    public int compareTo(Deck o) {
        return Integer.compare(this.cards.size(), o.cards.size());
    }


    /**
     * Retrieves the most up-to-date list of cards stored in the object.
     *
     * @return A list of {@link Card} objects stored in the object, which reflects any changes made to the underlying list.
     *
     * <p> The returned list may be empty, but it will never be
     * {@code null}.
     * @author lyudaio
     * @see Card
     * @since 0.0.3
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Sorts the deck of cards using the {@link Card#compareTo(Card)} method.
     *
     * @see java.util.Collections#sort(List)
     */
    public void sort() {
        Collections.sort(cards);
    }

}
