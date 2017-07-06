import org.junit.*;
import static org.junit.Assert.*;

public class GoFishTest {

  @Test
  public void GoFish_instantiatesCorrectly_true() {
    GoFish myGame = new GoFish();
    assertEquals(true, myGame instanceof GoFish);
  }

}
