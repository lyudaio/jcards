package io.lyuda.jcards.game;

import io.lyuda.jcards.Hand;
import io.lyuda.jcards.Card;

/**
 * The Player class represents a player in a card game.
 *
 * This class makes use of the Card and Hand classes to keep track of a player's cards and hand, respectively.
 * It includes methods for adding a card to the player's hand, showing the player's hand, and discarding a card.
 *
 * @author lyudaio
 * @since 0.0.2
 */

public class Player {

    /**
     * The name of the player.
     */
    private String name;

    /**
     * The player's hand, which contains the cards they have in their possession.
     */
    private Hand hand;

    /**
     * Creates a new {@link Player} with the given name.
     *
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    /**
     * Returns the name of the {@link Player}.
     *
     * @return The name of the player.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the player's current {@link Hand}.
     *
     * @return The player's current hand.
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Adds a {@link Card} to the player's hand.
     *
     * @param card The card to add to the hand.
     */
    public void addCard(Card card) {
        hand.addCard(card);
    }

    /**
     * Removes a {@link Card} from the player's {@link Hand}.
     *
     * @param card The card to remove from the hand.
     */
    public void removeCard(Card card) {
        hand.removeCard(card);
    }
}
