/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modifier Nawaphan Chayopathum, student number: 991511341
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rnd = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int rndValue = rnd.nextInt(12) + 1;
            c.setValue(rndValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int rndSuit = rnd.nextInt(4);
            switch(rndSuit){
                case 0:
                    c.setSuit("Hearts");
                    break;
                case 1:
                    c.setSuit("Diamonds");
                    break;
                case 2:
                    c.setSuit("Spades");
                    break;
                case 3:
                    c.setSuit("Clubs");
                    break;
            }
            magicHand[i] = c;
            
        }
        
        //insert code to ask the user for Card value and suit, create their card
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("Please enter the card suit");
//         String userSuit = input.nextLine();
//         System.out.println("Please enter the card value");
//         int userValue = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(12);
        userCard.setSuit("Clubs");
        
        // and search magicHand here
        boolean check = false;
        for(int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getSuit().equals(userCard.getSuit())){
                if(magicHand[i].getValue() == userCard.getValue()){
                    check = true;
                    break;
                }
            }
        }
        //Then report the result here
        System.out.println("The result is: " + check);
    }
    
}
