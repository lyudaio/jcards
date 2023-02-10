package io.lyuda.jcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * The {@code Hand} class represents a hand of cards in a card game.
 * This class provides methods to add or remove cards from the hand, as well as to
 * obtain a list of the cards in the hand, get the size of the hand, sort the cards,
 * and find a specific card in the hand.
 *
 * @author lyudaio
 * @since 0.0.1
 */
public class Hand {

    /**
     * The list of cards in this hand.
     */
    private final List<Card> cards;

    /**
     * Constructs a new {@code Hand} with an empty list of cards.
     */
    public Hand() {
        cards = new ArrayList<>();
    }

    /**
     * Constructs a new {@code Hand} with the given list of cards.
     *
     * @param cards the list of cards to include in this hand, must not be {@code null}
     * @throws NullPointerException if the provided list of cards is {@code null}
     */
    public Hand(List<Card> cards) {
        this.cards = Objects.requireNonNull(cards, "Cards cannot be null");
    }

    /**
     * Adds a card to the hand.
     *
     * @param card the card to add, must not be {@code null}
     * @throws NullPointerException if the provided card is {@code null}
     */
    public void addCard(Card card) {
        Objects.requireNonNull(card, "Card cannot be null");
        cards.add(card);
    }

    /**
     * Removes the specified {@link Card} from this {@link Hand}.
     *
     * @param card the card to be removed, must not be {@code null}
     * @return {@code true} if the card was present and removed successfully,
     * {@code false} otherwise
     * @throws NullPointerException if the specified card is {@code null}
     */
    public boolean removeCard(Card card) {
        Objects.requireNonNull(card, "Card cannot be null");
        return cards.remove(card);
    }

    /**
     * Gets the size of this hand.
     *
     * @return the number of cards in this hand
     */
    public int size() {
        return cards.size();
    }

    /**
     * Gets a list of all the cards in this hand.
     *
     * @return a modifiable list of the cards in this hand
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Sorts the cards in this hand.
     *
     * This method uses the Collections framework to sort the cards stored in the `cards` list based on their natural ordering,
     * as determined by the `compareTo()` method implemented in the `Card` class.
     *
     * @see java.util.Collections#sort(java.util.List)
     * @see io.lyuda.jcards.Card#compareTo(io.lyuda.jcards.Card)
     */
    public void sort() {
        Collections.sort(cards);
    }


    /**
     * Finds a card with the specified rank and suit in this hand.
     *
     * @param rank the rank of the card to find
     * @param suit the suit of the card to find
     * @return an {@link Optional} containing the found card, or an empty {@link Optional} if no such card was found
     */
    public Optional<Card> findCard(Card.Rank rank, Card.Suit suit) {
        return cards.stream().filter(c -> c.getRank() == rank && c.getSuit() == suit).findFirst();
    }

    /**
     * Returns a string representation of this hand, listing the rank and suit of each card in the hand.
     * The format of the returned string is "Hand: [Rank1 of Suit1], [Rank2 of Suit2], ... [RankN of SuitN]".
     *
     * @return a string representation of this hand
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hand: ");
        for (Card card : cards) {
            sb.append(card.toString());
            sb.append(", ");
        }
        if (cards.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }

}