package codinginsights.practice.Composite;

/**
 * Created by elefher on 6/4/17.
 */

public class CubLion implements Panthera {

  private String cubName;
  private String prideRank;

  public CubLion(String cubName, String prideRank){
	this.cubName = cubName;
	this.prideRank = prideRank;
  }

  @Override
  public void add(Panthera panthera) {

  }

  @Override
  public void remove(Panthera panthera) {

  }

  @Override
  public Panthera getMemberOfPride(int member) {
	return null;
  }

  @Override
  public String getName() {
	return cubName;
  }

  @Override
  public String getPrideRank() {
	return prideRank;
  }

  public String toString(){
	return cubName + ".";
  }
}
