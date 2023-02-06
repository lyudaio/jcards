# jCards - A Java Library for Playing Cards

jCards is a Java library for creating and manipulating a deck of playing cards. It is designed to be simple, intuitive, and easy to extend. With jCards, you can quickly and easily create and manipulate a deck of playing cards in your Java projects.

## Features

- Enumerated types for Rank and Suit, providing a convenient and efficient way to represent the various ranks and suits of a deck of cards.
- A `Card` class for representing individual cards, with convenient methods for getting the rank and suit of a card.
- Overridden `toString()` method for easy printing of cards, making it simple to visualize the contents of a deck or individual cards.
- Overridden `hashCode()` and `equals()` methods for efficient collections handling, allowing you to easily add, remove, and manipulate cards within collections.

## Getting Started

To use jCards in your project, simply include the latest version of the library in your classpath. You can download the latest version from the releases page on GitHub.

Here is a simple example of how to use jCards:

```java
import io.lyuda.jCards.Card;
import io.lyuda.jCards.Rank;
import io.lyuda.jCards.Suit;

public class Main {
    public static void main(String[] args) {
        Card aceOfSpades = new Card(Rank.ACE, Suit.SPADES);
        System.out.println(aceOfSpades);
    }
}
```

This will output `ACE of SPADES`.

## License

jCards is licensed under the MIT license. This means that you are free to use, modify, and distribute the library for any purpose, as long as you include the license and copyright notice in your distribution.

