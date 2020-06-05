/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
import java.util.Scanner;
public class CardGameICE1
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numValue;
        String SuitValue;
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        boolean found=false;
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card();//object
           //  c.setSuits(method random suits);
           c.setSuits(Card.SUITS[c.randomSuit()]);
           //  c.setValue(method to generate random value from 1 to 13);
           c.setValue(c.randomValue());
         
           magicHand[i]=c;//saving object in array
           System.out.println(magicHand[i].getSuits()+" "+magicHand[i].getValue());
        }
        System.out.println("Enter Value");
        numValue=input.nextInt();
        System.out.println("Enter Suit");
        SuitValue=input.next();
        for(Card c:magicHand){
            if((numValue==c.getValue())&&(SuitValue.equals(c.getSuits()))){
            found=true;
            break;
            }
        }
           if(found)
               System.out.println("You Got it");
            else{
            System.out.println("You losse");
        }
    //take input from user and compare with array 
   // value=
       //     suit =
    
    }
    
}
