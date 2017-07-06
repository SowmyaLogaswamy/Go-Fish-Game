import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class PlayerTest {

  @Test
  public void Player_instantiatesCorrectly_true() {
    Player playerOneTest = new Player();
    assertEquals(true, playerOneTest instanceof Player);
  }

  @Test
  public void Player_startsWithZeroPoints_int() {
    Player playerOneTest = new Player();
    assertEquals(0, playerOneTest.getPoints());
  }

  @Test
  public void Player_hasAStartingHand_int() {
    GoFish myGame = new GoFish();
    ArrayList originalDeck = myGame.addToDeck();
    ArrayList newDeck = myGame.shuffleDeck(originalDeck);


  }
}
