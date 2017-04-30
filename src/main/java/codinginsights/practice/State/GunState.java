package codinginsights.practice.State;

/**
 * Created by elefher on 4/30/17.
 */

interface GunState {
  public void addBullets(int bullets);
  public void fire();
  public void reload(int bullets);
}
