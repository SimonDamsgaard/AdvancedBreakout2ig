package Model;

import java.util.ArrayList;

public class GenerateCards {

    public static ArrayList<Card> generateCommonCards() {
        ArrayList<Card> commonList = new ArrayList<Card>();
        commonList.add(new Card("+Attack", 1, 0, 0, 0, 0, 0, 0));
        commonList.add(new Card("+Pierce", 0, 0, 1, 0, 0, 0, 0));
        commonList.add(new Card("+Size", 0, 0, 0, 4, 0, 0, 0));
        commonList.add(new Card("+Platform Speed", 0, 0, 0, 0, 1, 0, 0));
        commonList.add(new Card("+Lives", 0, 0, 0, 0, 0, 0, 1));
        return commonList;
    }

    public static ArrayList<Card> generateRareCards() {
        ArrayList<Card> rareList = new ArrayList<Card>();
        rareList.add(new Card("Sniper", 2, 0, 1, 0, 0, 0, 0));
        rareList.add(new Card("+Platform Width", 0, 0, 0, 0, 0, 10, 0));
        rareList.add(new Card("Canonball", 1, 0, 1, 10, 0, 0, 0));
        rareList.add(new Card("++Attack", 2, 0, 0, 0, 0, 0, 0));
        rareList.add(new Card("++Pierce", 0, 0, 1, 0, 0, 0, 0));
        rareList.add(new Card("++Lives", 0, 0, 0, 0, 0, 0, 2));
        return rareList;
    }

    public static ArrayList<Card> generateLegendaryCards() {
        ArrayList<Card> legendaryList = new ArrayList<Card>();
        legendaryList.add(new Card("Rocketman", 3, 0, 2, 0, 0, 0, 0));
        legendaryList.add(new Card("Better Platform", 0, 0, 0, 0, 1, 30, 0));
        legendaryList.add(new Card("Bullet", 5, 1, 1, 1, 0, 0, 0));
        legendaryList.add(new Card("Wreckingball", 0, 0, 3, 2, 1, 0, 0));
        legendaryList.add(new Card("Devil's Deal", 8, 0.3, 0, 0, 0, 0, -2));
        legendaryList.add(new Card("Giant", 0, -0.5, 0, 20, 0, 0, 0));
        return legendaryList;
    }
}