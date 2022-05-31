
package cardtrickice1;
import java.util.Random;

/** define card value and suits
 * 
 *
 * @author siasonc
 */
public class Card 
{
    
    private int value;
    private String suits; //encapsulation
    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};
    public static final int [] VALUE = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   
   
    
   
    
    //method for suits
    public static String getRandom() {
    Random index = new Random();
    int randomSuit = index.nextInt(SUITS.length);
    return SUITS[randomSuit];
    }
    
    //method for value
    public static int getRandomNum() {
    Random index = new Random();
    int randomInt = index.nextInt(VALUE.length);
    return VALUE[randomInt];
    }
   
    
    
    
}
