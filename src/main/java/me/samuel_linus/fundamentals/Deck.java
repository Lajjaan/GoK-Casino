package me.samuel_linus.fundamentals;

import java.util.HashMap;
import java.util.Map;

public class Deck {

    Map<CardTypes, Integer> cardValues = new HashMap<>();

    public Deck() {

        cardValues.put(CardTypes.King, 10);
        cardValues.put(CardTypes.Queen, 10);
        cardValues.put(CardTypes.Cracked, 10);
        cardValues.put(CardTypes.Ten, 10);
        cardValues.put(CardTypes.Nine, 9);
        cardValues.put(CardTypes.Eight, 8);
        cardValues.put(CardTypes.Seven, 7);
        cardValues.put(CardTypes.Six, 6);
        cardValues.put(CardTypes.Five, 5);
        cardValues.put(CardTypes.Four, 4);
        cardValues.put(CardTypes.Three, 3);
        cardValues.put(CardTypes.Two, 2);

    }

    public Integer getCardValue(CardTypes cardType) {
        return cardValues.get(cardType);
    }

}
