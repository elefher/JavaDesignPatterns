package codinginsights.practice.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elefher on 5/21/17.
 */

interface Subject {
  public int getState();

  public void setState(int state);

  public void attach(Observer observer);

  public void dettach(Observer observer);

  public void notifyAllObservers();
}
