# jCards - A Java Library for Playing Cards

jCards is a Java library for creating and manipulating a deck of playing cards. It is designed to be simple, intuitive, and easy to extend. With jCards, you can quickly and easily create and manipulate a deck of playing cards in your Java projects.

## Features

- Enumerated types for Rank and Suit, providing a convenient and efficient way to represent the various ranks and suits of a deck of cards.
- A `Card` class for representing individual cards, with convenient methods for getting the rank and suit of a card.
- Overridden `toString()` method for easy printing of cards, making it simple to visualize the contents of a deck or individual cards.
- Overridden `hashCode()` and `equals()` methods for efficient collections handling, allowing you to easily add, remove, and manipulate cards within collections.
- The `UnicodeConstants` class serves as a container for Unicode representations of playing card suits and ranks. The class uses enumerations for suits and ranks to improve code readability and reduce the risk of typos.

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

