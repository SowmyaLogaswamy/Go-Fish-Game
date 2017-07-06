import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class GoFishTest {


  @Test
  public void GoFish_instantiatesCorrectly_true() {
    GoFish myGame = new GoFish();
    assertEquals(true, myGame instanceof GoFish);
  }

  @Test
  public void GoFish_containsAPlayerObject_true() {
    GoFish myGame = new GoFish();
    assertEquals(true, myGame.getPlayer1() instanceof Player);
  }

  @Test
  public void GoFish_DeckOfFiftyTwo_int() {
    GoFish myGame = new GoFish();
    ArrayList testArray = myGame.addToDeck();
    assertEquals(52, testArray.size());
  }

  @Test
  public void GoFish_ShuffleDeck_false() {
    GoFish myGame = new GoFish();
    ArrayList originalDeck = myGame.addToDeck();
    ArrayList newDeck = myGame.shuffleDeck(originalDeck);
    GoFish secondGame = new GoFish();
    ArrayList originalDeck2 = secondGame.addToDeck();
    assertEquals(false, originalDeck2 == newDeck);
  }

  @Test
  public void GoFish_PlayerOnesTurn_true() {
    GoFish myGame = new GoFish();
    assertEquals(true, myGame.playerOnesTurn());
  }

  @Test
  public void dealOutCards_PlayerOneHasAHand_int() {
    GoFish myGame = new GoFish();
    Player player1 = myGame.getPlayer1();
    ArrayList player1hand = player1.getPlayersHand();
    ArrayList originalDeck = myGame.addToDeck();
    ArrayList newDeck = myGame.shuffleDeck(originalDeck);
    ArrayList player1deck = myGame.dealOutCards(player1hand, newDeck);
    assertEquals(7, player1deck.size());
  }

  @Test
  public void dealOutCards_MasterDeckMinusSeven_int() {
    GoFish myGame = new GoFish();
    Player player1 = myGame.getPlayer1();
    ArrayList player1hand = player1.getPlayersHand();
    ArrayList originalDeck = myGame.addToDeck();
    ArrayList newDeck = myGame.shuffleDeck(originalDeck);
    ArrayList player1deck = myGame.dealOutCards(player1hand, newDeck);
    assertEquals(45, newDeck.size());
  }

  @Test
  public void dealOutCards_PlayerTwoHasUniqueHand_int() {
    GoFish myGame = new GoFish();
    Player player1 = myGame.getPlayer1();
    Player player2 = myGame.getPlayer2();
    ArrayList player1hand = player1.getPlayersHand();
    ArrayList player2hand = player2.getPlayersHand();
    ArrayList originalDeck = myGame.addToDeck();
    ArrayList newDeck = myGame.shuffleDeck(originalDeck);
    ArrayList player1deck = myGame.dealOutCards(player1hand, newDeck);
    ArrayList player2deck = myGame.dealOutCards(player2hand, newDeck);
    assertEquals(7, player2deck.size());
  }

  @Test
  public void dealOutCards_MasterDeckIsThirtyEight_int() {
    GoFish myGame = new GoFish();
    Player player1 = myGame.getPlayer1();
    Player player2 = myGame.getPlayer2();
    ArrayList player1hand = player1.getPlayersHand();
    ArrayList player2hand = player2.getPlayersHand();
    ArrayList originalDeck = myGame.addToDeck();
    ArrayList newDeck = myGame.shuffleDeck(originalDeck);
    ArrayList player1deck = myGame.dealOutCards(player1hand, newDeck);
    ArrayList player2deck = myGame.dealOutCards(player2hand, newDeck);
    assertEquals(38, newDeck.size());
  }

  @Test
  public void addPointForDoubles_PlayersPointIncreases_int() {
    GoFish myGame = new GoFish(); //new GoFish game
    Player player1 = myGame.getPlayer1(); // new player1
    ArrayList player1hand = player1.getPlayersHand(); //empty arraylist
    ArrayList originalDeck = myGame.addToDeck(); // populate master deck
    ArrayList newDeck = myGame.shuffleDeck(originalDeck); //shuffle master deck
    player1hand.add(1);
    player1hand.add(2);
    player1hand.add(3);
    player1hand.add(4);
    player1hand.add(4);
    player1hand.add(6);
    player1hand.add(6);
    //ArrayList player1deck = myGame.dealOutCards(player1hand, newDeck); // player has 7 cards
    int totalPoints = player1.addPointForDoubles();
    assertEquals(2, totalPoints);
  }

}
