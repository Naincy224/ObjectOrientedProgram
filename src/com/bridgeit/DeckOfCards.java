package com.bridgeit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class DeckOfCards {

		public static String[][] deck={{"CLUBS","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"},
		{"DIAMONDS","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"},
		{"SPADES","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"},
		{"HEARTS","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","ACE"}};
		
		static int noOfplayers=4;	
		static int numOfcardsToPlayer = 9;
		
		public static void main(String args[])
		{
			int cardIndex = 0;
			
			List<String> cards= suffleCard1(deck);
			
        	String[][] cardsToEachPlayes = new String[noOfplayers][numOfcardsToPlayer];
        		for (int i = 0; i < noOfplayers; i++) {
        			for(int j = 0; j < numOfcardsToPlayer; j++) {
        				cardsToEachPlayes[i][j] = cards.get(cardIndex);
        				cardIndex++;
        			}
        		}
        		print2DArray(cardsToEachPlayes);
		}
		
		public static List<String> suffleCard1(String deck [][]) {
			
			Set<String> deckSet = new HashSet<String>();
	        for(int i=0;i<deck.length;i++) {
	        	String suit=deck[i][0];
	            for(int j=1;j<deck[i].length;j++) {
	            	deckSet.add(suit+":"+deck[i][j]);
	            }
	        }
	        
	        List<String> shuffledCard = new ArrayList<>(deckSet);
			
			for (int i = 1; i < shuffledCard.size(); i++) {
            int r = i + (int) (Math.random() * (shuffledCard.size()-i));
            
            String temp = shuffledCard.get(r);
            shuffledCard.set(r, shuffledCard.get(i));
            shuffledCard.set(i, temp);
        	}
			return shuffledCard;
		}
		
		public static void print2DArray(String cardsToEachPlayes [][]) {

	        for(int i=0;i<cardsToEachPlayes.length;i++) {
	            for(int j=0;j<cardsToEachPlayes[i].length;j++) {
	                System.out.print(cardsToEachPlayes[i][j]+ " ");
	            }
	            System.out.println();
	        }
	    }
		
		
}
