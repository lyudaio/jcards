![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/lyudaio/jcards?label=version&style=plastic) ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/lyudaio/jcards?style=plastic) ![GitHub](https://img.shields.io/github/license/lyudaio/jcards?style=plastic) ![GitHub deployments](https://img.shields.io/github/deployments/lyudaio/jcards/github-pages?label=Javadoc%20Deployment&style=plastic)

<p align="center">
  <img src="https://i.imgur.com/5xKGdIw.png" alt="Library Logo" height="200" width="200">
</p>

# jCards - A Lightweight Java Library for manipulating Playing Cards

jCards is a Java library for creating and manipulating a deck of playing cards. It is designed to be simple, intuitive, and easy to extend. With jCards, you can quickly and easily create and manipulate a deck of playing cards in your Java projects while retaining agnosticism towards the type of card game.

## Features

- Enumerated types for Rank and Suit, providing a convenient and efficient way to represent the various ranks and suits of a deck of cards.
- A `Card` class for representing individual cards, with convenient methods for getting the rank and suit of a card.
- Overridden `toString()` method for easy printing of cards, making it simple to visualize the contents of a deck or individual cards.
- Overridden `hashCode()` and `equals()` methods for efficient collections handling, allowing you to easily add, remove, and manipulate cards within collections.
- Shuffles deck of cards using a unique SecureRandom seed each time it is called
- A Player class to represent a player in a card game, providing methods to manage their hand, add and remove cards, and access their name.
- Agnostic design to allow for use in various types of card games.
- <b>DeckFactory</b> class to manage multiple decks at a time.

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

# Documentation

Documentation is automatically generated as Javadocs. We try to keep the library up to Javadoc standards so that the generated documentation is informative. [You can read the Javadocs here](https://lyuda.io).

# Contributing

We welcome and encourage contributions to jCards! Whether you're fixing a bug, adding a new feature, or simply improving the documentation, your help is greatly appreciated.

## Submitting a Pull Request

If you would like to contribute code to jCards, you can do so by submitting a pull request on GitHub.

1. Fork the repository on GitHub.
2. Clone your fork to your local machine.
3. Create a new branch for your changes.
4. Make the necessary changes in the code.
5. Push the changes to your fork on GitHub.
6. Submit a pull request, including a detailed description of your changes and why they are needed.

## Raising an Issue

If you find a bug in jCards, or if you have an idea for a new feature, you can raise an issue on GitHub. When raising an issue, please include a clear and concise description of the problem, and any relevant details such as error messages, screenshots, and/or code snippets.

We look forward to your contributions!


## License

jCards is licensed under the MIT license. This means that you are free to use, modify, and distribute the library for any purpose, as long as you include the license and copyright notice in your distribution.

