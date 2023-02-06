package io.lyuda.jcards;

import java.util.Objects;


/**
 * The {@code Card} class represents a standard playing card with a rank and a suit.
 * This class provides methods to access the rank and suit of a card, as well as to compare
 * cards for equality and to obtain a string representation of a card.
 *
 * @author NullRSJ
 * @since 0.0.1
 */
public class Card {


    /**
     * The rank of the card.
     */
    public enum Rank {
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private final int value;

        /**
         * Constructs a new {@code Rank} with the specified value.
         *
         * @param value the value of the rank
         */
        Rank(int value) {
            this.value = value;
        }

        /**
         * Returns the value of the rank.
         *
         * @return the value of the rank
         */
        public int getValue() {
            return value;
        }
    }

    /**
     * The enumerated type representing the suit of a standard playing card.
     *
     * @author NullRSJ
     * @since 0.0.1
     */
    public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

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
     *         {@code false} otherwise.
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
}
