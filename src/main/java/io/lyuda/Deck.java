package io.lyuda;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The {@code Deck} class represents a deck of cards. It is used to create and manage a collection of cards.
 *
 * <p>A deck of cards is created with all the possible combinations of suits and ranks, and can
 * be shuffled and dealt from. The deck keeps track of the number of cards remaining and throws
 * an exception if an attempt is made to deal from an empty deck.
 *
 * @author NullRSJ
 * @since 0.0.1
 */
public class Deck {
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
     * Shuffles the deck using a cryptographically secure random number generator.
     */
    public void shuffle() {
        SecureRandom random = new SecureRandom();
        Collections.shuffle(cards, random);
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
     * Returns the number of cards remaining in the deck.
     *
     * @return the number of cards remaining in the deck
     */
    public int cardsRemaining() {
        return cards.size();
    }

    /**
     * Searches the deck for a specific card based on its rank and suit.
     *
     * @param rank the rank of the card to search for
     * @param suit the suit of the card to search for
     * @return the index of the card in the deck, or -1 if the card is not found
     */
    public int findCard(Card.Rank rank, Card.Suit suit) {
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
}
