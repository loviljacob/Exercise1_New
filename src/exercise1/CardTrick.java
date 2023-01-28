package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022
 * @author Lovil Jacob   Jan 26 ,20223
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        for (int i = 0; i < hand.length; i++) {
            Card Rcard = new Card();   // Rcard means Random Card 
            //card.setValue(insert call to random number generator here)
            Rcard.setValue((int)(1+Math.random()*13));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
           Rcard.setSuit(Card.SUITS[(int)(0+Math.random()*3)]);
           hand[i]=Rcard;
           System.out.println(hand[i].getValue()+""+hand[i].getSuit());
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
            Card UserCard=new Card();
            Scanner input1=new Scanner(System.in);
            System.out.println("Enter a number from 1-13 (11-jack,12-Queen,13-King)");
            UserCard.setValue(input1.nextInt());
            Scanner input2= new Scanner(System.in);
            System.out.println("Enter a card suit(Hearts,Diamonds,Spades,Clubs)");
            UserCard.setSuit(input2.nextLine());
            System.out.println(UserCard.getValue()+" "+UserCard.getSuit());
            
            
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
       boolean  guess=false;
       for(int i=0;i<hand.length;i++){
       if(UserCard.getValue()==hand[i].getValue()&&UserCard.getSuit().equals(hand[i].getSuit())){
       guess=true;
    
       } else continue;
       }
       if(guess){
           System.out.println("Match Found");
           printInfo();
       }    else{
       System.out.println("NO MATCH");
       }
    }
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
//        i am done 
        System.out.println("I am Done !");
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Lovil Jacob");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on Software Feild");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
