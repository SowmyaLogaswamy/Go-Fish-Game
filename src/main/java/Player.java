import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class Player {
  private int mPoints;
  private ArrayList<Integer> mPlayersHand = new ArrayList<Integer>();

  public Player() {
    mPoints = 0;
  }

  public int getPoints() {
    return mPoints;
  }

  public ArrayList getPlayersHand() {
    return mPlayersHand;
  }

  public int addPointForDoubles() {
    ArrayList hand = this.getPlayersHand();
    for (int i = 0; i < 14; i++) {
      int occurrences = Collections.frequency(hand, i);
      if (occurrences == 2) {
        this.mPoints += 1;
        hand.removeAll(Collections.singleton(i));
      }
    }
    return getPoints();
  }
}
