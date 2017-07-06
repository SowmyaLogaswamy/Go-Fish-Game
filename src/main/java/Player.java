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

}
