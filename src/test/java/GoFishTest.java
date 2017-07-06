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

}
