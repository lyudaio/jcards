package io.lyuda.jcards;

import java.util.Objects;


/**
 * The {@code Card} class represents a standard playing card with a rank and a suit.
 * This class provides methods to access the rank and suit of a card, as well as to compare
 * cards for equality and to obtain a string representation of a card.
 *
 * @author lyudaio
 * @since 0.0.1
 */
public class Card implements Comparable<Card> {
    private final Rank rank;
    private final Suit suit;

    /**
     * Constructs a new {@code Card} with the specified rank and suit.
     *
     * @param rank the rank of the card, cannot be {@code null}
     * @param suit the suit of the card, cannot be {@code null}
     * @throws IllegalArgumentException if rank or suit is {@code null}
     */
    public Card(Rank rank, Suit suit) {
        if (rank == null) {
            throw new IllegalArgumentException("Rank cannot be null");
        }
        if (suit == null) {
            throw new IllegalArgumentException("Suit cannot be null");
        }
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns the rank of the card.
     *
     * @return the rank of the card
     */
    public Rank getRank() {
        return rank;
    }


    /**
     * Returns the suit of the card.
     *
     * @return The suit of the card.
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * This method returns a String representation of an SVG image built from the
     * {@link CardImage} class.
     *
     * @return a String representation of an SVG image.
     * @see CardImage
     */
    public String getSVG() {
        return CardImage.makeCard(suit.getPath(), rank.getPath(), CardImage.Card.CARD.getColor(), suit.getColor());
    }

    /**
     * Returns a string representation of the card.
     * The string representation is of the format "rank of suit".
     *
     * @return a string representation of the card
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }


    /**
     * Overrides the default hashCode method and returns a hash code based on the rank and suit values of this Card.
     *
     * @return an int value representing the hash code of this Card object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }


    /**
     * Compares this card with the specified object for equality.
     * Two cards are considered equal if and only if their rank and suit are equal.
     *
     * @param obj the object to compare with this card
     * @return {@code true} if the specified object is equal to this card,
     * {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Card other)) {
            return false;
        }

        return rank == other.rank && suit == other.suit;
    }

    /**
     * Compares this card with the specified card for order.
     *
     * @param other the card to be compared
     * @return a negative integer, zero, or a positive integer as this card is less than, equal to, or greater than the specified card
     */
    @Override
    public int compareTo(Card other) {
        int rankCompare = Integer.compare(rank.getValue(), other.rank.getValue());
        if (rankCompare != 0) {
            return rankCompare;
        }
        return suit.compareTo(other.suit);
    }
}
