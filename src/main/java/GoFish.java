import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class GoFish {
  private Player mPlayer1;
  private Player mPlayer2;
  private ArrayList<Integer> masterDeck = new ArrayList<Integer>();
  private boolean mPlayerOnesTurn;
  private boolean mGameOver;

  public GoFish() {
    mPlayer1 = new Player();
    mPlayer2 = new Player();
    mPlayerOnesTurn = true;
    mGameOver = false;
  }

  public Player getPlayer1() {
    return mPlayer1;
  }

  public Player getPlayer2() {
    return mPlayer2;
  }

  public boolean playerOnesTurn() {
    return mPlayerOnesTurn;
  }

  public ArrayList addToDeck() {
    for(int i = 1; i < 14; i++) {
      for (int j = 0; j <= 3; ++j) {
        masterDeck.add(i);
      }
    }
    return masterDeck;
  }

  public ArrayList shuffleDeck(ArrayList originalDeck) {
    Collections.shuffle(originalDeck);
    this.masterDeck = originalDeck;
    return masterDeck;
  }

   public ArrayList dealOutCards(ArrayList playerHand, ArrayList masterDeck) {
     for (int i = 0; i < 7; i++) {
       playerHand.add(masterDeck.get(i));
       masterDeck.remove(masterDeck.get(i));
     }
     return playerHand;
   }

   public boolean playerTwoDoYouHave(int number, ArrayList playerTwoHand, ArrayList playerOneHand, ArrayList masterDeck) {
      // player 1 asks player 2
      if (playerTwoHand.contains(number)) { // if the number is present in player 2's hand
        playerTwoHand.remove(number);
        playerOneHand.add(number);
        return true;
      } else { // Go Fish
        playerOneHand.add(masterDeck.get(0));
        masterDeck.remove(masterDeck.get(0));
        // playerOneTurn = false;
        return false;
      }
    }
}
