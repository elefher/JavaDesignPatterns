package codinginsights.practice.Composite;

/**
 * Created by elefher on 6/4/17.
 */

public interface Panthera {
  public void add(Panthera panthera);
  public void remove(Panthera panthera);
  public Panthera getMemberOfPride(int member);
  public String getName();
  public String getPrideRank();
}
