
package cardtrickice1;
import java.util.*;


/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author siasonchris ,May 23rd
 */
public class CardTrickICE1 {

   
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
       
        Card luckyCard = new Card(); //card object called luckyCard
        luckyCard.setValue(12);
        luckyCard.setSuits("spades");
       
        Card[] magicHand = new Card[7]; //Array of object
       
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            c1.setValue(Card.getRandomNum());//use a method to generate random *13
            c1.setSuits(Card.getRandom());//random method suit 
            
            
            Card c2 = new Card();
            c2.setValue(Card.getRandomNum());//use a method to generate random *13
            c2.setSuits(Card.getRandom());//random method suit
            magicHand[i] = c2;
            
            Card c3 = new Card();  
            c3.setValue(Card.getRandomNum());//use a method to generate random *13
            c3.setSuits(Card.getRandom());//random method suit
            
            
            Card c4 = new Card();
            c4.setValue(Card.getRandomNum());//use a method to generate random *13
            c4.setSuits(Card.getRandom());//random method suit
            
            
            Card c5 = new Card();
            c5.setValue(Card.getRandomNum());//use a method to generate random *13
            c5.setSuits(Card.getRandom());//random method suit
            
            
            Card c6 = new Card();            
            c6.setValue(Card.getRandomNum());//use a method to generate random *13
            c6.setSuits(Card.getRandom());//random method suit
            
            
            Card c7 = new Card();            
            c7.setValue(Card.getRandomNum());//use a method to generate random *13
            c7.setSuits(Card.getRandom());//random method suit
            
            magicHand[0] = c1;
            magicHand[1] = c2;
            magicHand[2] = c3;
            magicHand[3] = c4;
            magicHand[4] = c5;
            magicHand[5] = c6;
            magicHand[6] = c7;
            
        }
        for(int i = 0; i < magicHand.length; i++){
            System.out.println(magicHand[i].getRandomNum() + " of " + magicHand[i].getRandom());
        }
            
        
        System.out.println("please choose the suit" + "\n1: Hearts" + "\n2: Diamonds" + "\n3: Spades" +"\n4: Clubs");
        int suit = kb.nextInt();
        
        
        System.out.println("please choose the value");
        int value = kb.nextInt();
        
        
        for(int i = 0; i<magicHand.length; i++){
        if(magicHand[i].getRandomNum() == value){
            System.out.println("you have a match");
           
            
        }
        else
            System.out.println("sorry, no match");
           break;
        }
    }
            
        
    }
        
        
       
        
     
        //Christian Siason
        
        //991605619 
    
    

 
