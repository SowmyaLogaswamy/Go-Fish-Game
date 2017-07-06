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

  public Object getPlayer1() {
    return mPlayer1;
  }

  public Object getPlayer2() {
    return mPlayer2;
  }

  public Object playerOnesTurn() {
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

   public ArrayList dealOutCards(ArrayList deck) {
     for (int i = 0; i <=8; i++) {
       mPlayer1.getPlayersHand().deck;
       deck.remove(i);
     }
     return deck;
   }
}
