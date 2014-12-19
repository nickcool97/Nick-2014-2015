/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4c.u4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Nick
 */
public class Deck {
//array of all cards
    String[] cards = {"2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s", "Ts", "Js", "Qs", "Ks", "As",
        "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h", "Th", "Jh", "Qh", "Kh", "Ah",
        "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "Tc", "Jc", "Qc", "Kc", "Ac",
        "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "Td", "Jd", "Qd", "Kd", "Ad"};
    ArrayList<String> deck = new ArrayList(Arrays.asList(cards));

    public Deck() {
    }

    public String deal() {
        //pick a random card and print it out and romove it from the deck
        int cardsLeft = deck.size();
        int newCard = (int) (cardsLeft * Math.random() + 0);
        String cardName = deck.get(newCard);
        System.out.println(deck.get(newCard));
        deck.remove(newCard);
        return cardName;
    }
}
